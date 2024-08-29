package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    
    StudentDTO save(StudentDTO student);

    StudentDTO update(StudentDTO student);

    Optional<StudentDTO> findOne(Long id);

    List<StudentDTO> findAll();

    void delete(Long id);
}
