package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.services.dto.AdressDTO;

import java.util.List;
import java.util.Optional;

public interface AdressService {

    AdressDTO save(AdressDTO adress);

    AdressDTO update(AdressDTO adress);

    Optional<AdressDTO> findOne(Long id);

    List<AdressDTO> findAll();

    void delete(Long id);

}
