package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.dto.UserDTO;

public class UserMapper {

    private UserMapper() {
    }

    public static UserDTO toDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setPseudo(user.getPseudo());
        userDTO.setPassword(user.getPassword());
        userDTO.setDateCreation(user.getDateCreation());

        return userDTO;

    }

    public static User toEntity(UserDTO userDTO){
        User user = new User();

        user.setId(userDTO.getId());
        user.setPseudo(userDTO.getPseudo());
        user.setPassword(userDTO.getPassword());
        user.setDateCreation(userDTO.getDateCreation());

        return user;

    }

}
