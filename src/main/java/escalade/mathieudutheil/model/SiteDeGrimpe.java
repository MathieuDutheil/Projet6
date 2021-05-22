package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
@Table(name = "site_de_grimpe")
public class SiteDeGrimpe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "site_de_grimpe_id")
    private Integer siteDeGrimpeId;

    @Column(name = "nom")
    private String nom;

    @Column(name = "descriptif")
    private String descriptif;

    @Column(name = "acces")
    private String acces;

    @Column(name = "tagge_association")
    private Boolean taggeAssociation;

    //Getter and Setters
    public Integer getSiteDeGrimpeId() {
        return siteDeGrimpeId;
    }

    public void setSiteDeGrimpeId(Integer siteDeGrimpeId) {
        this.siteDeGrimpeId = siteDeGrimpeId;
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
}