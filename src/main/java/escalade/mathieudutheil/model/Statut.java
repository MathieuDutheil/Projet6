package escalade.mathieudutheil.model;


import javax.persistence.*;


@Entity
public class Statut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "statutid")
    private Integer statudId;

    @Column(name="statut")
    private String statut;

}