package AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Moto extends Vehicule {
    private String cylindree;
    private Boolean casqueInclus;
    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;
}