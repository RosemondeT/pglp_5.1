package uvsq21921354;

import java.io.Serializable;

/**
 * 
 * Classe ContactsPersonnels implementant Serializable de java
 * Cette classe permet de gérer les contacts du personnel de l'entreprise
 *
 */

public class ContactsPersonnels implements Serializable{
	private String Fonction;
	private int Indicatif;
	private int Numero;
	
	/**
	 * Constructeur de la classe ContactsPersonnels
	 */
	public ContactsPersonnels(){
		
	}
	
	/**
	 * Méthode permet de retourner le numéro d'un personnel de l'entreprise
	 * @return
	 */
	public int getNumero() {
		return Numero;}
	
	/**
	 * Méthode permet de renseigner le numéro d'un personnel de l'entreprise
	 * @param numero
	 */
	public void setNumero(int numero) {
		Numero = numero;}
	
	/**
	 * Méthode permet d'ajouter le contact d'un personnel de l'entreprise
	 * @param fonction
	 * @param indicatif
	 * @param Num
	 * @return
	 */
	public ContactsPersonnels add(String fonction, int indicatif, int Num) {
		this.Fonction = fonction;
		this.Indicatif = indicatif;
		this.Numero = Num;
		return this;
	}
	
	/**
	 * Permet de d'afficher le contact d'un personnel de l'entreprise
	 */
	
	public void afficher() {
		System.out.println("\t Fonction : " +this.Fonction);
		System.out.println("\t\t Indicatif : +"+this.Indicatif);
		System.out.println("\t\t Numero : "+this.Numero);
	}
}
