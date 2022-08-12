package uz.jl.todoapp.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jl.todoapp.todoapp.domains.Todo;

/**
 * @author "Elmurodov Javohir"
 * @since 12/08/22/14:25 (Friday)
 * todoapp/IntelliJ IDEA
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
