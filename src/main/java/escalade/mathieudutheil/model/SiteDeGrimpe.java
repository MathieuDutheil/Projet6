package escalade.mathieudutheil.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "site_de_grimpe")
public class SiteDeGrimpe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "descriptif")
    private String descriptif;

    @Column(name = "acces")
    private String acces;

    @Column(name = "tagge_association")
    private Boolean taggeAssociation;

    @OneToMany(
        cascade = CascadeType.ALL, //Si je supprime le Site de grimpe, cela supprimera les secteurs associés, si je mets à jour pareil
            orphanRemoval = true, //Evite qu'en base de de données il existe des secteur alors que le site de grimpe a été supprimé
            fetch = FetchType.EAGER // lorsqu'on va récupérer le site de grimpe tous les secteurs seront récupérés
    )
    @JoinColumn(name = "site_de_grimpe_id")
    private List<Secteur> secteurs = new ArrayList<>();


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public String getAcces() {
        return acces;
    }

    public void setAcces(String acces) {
        this.acces = acces;
    }

    public Boolean getTaggeAssociation() {
        return taggeAssociation;
    }

    public void setTaggeAssociation(Boolean taggeAssociation) {
        this.taggeAssociation = taggeAssociation;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }


}