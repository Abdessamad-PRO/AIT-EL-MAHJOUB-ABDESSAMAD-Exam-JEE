package AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private Date dateMiseEnService;
    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
    @OneToMany(mappedBy = "vehicule")
    private List<Location> locations;
}
