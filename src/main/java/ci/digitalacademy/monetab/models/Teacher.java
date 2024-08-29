package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "professeur")
@ToString
@DiscriminatorValue(value = "professeur")
public class Teacher extends Person {

    @Column(name = "matiere", nullable = false)
    private String matiere;

    @Column(name = "vacant", nullable = false)
    private String vacant;
}
