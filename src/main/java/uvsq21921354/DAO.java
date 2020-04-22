package uvsq21921354;

/**
 * Interface CRUD
 *
 * @param <T>
 */
public interface DAO<T> {

	T create(T obj);
	T read(String id);
	T update(T obj);
	void delete(T obj);
}
