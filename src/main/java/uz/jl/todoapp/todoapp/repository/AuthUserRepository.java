package uz.jl.todoapp.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jl.todoapp.todoapp.domains.AuthUser;

import java.util.Optional;

/**
 * @author "Elmurodov Javohir"
 * @since 12/08/22/09:17 (Friday)
 * todoapp/IntelliJ IDEA
 */
public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    Optional<AuthUser> findByUsername(String username);
}
