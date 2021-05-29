package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
@Table(name = "secteur")
public class Secteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "temps_de_marche")
    private String tempsDeMarche;

    @Column(name = "altitude")
    private String altitude;

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

    public String getTempsDeMarche() {
        return tempsDeMarche;
    }

    public void setTempsDeMarche(String tempsDeMarche) {
        this.tempsDeMarche = tempsDeMarche;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }
}