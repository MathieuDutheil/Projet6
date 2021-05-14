package escalade.mathieudutheil.model;


import javax.persistence.*;
import java.util.Date;


@Entity
public class Reservation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "reservationid")
    private Integer reservationId;

    @Column(name="datereservation")
    private Date dateReservation;

}