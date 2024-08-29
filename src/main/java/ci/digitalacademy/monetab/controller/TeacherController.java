package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.TeacherService;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
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
@RequestMapping("/teachers")
@RequiredArgsConstructor
@Slf4j
public class TeacherController {

    public final TeacherService teacherService;

    @GetMapping
    public String showTeacherPage(Model model) {
        log.debug("Request to show teachers list");
        List<TeacherDTO> teachers = teacherService.findAll();
        model.addAttribute("teachers" , teachers);

        return "teachers/list";
    }


    @PostMapping
    public String saveTeacher(TeacherDTO teacherDTO){
        log.debug("Request to save teacher :{}", teacherDTO);
        teacherService.save(teacherDTO);
        return "redirect:/teachers";
    }

    @GetMapping("/{id}")
    public String showUpdateTeacherForm(Model model, @PathVariable(name = "id") Long id) {
        log.debug("Rquest to show update teacher forms");
        Optional<TeacherDTO> teacher = teacherService.findOne(id);
        if (teacher.isPresent()){
            model.addAttribute("teacher", teacher.get());
            return "teachers/forms";
        } else {
            return "redirect:/teachers";
        }
    }

    @GetMapping("/add")
    public String showAddTeacherForms(Model model) {
        log.debug("Request to show add teacher forms");
        model.addAttribute("teacher", new Teacher());
        return "teachers/forms";
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable(name = "id") Long id) {
        try {
            teacherService.delete(id); // Appelle la méthode de suppression dans le service
            return new ResponseEntity<>("Teacher deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting teacher", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
