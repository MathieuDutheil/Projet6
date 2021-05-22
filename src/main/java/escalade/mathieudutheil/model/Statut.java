package escalade.mathieudutheil.model;


import javax.persistence.*;


@Entity
@Table(name = "statut")
public class Statut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statut_id")
    private Integer statudId;

    @Column(name = "statut")
    private String statut;

    //Getter and Setter
    public Integer getStatudId() {
        return statudId;
    }

    public void setStatudId(Integer statudId) {
        this.statudId = statudId;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}