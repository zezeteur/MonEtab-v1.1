package ci.digitalacademy.monetab.services.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {

    private Long id;

    private String nom;

    private String prenom;

    private String genre;

    private String dateNaissance;

    private String email;

    private String telephone;
}
