package uvsq21921354;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Classe PersonnelsUnchangeable
 *
 */

public class PersonnelsUnchangeable extends Personnels{
	private static final long serialVersionUID = 1L;

	private final String nom;
	private final String prenom;
	
	private final LocalDate dateNaiss;
	private  List<ContactsPersonnels> numT ;
	
	
	public static class Builder{
		
	//PARAMETRE OBLIGATOIRE
		private final String nom;
		private final String prenom;
	//PARAMETRE OPTIONNEL	
		private LocalDate dateNaiss = LocalDate.of (1997, 06, 15);
		private  ArrayList<ContactsPersonnels> numT = new ArrayList<ContactsPersonnels>();
		
		
		public Builder (String nom,String prenom) {
			this.nom=nom;
			this.prenom=prenom;
		}
		
		public Builder dateNaiss(int annee, int mois,int jour) {
			this.dateNaiss= LocalDate.of(annee, mois, jour);
			return this;
		}
		
		public Builder numT(ContactsPersonnels numT) {
			this.numT.add(numT);
			return this;
			
		}
		
		public PersonnelsUnchangeable build() {
			return new PersonnelsUnchangeable(this);
			
		}
	}
	
	private PersonnelsUnchangeable(Builder build) {
		
		nom=build.nom;
		prenom=build.prenom;
		
		dateNaiss=build.dateNaiss;
		numT=build.numT;
		
	}
	
	public String toString() {
		return nom + " " + prenom + " " + " "+ dateNaissanceString()+numT.stream().map(ContactsPersonnels::toString).collect(Collectors.toList());
	}
	
	private String dateNaissanceString() {
		if (dateNaiss == null) return ""; 
		return (dateNaiss.format(DateTimeFormatter.ISO_DATE) + " ");
	}
	
	/**
	 * @return the nom
	 */

	public String getNom() {
		return nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**

	 * @return the dateNaiss

	 */

	public LocalDate getDateNaissance() {
		return dateNaiss;
	}


	/**
	 * @return the NumTelephone
	 */

	public List<ContactsPersonnels> getNumTelephone() {
		return numT;
	}
	
	public void addNumTelephone(ContactsPersonnels numTe) {
		this.numT.add(numTe);
	}
	
	@Override
	public boolean isGroupe() {
		return false;
	}

}
