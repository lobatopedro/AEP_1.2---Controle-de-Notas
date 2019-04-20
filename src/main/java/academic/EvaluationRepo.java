package academic;

import java.util.ArrayList;
import java.util.List;

public class EvaluationRepo {
	
	private List<Evaluation> evaluations = new ArrayList<Evaluation>();
	
	public void addEvaluation(Evaluation evaluation) {
		
		evaluations.add(evaluation);
	}
	
	public Student[] getApproved(Subject subject) {
		
		List<Student> students = getListStudents();
		Student[] approved = new Student[10];
		
		int i = 0; 
		for(Student student : students) {
			float sum = 0;
			
			//Student student;
			for(Evaluation evaluation : evaluations) {
				if(student.getRa()== evaluation.getStudent().getRa() && subject == evaluation.getSubject()){
					sum += evaluation.getGrade();
				}
			}
			if(sum/4 > 6) {
				approved[i] = student;
				i++;
			}
		}
		
		return approved;
		
	}
	
	private List<Student> getListStudents() {
		List<Student> listStudents = new ArrayList<Student>();
		for (Evaluation evaluation : evaluations) {
			
			Student aux = evaluation.getStudent();
			int equal = 0; 
			for (Student student : listStudents) {
				if (student == aux) {
					equal = 1;
				}
			}
			if (equal == 0) {
				listStudents.add(aux);
			}
		}
		
		return listStudents;
	}
}
