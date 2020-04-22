package uvsq21921354;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 
 * Classe Groupe qui hérite de Personnels
 *
 */

public class Groupe extends Personnels{

	private static final long serialVersionUID = 1L;
	
	private final List<Personnels> personnelList;
	private UUID id;
	
	public Groupe() {
		personnelList = new ArrayList<Personnels>();
		id = UUID.randomUUID();
	}
	
	public Groupe(String id) {
		personnelList = new ArrayList<Personnels>();
		this.id = UUID.fromString(id);
	}
	
	public void addPersonnel(Personnels p) {
		personnelList.add(p);
	}
	
	public List<Personnels> getAllPersonnel() {
		return personnelList;
	}
	
	public String getId() {
		return id.toString();
	}
	
	
	@Override
	public boolean isGroupe() {
		
		return false;
	}
	
	public String toString() {
		return "PersonnelGroupe [personnelList=" + personnelList + ", id=" + id + "]";
	}

}
