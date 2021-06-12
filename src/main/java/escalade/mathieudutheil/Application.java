package escalade.mathieudutheil;


import escalade.mathieudutheil.model.*;
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

    @Autowired
    private StatutService statutService;

    @Autowired
    private CotationService cotationService;

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
        Optional<Civilite> optCivilite3 = civiliteService.getCiviliteById(3);
        Civilite civiliteId3 = optCivilite3.get();
        System.out.println(civiliteId3.getId() + " " + civiliteId3.getCivilite());

        // Récupère l'id 1 du parent SiteDeGrimpe et l'affiche ainsi que les site de grimpes associés
        Optional<SiteDeGrimpe> optSiteDeGrimpe = siteDeGrimpeService.getSiteDeGrimpeById(1);
        SiteDeGrimpe siteDeGrimpeId1 = optSiteDeGrimpe.get();
        System.out.println(siteDeGrimpeId1.getNom());
        siteDeGrimpeId1.getSecteurs().forEach(
                secteur -> System.out.println(secteur.getNom()));


        // Récupère l'id 1 du parent Secteur et l'affiche ainsi que les voies associés
        Optional<Secteur> optSecteur = secteurService.getSecteurById(1);
        Secteur secteurId1 = optSecteur.get();
        System.out.println(secteurId1.getNom());
        secteurId1.getVoies().forEach(
                voie -> System.out.println("voie = " + voie.getNom())
        );

        // Récupère l'id 2 de Civilité et l'affiche ainsi que les grimpeurs associé
        Optional<Civilite> optCivilite2 = civiliteService.getCiviliteById(2);
        Civilite civiliteId2 = optCivilite2.get();
        System.out.println(civiliteId2.getId() + civiliteId2.getCivilite());
        civiliteId2.getGrimpeurs().forEach(
                grimpeur -> System.out.println("Grimpeur = " + grimpeur.getPrenom() + " " + grimpeur.getNom())
        );

        // Récupère l'id 2 de statut et l'affiche ainsi que les réservation associés
        Optional<Statut> optStatut2 = statutService.getStatutById(2);
        Statut statutId2 = optStatut2.get();
        System.out.println(statutId2.getId() + statutId2.getStatut());
        statutId2.getReservations().forEach(reservation -> System.out.println(reservation.getId() + " " + reservation.getDateReservation()));


        //Récupère l'id 3 de cotation et l'affiche ainsi que les voies associés
        Optional<Cotation> optCotation3 = cotationService.getCotationById(3);
        Cotation cotationId3 = optCotation3.get();
        System.out.println(cotationId3.getId()+" "+cotationId3.getCotation());
        cotationId3.getVoies().forEach(voie -> System.out.println(voie.getId()+" " + voie.getNumero()+" "+ voie.getNom()));

        Optional<Grimpeur> optionalGrimpeur= grimpeurService.getGrimpeurById(1);
        Grimpeur grimpeurId1 = optionalGrimpeur.get();
        grimpeurId1.getCommentaires().forEach(commentaire -> System.out.println(commentaire.getId()+commentaire.getId()+commentaire.getCommentaire()));
        /*//Ajouter un site de grimpe
        siteDeGrimpeService.getSiteDeGrimpes().forEach(
                siteDeGrimpe -> System.out.println(siteDeGrimpe.getNom()));

        SiteDeGrimpe newSiteDeGrimpe = new SiteDeGrimpe();
        newSiteDeGrimpe.setNom("Coco l'asticot");
        newSiteDeGrimpe.setDescriptif("Un ver de terre tout mignon");
        newSiteDeGrimpe.setAcces("Dans la terre pardi");
        newSiteDeGrimpe.setTaggeAssociation(false);

        newSiteDeGrimpe = siteDeGrimpeService.saveSiteDeGrimpe(newSiteDeGrimpe);

        siteDeGrimpeService.getSiteDeGrimpes().forEach(
                siteDeGrimpe -> System.out.println(siteDeGrimpe.getNom()));*/

    }
}
