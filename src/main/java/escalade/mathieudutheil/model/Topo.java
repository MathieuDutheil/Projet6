package escalade.mathieudutheil.model;


import javax.persistence.*;
import java.util.Date;


@Entity
public class Topo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "topoid")
    private Integer topoId;

    @Column(name="nom")
    private String nom;

    @Column(name="description")
    private String description;

    @Column(name="lieu")
    private String lieu;

    @Column(name="datedeparution")
    private Date dateDeParution;

    @Column(name="disponible")
    private Boolean disponible;


}