package uvsq21921354;



public class DAOFactory extends AbstractDAOFactory {

	//
	@Override
	public DAO<PersonnelsUnchangeable> getPersonnelDAO() {
		return new PersonnelsSerializableDAO();
	}

	@Override
	public DAO<Groupe> getPersonnelGroupeDAO() {
		return new GroupeSerializableDAO();
	}

}
