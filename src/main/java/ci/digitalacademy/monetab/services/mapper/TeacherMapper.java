package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import ci.digitalacademy.monetab.models.Teacher;

public class TeacherMapper {


    private TeacherMapper(){}

    public static TeacherDTO toDto(Teacher teacher) {
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(teacher.getId());
        teacherDTO.setNom(teacher.getNom());
        teacherDTO.setPrenom(teacher.getPrenom());
        teacherDTO.setGenre(teacher.getGenre());
        teacherDTO.setDateNaissance(teacher.getDateNaissance());
        teacherDTO.setEmail(teacher.getEmail());
        teacherDTO.setTelephone(teacher.getTelephone());

        teacherDTO.setMatiere(teacher.getMatiere());
        teacherDTO.setVacant(teacher.getVacant());
        return teacherDTO;
    }

    public static Teacher toEntity(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher();

        teacher.setId(teacherDTO.getId());
        teacher.setNom(teacherDTO.getNom());
        teacher.setPrenom(teacherDTO.getPrenom());
        teacher.setGenre(teacherDTO.getGenre());
        teacher.setDateNaissance(teacherDTO.getDateNaissance());
        teacher.setEmail(teacherDTO.getEmail());
        teacher.setTelephone(teacherDTO.getTelephone());

        teacher.setMatiere(teacherDTO.getMatiere());
        teacher.setVacant(teacherDTO.getVacant());

        return teacher;
    }

}
