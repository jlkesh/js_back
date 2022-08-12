package uz.jl.todoapp.todoapp.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author "Elmurodov Javohir"
 * @since 12/08/22/14:21 (Friday)
 * todoapp/IntelliJ IDEA
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String title;

    private boolean completed;

    @CreationTimestamp
    @CreatedDate
    @Column(columnDefinition = "timestamp default now()")
    private LocalDateTime createdAt;

    private LocalDateTime deadLine;

}
