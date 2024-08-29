package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_personne")
@Table(name = "personne")
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_personne")
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "dateNaissance", nullable = false)
    private String dateNaissance;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "telephone", nullable = false)
    private String telephone;
}
