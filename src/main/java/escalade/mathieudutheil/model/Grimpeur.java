package escalade.mathieudutheil.model;


import javax.persistence.*;


@Entity
public class Grimpeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "grimpeurid")
    private Integer grimpeurId;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="email")
    private String email;

    @Column(name="motdepasse")
    private String motDePasse;

    @Column(name="telephone")
    private String telephone;

    @Column(name="membreassociation")
    private Boolean membreAssociation;

}