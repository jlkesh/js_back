package uz.jl.todoapp.todoapp.service.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uz.jl.todoapp.todoapp.config.security.AuthUserDetails;
import uz.jl.todoapp.todoapp.domains.AuthUser;
import uz.jl.todoapp.todoapp.repository.AuthUserRepository;

import java.util.function.Supplier;

/**
 * @author "Elmurodov Javohir"
 * @since 12/08/22/09:14 (Friday)
 * todoapp/IntelliJ IDEA
 */
@Service("userDetailsService")
@RequiredArgsConstructor
public class AuthService implements UserDetailsService {
    private final AuthUserRepository authUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<RuntimeException> userNotyFoundSupplier = () -> {
            throw new UsernameNotFoundException("User not found");
        };
        AuthUser authUser = authUserRepository.findByUsername(username).orElseThrow(userNotyFoundSupplier);
        return new AuthUserDetails(authUser);
    }
}
