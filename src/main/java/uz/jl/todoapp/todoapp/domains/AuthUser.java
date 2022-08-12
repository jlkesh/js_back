package uz.jl.todoapp.todoapp.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author "Elmurodov Javohir"
 * @since 12/08/22/09:15 (Friday)
 * todoapp/IntelliJ IDEA
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;


    public static enum UserRole {
        ADMIN, USER, MANAGER
    }
}
