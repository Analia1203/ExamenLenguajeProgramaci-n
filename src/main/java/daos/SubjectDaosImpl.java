package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Subject;

public class SubjectDaosImpl implements SubjectDao{
	
	EntityManagerFactory factory;
	EntityManager sub;
	
	public SubjectDaosImpl(){
		factory = Persistence.createEntityManagerFactory("examen_01");
		sub = factory.createEntityManager();
	}
	@Override
	public void create(Subject subject) {
		// TODO Auto-generated method stub
		sub.getTransaction().begin();
		sub.persist(subject);
		sub.getTransaction().commit();
		
	}

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		try {
		sub.getTransaction().begin();
		sub.merge(subject);
		sub.getTransaction().commit();
		} catch (Exception e) {
			sub.getTransaction().rollback();
		}
	}

	@Override
	public void delete(Subject subject) {
		// TODO Auto-generated method stub
		sub.getTransaction().begin();
		sub.remove(subject);
		sub.getTransaction().commit();
	}

	@Override
	public Subject find(Integer id) {
		// TODO Auto-generated method stub
		return sub.find(Subject.class, id);
	}

	@Override
	public List<Subject> findAll() {
		// TODO Auto-generated method stub
		Query query = sub.createNamedQuery("Subject.findAll");
		List<Subject> lista = query.getResultList();
		return lista;
	}

}
