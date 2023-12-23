package baykov.daniel.sociallogin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "auth_provider")
public class AuthProvider extends BaseEntity {

    @Column(length = 50, nullable = false)
    private String providerName;

    @ManyToMany(mappedBy = "providers")
    private Set<User> user;
}
