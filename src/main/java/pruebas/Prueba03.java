package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaosImpl;
import model.Subject;

public class Prueba03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectDao dao = new SubjectDaosImpl();
		
		Subject sub = new Subject();
		sub.setSubject("Jose Luis");
		sub.setCredits("4");
		
		dao.create(sub);
		
		List<Subject> subjectList = dao.findAll();
		
		for(Subject s:subjectList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
	}

}
