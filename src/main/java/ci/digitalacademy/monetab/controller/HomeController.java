package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.StudentService;
import ci.digitalacademy.monetab.services.TeacherService;
import ci.digitalacademy.monetab.services.UserService;
import ci.digitalacademy.monetab.services.dto.StudentDTO;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import ci.digitalacademy.monetab.services.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("home")
@RequiredArgsConstructor
public class HomeController {

    public final StudentService studentService;
    public final TeacherService teacherService;
    public final UserService userService;

    @GetMapping
    public String home(Model model){

        List<StudentDTO> students = studentService.findAll();
        model.addAttribute("students" , students);

        List<TeacherDTO> teachers = teacherService.findAll();
        model.addAttribute("teachers" , teachers);

        List<UserDTO> users = userService.findAll();
        model.addAttribute("users" , users);

        return "home/index";
    }
}