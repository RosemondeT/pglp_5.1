package uvsq21921354;

import uvsq21921354.AbstractDAOFactory.DAOType;

/**
 * 
 * Classe qui contient le main
 *
 */

public enum MainSerializable {
ENVIRONNEMENT;
	
	private void run(String[] args, DAOType dt) {
		DAO<PersonnelsUnchangeable> personnel = AbstractDAOFactory
				.getFactory(dt) // Factory
				.getPersonnelDAO();
		DAO<Groupe> groupe1DAO =AbstractDAOFactory
				.getFactory(dt)
				.getPersonnelGroupeDAO();
		
		/**
		 * Création du personnel
		 */
				PersonnelsUnchangeable Rosemonde = new PersonnelsUnchangeable.Builder("Rosemonde", "Sanou").build();
				PersonnelsUnchangeable  Japhet = new PersonnelsUnchangeable.Builder("Japhet", "Traoré").build();
				Groupe groupe1 = new Groupe();
				Groupe groupe2 = new Groupe();
				groupe1.addPersonnel(groupe2);
				groupe1.addPersonnel(Rosemonde);
				groupe2.addPersonnel(Japhet);
				
				
				/**
				 * Ajout du DAO
				 */
				groupe1DAO.create(groupe1);
				groupe1DAO.create(groupe2);
				personnel.create(Rosemonde); // update
				personnel.create(Japhet); // update
				System.out.println("\t" + groupe1DAO.read(groupe2.getId()));
				System.out.println("\t" + personnel.read("Japhet"));
	}
	
	public static void main(String[] args) {
		
		 ENVIRONNEMENT.run(args, DAOType.Serial);
		
	}

}
