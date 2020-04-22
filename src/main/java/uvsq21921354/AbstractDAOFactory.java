package uvsq21921354;

/**
 * 
 * classe AbstractDAOFactory
 *
 */

public abstract class AbstractDAOFactory {
	public enum DAOType {JDBC, Serial};
	public abstract DAO<PersonnelsUnchangeable> getPersonnelDAO();
	public abstract DAO<Groupe> getPersonnelGroupeDAO();

	public static AbstractDAOFactory getFactory(DAOType type) {
		if (type == DAOType.Serial) return new DAOFactory();
		return null;
	}

}
