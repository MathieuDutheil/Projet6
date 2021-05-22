package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
@Table(name = "civilite")
public class Civilite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "civilite_id")
    private Integer civiliteId;

    @Column(name = "civilite")
    private String civilite;

    //Getter and Setter
    public Integer getCiviliteId() {
        return civiliteId;
    }

    public void setCiviliteId(Integer civiliteId) {
        this.civiliteId = civiliteId;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }
}