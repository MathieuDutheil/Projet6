package escalade.mathieudutheil.model;


import javax.persistence.*;


@Entity
public class SiteDeGrimpe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "sitedegrimpeid")
    private Integer siteDeGrimpeId;

    @Column(name="nom")
    private String nom;

    @Column(name="descriptif")
    private String descriptif;

    @Column(name="acces")
    private String acces;

    @Column(name="taggeassociation")
    private Boolean taggeAssociation;


}