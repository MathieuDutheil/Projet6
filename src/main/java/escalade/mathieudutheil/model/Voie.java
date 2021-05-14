package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
public class Voie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "voieid")
    private Integer voieId;

    @Column(name="numero")
    private Integer numero;

    @Column(name="name")
    private String name;

    @Column(name="remarques")
    private String remarques;

    @Column(name="nombreslongueur")
    private Integer nombresLongueur;

    @Column(name="voieequipee")
    private Boolean voieEquipee;
}