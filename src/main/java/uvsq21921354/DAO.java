package uvsq21921354;

import java.sql.Connection;

/**
 * 
 *Classe DAO dans laquelle on a définit des opérations de CRUD
 *
 * @param <P>
 */
public abstract class DAO<P> {
protected Connection connect ;
	
	public abstract P create(P obj);
	public abstract P find(String id);
	public abstract P update(P obj);
	public abstract void delete(P obj);

}
