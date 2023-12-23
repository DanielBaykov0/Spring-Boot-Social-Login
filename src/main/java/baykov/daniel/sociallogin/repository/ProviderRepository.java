package baykov.daniel.sociallogin.repository;

import baykov.daniel.sociallogin.entity.AuthProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProviderRepository extends JpaRepository<AuthProvider, Integer> {
    Optional<AuthProvider> findByProviderName(String registrationId);
}

