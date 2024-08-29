package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.UserService;
import ci.digitalacademy.monetab.services.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    public final UserService userService;

    @GetMapping
    public String showUserPage(Model model) {
        List<UserDTO> users = userService.findAll();
        model.addAttribute("users", users);
        return "users/list";
    }
    @PostMapping
    public String saveUser(UserDTO user){
        log.debug("Request to save user :{}", user);
        userService.save(user);
        return "redirect:/users";
    }

    //    Pour afficher le formulaire de modification
    @GetMapping("/{id}")
    public String showUpdateUserForm(Model model, @PathVariable(name = "id") Long id) {
        log.debug("Rquest to show update teacher forms");
        Optional<UserDTO> user = userService.findOne(id);
        if (user.isPresent()){
            model.addAttribute("user", user.get());
            return "users/forms";
        } else {
            return "redirect:/users";
        }
    }

    @GetMapping("/add")
    public String showAddUserPage(Model model) {
        log.debug("Request to show add user forms");
        model.addAttribute("user", new User());
        return "users/forms";
    }

    //    Pour supprimer un element dans la table
    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable(name = "id") Long id) {
        try {
            userService.delete(id); // Appelle la méthode de suppression dans le service
            return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting user", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
