package escalade.mathieudutheil.model;


import javax.persistence.*;


@Entity
public class Civilite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "civiliteid")
    private Integer civiliteId;

    @Column(name="civilite")
    private String civilite;

}