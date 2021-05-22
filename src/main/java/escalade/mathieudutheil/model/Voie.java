package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
@Table(name = "voie")
public class Voie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voie_id")
    private Integer voieId;

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

    //Getter and Setters
    public Integer getVoieId() {
        return voieId;
    }

    public void setVoieId(Integer voieId) {
        this.voieId = voieId;
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