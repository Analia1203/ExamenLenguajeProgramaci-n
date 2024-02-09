package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Subject;

public class Prueba01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("examen_01");
		EntityManager sub = factory.createEntityManager();
		
		Query query = sub.createQuery("SELECT s FROM Subject s");
		List<Subject> rolList = (List<Subject>) query.getResultList();
		for (Subject su: rolList) {
			System.out.println(su.getIdSubject());
			System.out.println(su.getSubject());
			System.out.println(su.getCredits());
			
		}
		
	}

}

