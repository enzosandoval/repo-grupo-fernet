package ar.edu.unju.fi.tp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Team Fernet
 * 
 * Enzo Aramayo https://github.com/enzosandoval
 * Andrés Chaile https://github.com/andres777c
 * Gabriel Matías Sardina https://github.com/matiasard
 * Gabriel Molina https://github.com/gabrielmol92
 * 
 */
@Component
@SpringBootApplication
public class RepoGrupoFernetApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RepoGrupoFernetApplication.class, args);
	}
	
	/**
	 * 
	 * @return La página de inicio
	 */
	@GetMapping("/")
	public String getPage() {
		return "index";
	}

}
