package baykov.daniel.sociallogin.repository;

import baykov.daniel.sociallogin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(Role.RoleEnum name);
}
