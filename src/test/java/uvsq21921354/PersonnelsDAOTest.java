package uvsq21921354;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * Classe de teste PersonnelsDAOTest qui permet de tester les méthodes de la classe PersonnelsDAO
 *
 */
public class PersonnelsDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void createTest() throws IOException {
		Personnels personne = new Personnels.Builder("Nom", "Prenom", "Fonction", null).build();
		PersonnelsDAO persDAO = new PersonnelsDAO();
		persDAO.create(personne);
	}

	@Test
	public void findTest() {
		
	}
	
	@Test
	public void updateTest() {
		
	}
	
	@Test
	public void deleteTest() {
		
	}
}