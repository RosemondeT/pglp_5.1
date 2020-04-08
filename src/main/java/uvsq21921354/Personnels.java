package uvsq21921354;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * 
 * Classe personels qui hérite de la classe AbstractPersonnel
 *
 */
public class Personnels extends AbstractPersonnel implements Serializable{
	private String Nom;
	private String Prenom;
	private String Fonction;
	private LocalDate dateNaissance;
	private ArrayList<ContactsPersonnels> Numero;
	
	/**
	 * 
	 * Classe Builder
	 *
	 */
	
	public static class Builder{
		private String Nom;
		private String Prenom;
		private String Fonction;
		private java.time.LocalDate dateNaissance;	
		private ArrayList<ContactsPersonnels> Numero = new ArrayList<ContactsPersonnels>();	
		
		/**
		 * Constructeur de la classe Builder
		 * @param Nom
		 * @param Prenom
		 * @param Fonction
		 * @param dateNaissance
		 */
		public Builder(String Nom, String Prenom, String Fonction, LocalDate dateNaissance) {
			this.Nom = Nom;
			this.Prenom = Prenom;
			this.Fonction = Fonction;
			this.dateNaissance = dateNaissance;
		}
		
		/**
		 * Méthode Numero
		 * @param Numero
		 * @return
		 */
		public Builder Numero(ContactsPersonnels Numero) {
			this.Numero.add(Numero);
			return this	;
		}
		
		/**
		 * Méthode Personnels 
		 * @return
		 */
		public Personnels build() {
			return new Personnels(this);
		}
	}
	
	/**
	 * Constructeur de la classe Personnels
	 * @param builder
	 */
	public Personnels(Builder builder) {
		this.Nom = builder.Nom;
		this.Prenom = builder.Prenom;
		this.dateNaissance = builder.dateNaissance;
		this.Numero = builder.Numero;
	}
	
	/**
	 * Redefinition de la méthode affichageProfondeur() qui se trouve 
	 * dans la classe AbstrcatPersonnel
	 */

	@Override
	public void affichageProfondeur() {
		System.out.println("Nom : "+Nom);
		System.out.println("Prenom : "+Prenom);
		System.out.println("Fonction : "+Fonction);
		System.out.println("Date de Naissance : "+dateNaissance);
		for(ContactsPersonnels num : this.Numero) {
			num.afficher();}
	}
	
	/**
	 * Rédefinition de la méthode affichageLargeur() qui se trouve dans la classe AbstractPersonnel
	 */
	@Override
	public void affichageLargeur() {	
	}

}
