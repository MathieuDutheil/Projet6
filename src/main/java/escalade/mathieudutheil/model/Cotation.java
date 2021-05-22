package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
@Table(name = "cotation")
public class Cotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cotation_id")
    private Integer cotationId;

    @Column(name = "cotation")
    private String cotation;

    //Getter and Setter
    public Integer getCotationId() {
        return cotationId;
    }

    public void setCotationId(Integer cotationId) {
        this.cotationId = cotationId;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }
}
