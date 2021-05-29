package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
@Table(name = "voie")
public class Voie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "name")
    private String name;

    @Column(name = "remarques")
    private String remarques;

    @Column(name = "nombres_longueur")
    private Integer nombresLongueur;

    @Column(name = "voie_equipee")
    private Boolean voieEquipee;


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public Integer getNombresLongueur() {
        return nombresLongueur;
    }

    public void setNombresLongueur(Integer nombresLongueur) {
        this.nombresLongueur = nombresLongueur;
    }

    public Boolean getVoieEquipee() {
        return voieEquipee;
    }

    public void setVoieEquipee(Boolean voieEquipee) {
        this.voieEquipee = voieEquipee;
    }
}