package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.dto.StudentDTO;

public class StudentMapper {

    private StudentMapper(){}

    public static StudentDTO toDto(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setNom(student.getNom());
        studentDTO.setPrenom(student.getPrenom());
        studentDTO.setGenre(student.getGenre());
        studentDTO.setDateNaissance(student.getDateNaissance());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setTelephone(student.getTelephone());

        studentDTO.setMatricule(student.getMatricule());
        studentDTO.setClasse(student.getClasse());
        return studentDTO;
    }

    public static Student toEntity(StudentDTO studentDTO) {
        Student student = new Student();

        student.setId(studentDTO.getId());
        student.setNom(studentDTO.getNom());
        student.setPrenom(studentDTO.getPrenom());
        student.setGenre(studentDTO.getGenre());
        student.setDateNaissance(studentDTO.getDateNaissance());
        student.setEmail(studentDTO.getEmail());
        student.setTelephone(studentDTO.getTelephone());

        student.setMatricule(studentDTO.getMatricule());
        student.setClasse(studentDTO.getClasse());

        return student;
    }

}
