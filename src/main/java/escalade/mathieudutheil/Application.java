package escalade.mathieudutheil;


import escalade.mathieudutheil.model.Civilite;
import escalade.mathieudutheil.service.CiviliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CiviliteService civiliteService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Iterable<Civilite> civilites = civiliteService.getCivilites();
        civilites.forEach(civilite -> System.out.println(civilite.getCivilite()) );
        Optional<Civilite> optionalCivilite = civiliteService.getCiviliteById(1);
        Civilite civiliteId1 = optionalCivilite.get();
        System.out.println(civiliteId1.getCivilite());
    }
}
