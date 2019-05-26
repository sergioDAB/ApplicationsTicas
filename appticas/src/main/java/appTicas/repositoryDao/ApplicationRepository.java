package appTicas.repositoryDao;

import appTicas.models.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<ApplicationEntity,Long> {

    @SuppressWarnings("Unchecked")
    ApplicationEntity save(ApplicationEntity app);


}
