package academic;

public class Evaluation {
	
	private Student student;
	private float grade;
	private Subject subject;
	
	public Evaluation(Student student, float grade, Subject subject) throws Exception {
		
		if (grade >= 0 && grade <= 10) {
			this.student = student;
			this.grade = grade;
			this.subject = subject;
		}else {
			throw new Exception("Não pôde ser inicializado");
		}
		
	}

	public Student getStudent() {
		return student;
	}

	public float getGrade() {
		return grade;
	}

	public Subject getSubject() {
		return subject;
	}
}
