package uvsq21921354;



public class PersonnelsSerializableDAO extends SerializableDAO<PersonnelsUnchangeable> {
	public String getFilename(String id) {
		return id + ".personnelsUnchangeable";
	}

	public String getFilename(PersonnelsUnchangeable objet) {
		return getFilename(objet.getNom());

	}

	


}
