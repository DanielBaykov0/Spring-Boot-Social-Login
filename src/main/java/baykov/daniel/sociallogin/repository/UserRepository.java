package baykov.daniel.sociallogin.repository;

import baykov.daniel.sociallogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailIgnoreCase(String email);

    Boolean existsByEmailIgnoreCase(String email);
}
