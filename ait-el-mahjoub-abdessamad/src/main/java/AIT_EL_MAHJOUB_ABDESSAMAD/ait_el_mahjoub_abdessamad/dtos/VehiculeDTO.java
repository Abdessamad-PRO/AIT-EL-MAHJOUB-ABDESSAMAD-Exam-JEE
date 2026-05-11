package AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.dtos;

import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Agence;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Location;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.StatusVehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
public abstract class VehiculeDTO {
    private String type_vehicule;
}
