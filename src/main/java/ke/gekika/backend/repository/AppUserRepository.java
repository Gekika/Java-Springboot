package ke.gekika.backend.repository;

import ke.gekika.backend.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    Boolean existsByEmail(String email);
}
