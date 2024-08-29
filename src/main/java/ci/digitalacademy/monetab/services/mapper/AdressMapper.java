package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Adress;
import ci.digitalacademy.monetab.services.dto.AdressDTO;

public final class AdressMapper {

    private AdressMapper() {
    }

    public static AdressDTO toDto(Adress adress) {
        AdressDTO adressDTO = new AdressDTO();
        adressDTO.setId(adress.getId());
        adressDTO.setPays(adress.getPays());
        adressDTO.setVille(adress.getVille());
        adressDTO.setRue(adress.getRue());
        return adressDTO;
    }

    public static Adress toEntity(AdressDTO adressDTO) {
        Adress adress = new Adress();
        adress.setId(adressDTO.getId());
        adress.setPays(adressDTO.getPays());
        adress.setVille(adressDTO.getVille());
        adress.setRue(adressDTO.getRue());
        return adress;
    }

}
