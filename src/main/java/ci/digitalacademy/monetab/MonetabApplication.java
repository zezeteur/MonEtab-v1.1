package ci.digitalacademy.monetab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		/*
		Eleve eleve = new Eleve();
		eleve.setMatricule("E2024001");
		eleve.setNom("Dibi");
		eleve.setPrenom("Ange Herve");
		eleve.setGenre("M");
		eleve.setClasse("Tle D1");
		eleve.setAge("18");
		eleve.setTelephone("0173809750");
		eleve.setEmail("hervedibi29@gmail.com");

		eleveService.save(eleve);



		Teacher teacher2 = new Teacher();
		teacher2.setNom("Konan");
		teacher2.setPrenom("Jacques");
		teacher2.setMatiere("Mathematiques");
		teacher2.setAge("52");
		teacher2.setGenre("M");
		teacher2.setTelephone("0708226231");
		teacher2.setEmail("konanjak@gmail.com");
		teacher2.setVacant(false);


		professeurService.save(teacher2);


		User user = new User();
		user.setPseudo("admin");
		user.setPassword("admin");
		user.setCreationDate(Instant.now());


		userService.save(user);

*/
	}

}



