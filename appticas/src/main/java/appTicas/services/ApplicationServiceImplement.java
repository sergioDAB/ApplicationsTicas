package appTicas.services;

import appTicas.models.ApplicationEntity;
import appTicas.repositoryDao.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImplement implements  ApplicationService{

    @Autowired
    protected ApplicationRepository applicationRepository;


    @Override
    public ApplicationEntity save(ApplicationEntity app) {
        return  this.applicationRepository.save(app);
    }
}
