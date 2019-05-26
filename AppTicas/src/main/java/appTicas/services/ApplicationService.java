package appTicas.services;

import appTicas.models.Application;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApplicationService {
    private List<Application> aplications = new ArrayList<Application>(Arrays.asList(
            new Application("app1","dev1","cat1","desc1"),
            new Application("app2","dev2","cat2","desc2")
    ));

    public List<Application> getAllAplications(){
        return aplications;
    }

}
