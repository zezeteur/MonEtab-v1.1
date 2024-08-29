package ci.digitalacademy.monetab.services.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO extends PersonDTO{


    private String matiere;

    private String vacant;
}
