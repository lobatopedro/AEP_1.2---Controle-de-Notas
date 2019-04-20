package academic;

public class App {
	
	public static void main(String[] args) throws Exception {
		
		Student pedro = new Student(1749, "Pedro");
		Student beatriz = new Student(1750, "Beatriz");
		Student camila = new Student(1751, "Camila");
		Student guilherme = new Student(1752, "Guilherme");
		Student joao = new Student(1753, "João");
		Student isabela = new Student(1754, "Isabela");
		Student mariana = new Student(1755, "Mariana");
		Student diego = new Student(1756, "Diego");
		Student rafael = new Student(1757, "Rafael");
		Student yasmin = new Student(1758, "Yasmin");
		
		Subject programming = new Subject("Programming");
		Subject algorithms = new Subject("Algorithms");
		Subject softwareEngineering = new Subject("Software Engineering");
		Subject dataStructures = new Subject("Data Structures");
		Subject webDevelopment = new Subject("Web Development");
		
		EvaluationRepo repository = new EvaluationRepo();
		
		repository.addEvaluation(new Evaluation(pedro, 6, programming));
		repository.addEvaluation(new Evaluation(pedro, 7, programming));
		repository.addEvaluation(new Evaluation(pedro, 8, programming));
		repository.addEvaluation(new Evaluation(pedro, 10, programming));
		
		repository.addEvaluation(new Evaluation(beatriz, 4, programming));
		repository.addEvaluation(new Evaluation(beatriz, 5, programming));
		repository.addEvaluation(new Evaluation(beatriz, 7, programming));
		repository.addEvaluation(new Evaluation(beatriz, 3, programming));
		repository.addEvaluation(new Evaluation(beatriz, 6, programming));
		
		repository.addEvaluation(new Evaluation(camila, 10, programming));
		repository.addEvaluation(new Evaluation(camila, 8, programming));
		repository.addEvaluation(new Evaluation(camila, 8, programming));
		repository.addEvaluation(new Evaluation(camila, 7, programming));
		repository.addEvaluation(new Evaluation(camila, 9, programming));
		
		repository.addEvaluation(new Evaluation(guilherme, 7, programming));
		repository.addEvaluation(new Evaluation(guilherme, 7, programming));
		repository.addEvaluation(new Evaluation(guilherme, 7, programming));
		repository.addEvaluation(new Evaluation(guilherme, 7, programming));
		repository.addEvaluation(new Evaluation(guilherme, 7, programming));
		
		repository.addEvaluation(new Evaluation(joao, 9, programming));
		repository.addEvaluation(new Evaluation(joao, 9, programming));
		repository.addEvaluation(new Evaluation(joao, 9, programming));
		repository.addEvaluation(new Evaluation(joao, 9, programming));
		repository.addEvaluation(new Evaluation(joao, 9, programming));
		
		repository.addEvaluation(new Evaluation(isabela, 6, programming));
		repository.addEvaluation(new Evaluation(isabela, 6, programming));
		repository.addEvaluation(new Evaluation(isabela, 7, programming));
		repository.addEvaluation(new Evaluation(isabela, 8, programming));
		repository.addEvaluation(new Evaluation(isabela, 7, programming));
		
		repository.addEvaluation(new Evaluation(mariana, 7, programming));
		repository.addEvaluation(new Evaluation(mariana, 8, programming));
		repository.addEvaluation(new Evaluation(mariana, 8, programming));
		repository.addEvaluation(new Evaluation(mariana, 8, programming));
		repository.addEvaluation(new Evaluation(mariana, 7, programming));
		
		repository.addEvaluation(new Evaluation(diego, 6, programming));
		repository.addEvaluation(new Evaluation(diego, 6, programming));
		repository.addEvaluation(new Evaluation(diego, 6, programming));
		repository.addEvaluation(new Evaluation(diego, 9, programming));
		repository.addEvaluation(new Evaluation(diego, 7, programming));
		
		repository.addEvaluation(new Evaluation(rafael, 8, programming));
		repository.addEvaluation(new Evaluation(rafael, 8, programming));
		repository.addEvaluation(new Evaluation(rafael, 8, programming));
		repository.addEvaluation(new Evaluation(rafael, 8, programming));
		repository.addEvaluation(new Evaluation(rafael, 8, programming));
		
		repository.addEvaluation(new Evaluation(yasmin, 9, programming));
		repository.addEvaluation(new Evaluation(yasmin, 10, programming));
		repository.addEvaluation(new Evaluation(yasmin, 6, programming));
		repository.addEvaluation(new Evaluation(yasmin, 7, programming));
		repository.addEvaluation(new Evaluation(yasmin, 7, programming));
		
		//algorithms
		
		repository.addEvaluation(new Evaluation(pedro, 6, algorithms));
		repository.addEvaluation(new Evaluation(pedro, 7, algorithms));
		repository.addEvaluation(new Evaluation(pedro, 8, algorithms));
		repository.addEvaluation(new Evaluation(pedro, 10, algorithms));
		
		repository.addEvaluation(new Evaluation(beatriz, 4, algorithms));
		repository.addEvaluation(new Evaluation(beatriz, 5, algorithms));
		repository.addEvaluation(new Evaluation(beatriz, 7, algorithms));
		repository.addEvaluation(new Evaluation(beatriz, 3, algorithms));
		repository.addEvaluation(new Evaluation(beatriz, 6, algorithms));
		
		repository.addEvaluation(new Evaluation(camila, 10, algorithms));
		repository.addEvaluation(new Evaluation(camila, 8, algorithms));
		repository.addEvaluation(new Evaluation(camila, 8, algorithms));
		repository.addEvaluation(new Evaluation(camila, 7, algorithms));
		repository.addEvaluation(new Evaluation(camila, 9, algorithms));
		
		repository.addEvaluation(new Evaluation(guilherme, 7, algorithms));
		repository.addEvaluation(new Evaluation(guilherme, 7, algorithms));
		repository.addEvaluation(new Evaluation(guilherme, 7, algorithms));
		repository.addEvaluation(new Evaluation(guilherme, 7, algorithms));
		repository.addEvaluation(new Evaluation(guilherme, 7, algorithms));
		
		repository.addEvaluation(new Evaluation(joao, 5, algorithms));
		repository.addEvaluation(new Evaluation(joao, 5, algorithms));
		repository.addEvaluation(new Evaluation(joao, 4, algorithms));
		repository.addEvaluation(new Evaluation(joao, 5, algorithms));
		repository.addEvaluation(new Evaluation(joao, 4, algorithms));
		
		repository.addEvaluation(new Evaluation(isabela, 6, algorithms));
		repository.addEvaluation(new Evaluation(isabela, 6, algorithms));
		repository.addEvaluation(new Evaluation(isabela, 7, algorithms));
		repository.addEvaluation(new Evaluation(isabela, 8, algorithms));
		repository.addEvaluation(new Evaluation(isabela, 7, algorithms));
		
		repository.addEvaluation(new Evaluation(mariana, 7, algorithms));
		repository.addEvaluation(new Evaluation(mariana, 8, algorithms));
		repository.addEvaluation(new Evaluation(mariana, 8, algorithms));
		repository.addEvaluation(new Evaluation(mariana, 8, algorithms));
		repository.addEvaluation(new Evaluation(mariana, 7, algorithms));
		
		repository.addEvaluation(new Evaluation(diego, 6, algorithms));
		repository.addEvaluation(new Evaluation(diego, 6, algorithms));
		repository.addEvaluation(new Evaluation(diego, 6, algorithms));
		repository.addEvaluation(new Evaluation(diego, 9, algorithms));
		repository.addEvaluation(new Evaluation(diego, 7, algorithms));
		
		repository.addEvaluation(new Evaluation(rafael, 8, algorithms));
		repository.addEvaluation(new Evaluation(rafael, 8, algorithms));
		repository.addEvaluation(new Evaluation(rafael, 8, algorithms));
		repository.addEvaluation(new Evaluation(rafael, 8, algorithms));
		repository.addEvaluation(new Evaluation(rafael, 8, algorithms));
		
		repository.addEvaluation(new Evaluation(yasmin, 9, algorithms));
		repository.addEvaluation(new Evaluation(yasmin, 10, algorithms));
		repository.addEvaluation(new Evaluation(yasmin, 6, algorithms));
		repository.addEvaluation(new Evaluation(yasmin, 7, algorithms));
		repository.addEvaluation(new Evaluation(yasmin, 7, algorithms));
		
		//softwareEngineering
		
		repository.addEvaluation(new Evaluation(pedro, 6, softwareEngineering));
		repository.addEvaluation(new Evaluation(pedro, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(pedro, 8, softwareEngineering));
		repository.addEvaluation(new Evaluation(pedro, 10, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(beatriz, 4, softwareEngineering));
		repository.addEvaluation(new Evaluation(beatriz, 5, softwareEngineering));
		repository.addEvaluation(new Evaluation(beatriz, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(beatriz, 3, softwareEngineering));
		repository.addEvaluation(new Evaluation(beatriz, 6, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(camila, 10, softwareEngineering));
		repository.addEvaluation(new Evaluation(camila, 8, softwareEngineering));
		repository.addEvaluation(new Evaluation(camila, 8, softwareEngineering));
		repository.addEvaluation(new Evaluation(camila, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(camila, 9, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(guilherme, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(guilherme, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(guilherme, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(guilherme, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(guilherme, 7, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(joao, 5, softwareEngineering));
		repository.addEvaluation(new Evaluation(joao, 5, softwareEngineering));
		repository.addEvaluation(new Evaluation(joao, 4, softwareEngineering));
		repository.addEvaluation(new Evaluation(joao, 5, softwareEngineering));
		repository.addEvaluation(new Evaluation(joao, 4, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(isabela, 6, softwareEngineering));
		repository.addEvaluation(new Evaluation(isabela, 6, softwareEngineering));
		repository.addEvaluation(new Evaluation(isabela, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(isabela, 8, softwareEngineering));
		repository.addEvaluation(new Evaluation(isabela, 7, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(mariana, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(mariana, 8, softwareEngineering));
		repository.addEvaluation(new Evaluation(mariana, 8, softwareEngineering));
		repository.addEvaluation(new Evaluation(mariana, 8, softwareEngineering));
		repository.addEvaluation(new Evaluation(mariana, 7, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(diego, 6, softwareEngineering));
		repository.addEvaluation(new Evaluation(diego, 6, softwareEngineering));
		repository.addEvaluation(new Evaluation(diego, 6, softwareEngineering));
		repository.addEvaluation(new Evaluation(diego, 9, softwareEngineering));
		repository.addEvaluation(new Evaluation(diego, 7, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(rafael, 5, softwareEngineering));
		repository.addEvaluation(new Evaluation(rafael, 5, softwareEngineering));
		repository.addEvaluation(new Evaluation(rafael, 6, softwareEngineering));
		repository.addEvaluation(new Evaluation(rafael, 4, softwareEngineering));
		repository.addEvaluation(new Evaluation(rafael, 3, softwareEngineering));
		
		repository.addEvaluation(new Evaluation(yasmin, 9, softwareEngineering));
		repository.addEvaluation(new Evaluation(yasmin, 10, softwareEngineering));
		repository.addEvaluation(new Evaluation(yasmin, 6, softwareEngineering));
		repository.addEvaluation(new Evaluation(yasmin, 7, softwareEngineering));
		repository.addEvaluation(new Evaluation(yasmin, 7, softwareEngineering));
		
		//dataStructures
		
		repository.addEvaluation(new Evaluation(pedro, 6, dataStructures));
		repository.addEvaluation(new Evaluation(pedro, 7, dataStructures));
		repository.addEvaluation(new Evaluation(pedro, 8, dataStructures));
		repository.addEvaluation(new Evaluation(pedro, 10, dataStructures));
		
		repository.addEvaluation(new Evaluation(beatriz, 4, dataStructures));
		repository.addEvaluation(new Evaluation(beatriz, 5, dataStructures));
		repository.addEvaluation(new Evaluation(beatriz, 7, dataStructures));
		repository.addEvaluation(new Evaluation(beatriz, 3, dataStructures));
		repository.addEvaluation(new Evaluation(beatriz, 6, dataStructures));
		
		repository.addEvaluation(new Evaluation(camila, 10, dataStructures));
		repository.addEvaluation(new Evaluation(camila, 8, dataStructures));
		repository.addEvaluation(new Evaluation(camila, 8, dataStructures));
		repository.addEvaluation(new Evaluation(camila, 7, dataStructures));
		repository.addEvaluation(new Evaluation(camila, 9, dataStructures));
		
		repository.addEvaluation(new Evaluation(guilherme, 7, dataStructures));
		repository.addEvaluation(new Evaluation(guilherme, 7, dataStructures));
		repository.addEvaluation(new Evaluation(guilherme, 7, dataStructures));
		repository.addEvaluation(new Evaluation(guilherme, 7, dataStructures));
		repository.addEvaluation(new Evaluation(guilherme, 7, dataStructures));
		
		repository.addEvaluation(new Evaluation(joao, 5, dataStructures));
		repository.addEvaluation(new Evaluation(joao, 5, dataStructures));
		repository.addEvaluation(new Evaluation(joao, 4, dataStructures));
		repository.addEvaluation(new Evaluation(joao, 5, dataStructures));
		repository.addEvaluation(new Evaluation(joao, 4, dataStructures));
		
		repository.addEvaluation(new Evaluation(isabela, 6, dataStructures));
		repository.addEvaluation(new Evaluation(isabela, 6, dataStructures));
		repository.addEvaluation(new Evaluation(isabela, 7, dataStructures));
		repository.addEvaluation(new Evaluation(isabela, 8, dataStructures));
		repository.addEvaluation(new Evaluation(isabela, 7, dataStructures));
		
		repository.addEvaluation(new Evaluation(mariana, 7, dataStructures));
		repository.addEvaluation(new Evaluation(mariana, 8, dataStructures));
		repository.addEvaluation(new Evaluation(mariana, 8, dataStructures));
		repository.addEvaluation(new Evaluation(mariana, 8, dataStructures));
		repository.addEvaluation(new Evaluation(mariana, 7, dataStructures));
		
		repository.addEvaluation(new Evaluation(diego, 6, dataStructures));
		repository.addEvaluation(new Evaluation(diego, 4, dataStructures));
		repository.addEvaluation(new Evaluation(diego, 6, dataStructures));
		repository.addEvaluation(new Evaluation(diego, 2, dataStructures));
		repository.addEvaluation(new Evaluation(diego, 3, dataStructures));
		
		repository.addEvaluation(new Evaluation(rafael, 5, dataStructures));
		repository.addEvaluation(new Evaluation(rafael, 5, dataStructures));
		repository.addEvaluation(new Evaluation(rafael, 6, dataStructures));
		repository.addEvaluation(new Evaluation(rafael, 4, dataStructures));
		repository.addEvaluation(new Evaluation(rafael, 3, dataStructures));
		
		repository.addEvaluation(new Evaluation(yasmin, 9, dataStructures));
		repository.addEvaluation(new Evaluation(yasmin, 10, dataStructures));
		repository.addEvaluation(new Evaluation(yasmin, 6, dataStructures));
		repository.addEvaluation(new Evaluation(yasmin, 7, dataStructures));
		repository.addEvaluation(new Evaluation(yasmin, 7, dataStructures));
		
		//webDevelopment
		
		repository.addEvaluation(new Evaluation(pedro, 6, webDevelopment));
		repository.addEvaluation(new Evaluation(pedro, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(pedro, 8, webDevelopment));
		repository.addEvaluation(new Evaluation(pedro, 10, webDevelopment));
		
		repository.addEvaluation(new Evaluation(beatriz, 4, webDevelopment));
		repository.addEvaluation(new Evaluation(beatriz, 5, webDevelopment));
		repository.addEvaluation(new Evaluation(beatriz, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(beatriz, 3, webDevelopment));
		repository.addEvaluation(new Evaluation(beatriz, 6, webDevelopment));
		
		repository.addEvaluation(new Evaluation(camila, 10, webDevelopment));
		repository.addEvaluation(new Evaluation(camila, 8, webDevelopment));
		repository.addEvaluation(new Evaluation(camila, 8, webDevelopment));
		repository.addEvaluation(new Evaluation(camila, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(camila, 9, webDevelopment));
		
		repository.addEvaluation(new Evaluation(guilherme, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(guilherme, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(guilherme, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(guilherme, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(guilherme, 7, webDevelopment));
		
		repository.addEvaluation(new Evaluation(joao, 5, webDevelopment));
		repository.addEvaluation(new Evaluation(joao, 5, webDevelopment));
		repository.addEvaluation(new Evaluation(joao, 4, webDevelopment));
		repository.addEvaluation(new Evaluation(joao, 5, webDevelopment));
		repository.addEvaluation(new Evaluation(joao, 4, webDevelopment));
		
		repository.addEvaluation(new Evaluation(isabela, 6, webDevelopment));
		repository.addEvaluation(new Evaluation(isabela, 6, webDevelopment));
		repository.addEvaluation(new Evaluation(isabela, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(isabela, 8, webDevelopment));
		repository.addEvaluation(new Evaluation(isabela, 7, webDevelopment));
		
		repository.addEvaluation(new Evaluation(mariana, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(mariana, 8, webDevelopment));
		repository.addEvaluation(new Evaluation(mariana, 8, webDevelopment));
		repository.addEvaluation(new Evaluation(mariana, 8, webDevelopment));
		repository.addEvaluation(new Evaluation(mariana, 7, webDevelopment));
		
		repository.addEvaluation(new Evaluation(diego, 6, webDevelopment));
		repository.addEvaluation(new Evaluation(diego, 4, webDevelopment));
		repository.addEvaluation(new Evaluation(diego, 6, webDevelopment));
		repository.addEvaluation(new Evaluation(diego, 2, webDevelopment));
		repository.addEvaluation(new Evaluation(diego, 3, webDevelopment));
		
		repository.addEvaluation(new Evaluation(rafael, 5, webDevelopment));
		repository.addEvaluation(new Evaluation(rafael, 5, webDevelopment));
		repository.addEvaluation(new Evaluation(rafael, 6, webDevelopment));
		repository.addEvaluation(new Evaluation(rafael, 4, webDevelopment));
		repository.addEvaluation(new Evaluation(rafael, 3, webDevelopment));
		
		repository.addEvaluation(new Evaluation(yasmin, 9, webDevelopment));
		repository.addEvaluation(new Evaluation(yasmin, 10, webDevelopment));
		repository.addEvaluation(new Evaluation(yasmin, 6, webDevelopment));
		repository.addEvaluation(new Evaluation(yasmin, 7, webDevelopment));
		repository.addEvaluation(new Evaluation(yasmin, 7, webDevelopment));
		
		Student[] approvedProgramming = repository.getApproved(programming);
		for(Student student : approvedProgramming) {
			if(student != null) {
				System.out.println(student.getName());
			}
		}
		
		Student[] approvedAlgorithms = repository.getApproved(algorithms);
		for(Student student : approvedAlgorithms) {
			if(student != null) {
				System.out.println(student.getName());
			}
		}
		
		Student[] approvedSoftwareEngineering = repository.getApproved(softwareEngineering);
		for(Student student : approvedSoftwareEngineering) {
			if(student != null) {
				System.out.println(student.getName());
			}
		}
		
		Student[] approvedDataStructures = repository.getApproved(dataStructures);
		for(Student student : approvedDataStructures) {
			if(student != null) {
				System.out.println(student.getName());
			}
		}
		
		Student[] approvedWebDevelopment = repository.getApproved(webDevelopment);
		for(Student student : approvedWebDevelopment) {
			if(student != null) {
				System.out.println(student.getName());
			}
		}
		
	}
}		
