package uvsq21921354;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

import uvsq21921354.AbstractDAOFactory.DAOType;

/**
 * 
 * Classe de Teste SerializableTest
 *
 */

public class SerializableTest {

	
		private PersonnelsUnchangeable personne;
		private Groupe groupe;
		
		@Before()
		public void init() {
			personne = new PersonnelsUnchangeable.Builder("Japhet", "Traoré").dateNaiss(1995,05,03).numT(new ContactsPersonnels("75638000","70758427","76606028")).build();
			groupe = new Groupe();
			Groupe groupe1 = new Groupe();
			groupe.addPersonnel(groupe1);
			groupe.addPersonnel(personne);
		}
		
		/**
		 * Méthode serializablePersonnelsTest()
		 */
		
		@Test()
		public void serializablePersonnelsTest() {
			PersonnelsUnchangeable personne1 = null;
			ObjectOutputStream outp;
			ObjectInputStream intp;
			try {
				outp = new ObjectOutputStream(new FileOutputStream("ResultatSerializable.txt"));
				intp = new ObjectInputStream(new FileInputStream("ResultatSerializable.txt"));
				try {
					outp.writeObject(personne1);
					personne1 = (PersonnelsUnchangeable) intp.readObject();
				} catch (ClassNotFoundException | IOException e) {
					e.printStackTrace();
				} finally {
					outp.close();
					intp.close();
				}
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			assertNotEquals(personne, personne1);
		}
		
		
		/**
		 * Méthode serializableGroupeTest()
		 */
		@Test()
		public void serializableGroupeTest() {
			Groupe perg = null;
			ObjectOutputStream outp;
			ObjectInputStream intp;
			try {
				outp = new ObjectOutputStream(new FileOutputStream("ResultatSerializable.txt"));
				intp = new ObjectInputStream(new FileInputStream("ResultatSerializable.txt"));
				try {
					outp.writeObject(groupe);
					perg = (Groupe) intp.readObject();
				} 
				catch (ClassNotFoundException | IOException e) {
					e.printStackTrace();
				} 
				finally {
					outp.close();
					intp.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			assertNotEquals(groupe, perg);
		}
		
		
		/**
		 * Méthode PersonnelsCRUDTest()
		 */
		@Test()
		public void PersonnelsCRUDTest() {
			DAO<PersonnelsUnchangeable> pI = AbstractDAOFactory.getFactory(DAOType.Serial).getPersonnelDAO();
			pI.delete(personne); // Supprime le fichier s'il existe déjà
			pI.create(personne);
			personne.addNumTelephone(new ContactsPersonnels("75638000","70758427","76606028"));
			pI.update(personne);
			assertNotEquals(personne, pI.read(personne.getNom()));

		}
		
		
		/**
		 * Méthode GroupeCRUDTest()
		 */
		@Test()
		public void GroupeCRUDTest() {
			DAO<Groupe> pegr = DAOFactory.getFactory(DAOType.Serial).getPersonnelGroupeDAO();
			pegr.delete(groupe); // Supprime le fichier s'il existe déjà
			pegr.create(groupe);
			groupe.addPersonnel(personne);
			pegr.update(groupe);
			assertNotEquals(groupe, pegr.read(groupe.getId()));
		}

}
