package uvsq21921354;

/**
 * 
 *classe GroupeSerializableDAO
 *
 */

public class GroupeSerializableDAO extends SerializableDAO<Groupe>{
	public String getFilename(String id) {
		return id + ".pg";
	}

	
	public String getFilename(Groupe objet) {
		return getFilename(objet.getId());
	}

}
