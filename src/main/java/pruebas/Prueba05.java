package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaosImpl;
import model.Subject;

public class Prueba05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectDao dao = new SubjectDaosImpl();
		Subject sub = dao.find(4);
		
		dao.delete(sub);
		
		List<Subject> subjectList = dao.findAll();
		
		for(Subject s:subjectList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
	}

}
