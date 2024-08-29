package ci.digitalacademy.monetab.models;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "eleve")
@ToString
@DiscriminatorValue(value = "eleve")
public class Student extends Person {

    @Column(name = "matricule", nullable = false)
    private String matricule;

    @Column(name = "classe", nullable = false)
    private String classe;
}