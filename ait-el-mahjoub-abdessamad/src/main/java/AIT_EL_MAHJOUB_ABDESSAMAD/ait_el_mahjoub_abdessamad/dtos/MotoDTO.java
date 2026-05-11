package AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.dtos;

import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Agence;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Location;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Vehicule;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.StatusVehicule;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.TypeMoto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
public class MotoDTO extends VehiculeDTO {
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private Date dateMiseEnService;
    private String cylindree;
    private Boolean casqueInclus;
    private TypeMoto typeMoto;
}