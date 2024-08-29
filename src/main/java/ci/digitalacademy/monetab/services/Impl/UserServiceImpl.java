package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
import ci.digitalacademy.monetab.services.dto.UserDTO;
import ci.digitalacademy.monetab.services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDTO save(UserDTO userDTO) {
        log.debug("Request to save: {}", userDTO);
        User user = UserMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return UserMapper.toDto(user);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        log.debug("Request to update user {} ", userDTO);
//        Pour modifier quelques element de la table
        return findOne(userDTO.getId()).map(existingUse -> {
            existingUse.setPseudo(userDTO.getPseudo());
            existingUse.setPassword(userDTO.getPassword());
            existingUse.setDateCreation(userDTO.getDateCreation());
            return save(existingUse);
        }).orElseThrow(() -> new IllegalArgumentException());

    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        return userRepository.findById(id).map(user -> {
            return UserMapper.toDto(user);
        });

    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(user -> {
            return UserMapper.toDto(user);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete user {} ", id);
        userRepository.deleteById(id);
    }
}
