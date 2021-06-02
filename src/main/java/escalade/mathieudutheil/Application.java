package escalade.mathieudutheil;


import escalade.mathieudutheil.model.Civilite;
import escalade.mathieudutheil.model.Grimpeur;
import escalade.mathieudutheil.model.Secteur;
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

        // Lectures de données
        // Récupère toutes les civilité et les affiches
        Iterable<Civilite> civilites = civiliteService.getCivilites();
        civilites.forEach(civilite -> System.out.println(civilite.getId() + " " + civilite.getCivilite()));

        // Récupère l'id 3 de la table civilite et l'affiche
        Optional<Civilite> optCivilite = civiliteService.getCiviliteById(3);
        Civilite civiliteId3 = optCivilite.get();
        System.out.println(civiliteId3.getId() + " " + civiliteId3.getCivilite());

        // Récupère l'id 1 du parent SiteDeGrimpe et l'affiche
        Optional<SiteDeGrimpe> optSiteDeGrimpe = siteDeGrimpeService.getSiteDeGrimpeById(1);
        SiteDeGrimpe siteDeGrimpeId1 = optSiteDeGrimpe.get();
        System.out.println(siteDeGrimpeId1.getNom());
        // Récupère l'enfant Secteur de l'id 1 du SiteDeGrimpe et l'affiche
        siteDeGrimpeId1.getSecteurs().forEach(
                secteur -> System.out.println(secteur.getNom()));


        // Récupère l'id 1 du parent Secteur et l'affiche
        Optional<Secteur> optSecteur = secteurService.getSecteurById(1);
        Secteur secteurId1 = optSecteur.get();
        System.out.println(secteurId1.getNom());
        // Récupère l'enfant Voie de l'id 1 du Secteur et l'affiche
        secteurId1.getVoies().forEach(
                voie -> System.out.println(voie.getNom())
        );

    }
}
