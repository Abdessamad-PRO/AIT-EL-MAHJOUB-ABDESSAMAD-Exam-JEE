package AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.dtos;

import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Vehicule;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.BoiteVitesse;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.TypeCarburant;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
public class VoitureDTO extends VehiculeDTO {
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private Date dateMiseEnService;
    private Integer nombrePortes;
    private TypeCarburant typeCarburant;
    private BoiteVitesse boiteVitesse;
}