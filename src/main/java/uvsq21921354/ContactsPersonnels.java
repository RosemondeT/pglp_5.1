package uvsq21921354;

import java.io.Serializable;

/**
 * La classe ContactsPersonnels qui implemente Serializable
 *
 */

public class ContactsPersonnels implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	public String NumPro;
	public String NumPort;
	public String NumPer;
	
	
	public ContactsPersonnels(String NumPro,String NumPort, String NumPer) {
		this.NumPro=NumPro;
		this.NumPort=NumPort;
		this.NumPer=NumPer;
	}
	
	public ContactsPersonnels() {
		
	}
	public String toString() {
		return NumPro + " - " + NumPort + " - " + NumPer;
	}
	
	public void setNumeroProf(String NumPro) {
		this.NumPro=NumPro;
	}
	
	public void setNumeroPort(String NumPort) {
		this.NumPort=NumPort;
	}
	
	public void setNumeroPer(String NumPer) {
		this.NumPer=NumPer;
	}

	
}
