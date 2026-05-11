package AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad;

import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Agence;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Location;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Moto;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.entities.Voiture;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.BoiteVitesse;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.StatusVehicule;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.TypeCarburant;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.enums.TypeMoto;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.repositories.AgenceRepository;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.repositories.LocationRespository;
import AIT_EL_MAHJOUB_ABDESSAMAD.ait_el_mahjoub_abdessamad.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class AitElMahjoubAbdessamadApplication {

	public static void main(String[] args) {
		SpringApplication.run(AitElMahjoubAbdessamadApplication.class, args);
	}
	@Bean
	CommandLineRunner start(AgenceRepository agenceRepository,
							VehiculeRepository vehiculeRepository,
							LocationRespository locationRepository) {
		return args -> {
			Stream.of("Agence Atlas", "Agence Sahara", "Agence Nord").forEach(name -> {
				Agence agence = new Agence();
				agence.setNom(name);
				agence.setVille(name.contains("Atlas") ? "Marrakech" : "Tanger");
				agence.setAdresse("Quartier " + name);
				agence.setTelephone("0522" + (int)(Math.random() * 900000));
				agenceRepository.save(agence);
			});
			agenceRepository.findAll().forEach(agence -> {
				Voiture voiture = new Voiture();
				voiture.setMarque("Dacia");
				voiture.setModele("Stepway");
				voiture.setMatricule(UUID.randomUUID().toString().substring(0, 8));
				voiture.setPrixParJour(350.0);
				voiture.setStatut(StatusVehicule.DISPONIBLE);
				voiture.setDateMiseEnService(new java.util.Date());
				voiture.setNombrePortes(5);
				voiture.setTypeCarburant(TypeCarburant.DIESEL);
				voiture.setBoiteVitesse(BoiteVitesse.MANUELLE);
				voiture.setAgence(agence);
				vehiculeRepository.save(voiture);
				Moto moto = new Moto();
				moto.setMarque("Kawasaki");
				moto.setModele("Z900");
				moto.setMatricule(UUID.randomUUID().toString().substring(0, 8));
				moto.setPrixParJour(600.0);
				moto.setStatut(StatusVehicule.DISPONIBLE);
				moto.setDateMiseEnService(new java.util.Date());
				moto.setCylindree("900cc");
				moto.setTypeMoto(TypeMoto.SPORTIVE);
				moto.setCasqueInclus(true);
				moto.setAgence(agence);
				vehiculeRepository.save(moto);
			});
			vehiculeRepository.findAll().forEach(vehicule -> {
				for (int i = 0; i < 10; i++) {
					Location location = new Location();
					location.setDateDebut(new java.util.Date());
					location.setDateFin(new java.util.Date());
					location.setMontantTotal(vehicule.getPrixParJour() * 3);
					location.setVehicule(vehicule);
					locationRepository.save(location);
				}
			});

			System.out.println("Données de test insérées avec succès !");
		};
	}
}
