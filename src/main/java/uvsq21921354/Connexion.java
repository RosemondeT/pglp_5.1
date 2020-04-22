package uvsq21921354;

import java.time.LocalDateTime;

/**
 * 
 * Classe connexion qui implémente InterfaceConnexion
 *
 */
public class Connexion implements InterfaceConnexion {
	public void write(String string) {
		System.out.println(LocalDateTime.now() + ": " + string);
	}

}
