package escalade.mathieudutheil;


import escalade.mathieudutheil.model.Civilite;
import escalade.mathieudutheil.model.Grimpeur;
import escalade.mathieudutheil.model.SiteDeGrimpe;
import escalade.mathieudutheil.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CiviliteService civiliteService;

    @Autowired
    private GrimpeurService grimpeurService;

    @Autowired
    SiteDeGrimpeService siteDeGrimpeService;

    @Autowired
    private SecteurService secteurService;

    @Autowired
    private VoieService voieService;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
       /* Iterable<Civilite> civilites = civiliteService.getCivilites();
        civilites.forEach(civilite -> System.out.println(civilite.getCivilite()));

        Optional<Civilite> optCivilite = civiliteService.getCiviliteById(3);
        Civilite civiliteId3 = optCivilite.get();
        System.out.println(civiliteId3.getId() + " " + civiliteId3.getCivilite());

        Iterable<Grimpeur> grimpeurs = grimpeurService.getGrimpeurs();
        grimpeurs.forEach(grimpeur -> System.out.println(grimpeur.getNom() + " " + grimpeur.getPrenom() + " " + grimpeur.getEmail()));

        Optional<Grimpeur> optGrimpeur = grimpeurService.getGrimpeurById(1);
        Grimpeur grimpeurId1 = optGrimpeur.get();
        System.out.println(grimpeurId1.getMembreAssociation());*/

        Optional<SiteDeGrimpe> optSiteDeGrimpe = siteDeGrimpeService.getSiteDeGrimpeById(1);
        SiteDeGrimpe siteDeGrimpeId1 = optSiteDeGrimpe.get();

        System.out.println(siteDeGrimpeId1.getNom());

        siteDeGrimpeId1.getSecteurs().forEach(
                secteur -> System.out.println(secteur.getNom()));


    }
}
