package ci.digitalacademy.monetab.services.dto;

import ci.digitalacademy.monetab.models.Adress;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;

@Getter
@Setter
public class UserDTO {

    private Long id;

    private String pseudo;

    private String password;

    private Instant dateCreation = Instant.now();

    private Adress adress;
}
