package escalade.mathieudutheil.model;


import javax.persistence.*;


    @Entity
    public class Cotation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name= "cotationid")
        private Integer cotationId;

        @Column(name="cotation")
        private String cotation;

}
