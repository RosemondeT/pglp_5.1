package uvsq21921354;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 *	Classe Composite qui permet de regrouper le personnel en groupe et de les afficher
 *
 */
public class Composite extends AbstractPersonnel implements Serializable{
	
	private ArrayList< AbstractPersonnel> groupe = new ArrayList< AbstractPersonnel>();
	
	/**
	 * Constructeur de la classe Composite
	 */
	public Composite() {
		
	};
	
	/**
	 * Redefinition de la méthode affichageProfondeur()
	 */
	@Override
	public void affichageProfondeur() {
		Iterator it = groupe.iterator();
		while(it.hasNext()) {
			 AbstractPersonnel ag = ( AbstractPersonnel) it.next();
			ag.affichageProfondeur();
		}
}
	/**
	 * Redefinition de la méthode affichageLargeur() 
	 */
	
	@Override
	public void affichageLargeur() {	
	}
	
	public void add(AbstractPersonnel gr) {
		this.groupe.add(gr);
	}
}