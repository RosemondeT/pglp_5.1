package uvsq21921354;

import java.io.Serializable;

/**
 * 
 *Classe AbstractPersonnel possède deux méthodes à savoir affichageProfondeur() et affichageLargeur()
 *elle implémente Serializable de java qui permet de rendre la classe sérialisable
 *
 */

public abstract class AbstractPersonnel implements Serializable{
	

	public abstract void affichageProfondeur();
	public abstract void affichageLargeur();

}
