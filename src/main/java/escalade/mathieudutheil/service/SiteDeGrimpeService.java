package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.SiteDeGrimpe;
import escalade.mathieudutheil.repository.SiteDeGrimpeRepository;
import jdk.vm.ci.code.site.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SiteDeGrimpeService {

    @Autowired
    private SiteDeGrimpeRepository siteDeGrimpeRepository;

    public Iterable<SiteDeGrimpe> getSiteDeGrimpes(){
        return siteDeGrimpeRepository.findAll();
    }

    public Optional<SiteDeGrimpe> getSiteDeGrimpeById(Integer id) {
        return siteDeGrimpeRepository.findById(id);
    }
}
