package escalade.mathieudutheil.model;


import javax.persistence.*;


@Entity
public class Secteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "secteurid")
    private Integer secteurId;

    @Column(name="nom")
    private String nom;

    @Column(name="tempsdemarche")
    private String tempsDeMarche;

    @Column(name="altitude")
    private String altitude;
}