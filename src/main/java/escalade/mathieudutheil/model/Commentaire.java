package escalade.mathieudutheil.model;


import javax.persistence.*;


@Entity
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "commentaireid")
    private Integer commentaireId;

    @Column(name="commentaire")
    private String commentaire;

}