package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
@Table(name = "grimpeur")
public class Grimpeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grimpeur_id")
    private Integer grimpeurId;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "mot_de_passe")
    private String motDePasse;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "membre_association")
    private Boolean membreAssociation;

    //Getter and Setter
    public Integer getGrimpeurId() {
        return grimpeurId;
    }

    public void setGrimpeurId(Integer grimpeurId) {
        this.grimpeurId = grimpeurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getMembreAssociation() {
        return membreAssociation;
    }

    public void setMembreAssociation(Boolean membreAssociation) {
        this.membreAssociation = membreAssociation;
    }
}