package AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.dtos;

import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Vehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data

public class LocationDTO {
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private Double montantTotal;
    private Vehicule vehicule;
}