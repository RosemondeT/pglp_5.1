package uvsq21921354;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Classe PersonnelsDAO qui hérite de la classe DAO
 * Cette classe implémente les opération CRUD
 *
 */
public class PersonnelsDAO extends DAO<Personnels> implements Serializable{
	public static List<Personnels> pers = new ArrayList<>();
	public String dataFile = "dataPersonne.txt";
	ObjectOutputStream out;
	
	/**
	 * Constructeur de la classe PersonnelsDAO
	 * @throws IOException
	 */
	public PersonnelsDAO() throws IOException {
		this.out = new ObjectOutputStream(
						new BufferedOutputStream(
							new FileOutputStream(dataFile)));
	}
	
	/**
	 * Implémentation de la méthode create
	 */
	@Override
	public Personnels create(Personnels obj) {
		pers.add(obj);
		try {
			out.writeObject(obj) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(obj);
		return obj;
	}
	
	/**
	 * Implémentation de la méthode find
	 */
	@Override
	public Personnels find(String id) {
	return null;
	}
	
	/**
	 * Implémentation de la méthde update
	 */
	@Override
	public Personnels update(Personnels obj) {
		return obj;
	}
	
	/**
	 * Implémentation de la méthode delete
	 */
	@Override
	public void delete(Personnels obj) {}


}
