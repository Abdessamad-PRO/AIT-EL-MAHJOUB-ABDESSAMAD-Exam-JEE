package AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.mappers;

import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.dtos.*;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Agence;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Moto;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Voiture;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Location;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LocationMapperImpl {
        public AgenceDTO fromAgence(Agence agence) {
            if (agence == null) return null;
            AgenceDTO agenceDTO = new AgenceDTO();
            BeanUtils.copyProperties(agence, agenceDTO);
            return agenceDTO;
        }

        public Agence fromAgenceDTO(AgenceDTO agenceDTO) {
            if (agenceDTO == null) return null;
            Agence agence = new Agence();
            BeanUtils.copyProperties(agenceDTO, agence);
            return agence;
        }

        public VoitureDTO fromVoiture(Voiture voiture) {
            if (voiture == null) return null;
            VoitureDTO voitureDTO = new VoitureDTO();
            BeanUtils.copyProperties(voiture, voitureDTO);
            voitureDTO.setType_vehicule("VOITURE");
            return voitureDTO;
        }

        public Voiture fromVoitureDTO(VoitureDTO voitureDTO) {
            if (voitureDTO == null) return null;
            Voiture voiture = new Voiture();
            BeanUtils.copyProperties(voitureDTO, voiture);
            return voiture;
        }

        public MotoDTO fromMoto(Moto moto) {
            if (moto == null) return null;
            MotoDTO motoDTO = new MotoDTO();
            BeanUtils.copyProperties(moto, motoDTO);
            motoDTO.setType_vehicule("MOTO");
            return motoDTO;
        }

        public Moto fromMotoDTO(MotoDTO motoDTO) {
            if (motoDTO == null) return null;
            Moto moto = new Moto();
            BeanUtils.copyProperties(motoDTO, moto);
            return moto;
        }

        public LocationDTO fromLocation(Location location) {
            if (location == null) return null;
            LocationDTO locationDTO = new LocationDTO();
            BeanUtils.copyProperties(location, locationDTO);
            return locationDTO;
        }

        public Location fromLocationDTO(LocationDTO locationDTO) {
            if (locationDTO == null) return null;
            Location location = new Location();
            BeanUtils.copyProperties(locationDTO, location);
            return location;
        }
}

