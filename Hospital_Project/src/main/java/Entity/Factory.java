package Entity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {
	
static 	EntityManagerFactory emf ;
	
	public static EntityManagerFactory factory() {
		if(emf==null) {
			return Persistence.createEntityManagerFactory("hospital");
			
		}
		return emf;
	}
	public static void close() {
		emf.close();
	}

}
