package Controllers;

import java.util.ArrayList;
import java.util.List;

import Models.Subject;

public class Enrrolment {

	public Enrrolment() {
		
		
	}
	
	public void subjects() {
		// Lista de correlativas 
				List<Subject> correlatives = new ArrayList<>();
				
				//6 Materias, Algoritmos Algebra e Ingles sin correlativas
				//Ingenieria del software (correlativa algoritmos y aljebra)
				//Aspectos legales (correlativa ingles)
				//Base de datos (correlativa algoritmos aljebra e ingles)
				
				Subject algoritmos = new Subject(1,"Algoritmos",correlatives);
				Subject aljebra = new Subject(2,"Aljebra",correlatives);
				Subject ingles = new Subject(3,"Ingles",correlatives);
				
				correlatives.add(aljebra);
				correlatives.add(algoritmos);
				Subject ingsoft = new Subject(4,"Ingenieria del Software",correlatives);
				
				correlatives = new ArrayList<>();
				correlatives.add(ingles);
				Subject aspectos = new Subject(5,"Aspectos Legales de la Profesion",correlatives);
				
				correlatives = new ArrayList<>();
				correlatives.add(algoritmos);
				correlatives.add(aljebra);
				correlatives.add(ingles);
				
				Subject based = new Subject(6,"Base de Datos",correlatives);
				
				System.out.println("Correlativas de Base de datos:");
				List<Subject> correlativas_bd = based.getCorrelatives();
				for (Subject correlativa : correlativas_bd) {
				    System.out.println(correlativa.getName()); 
				}
				
				System.out.println("\nCorrelativas Aspectos Legales:");
				List<Subject> correlativas_aspectos = aspectos.getCorrelatives();
				for (Subject correlativa : correlativas_aspectos) {
				    System.out.println(correlativa.getName()); 
				}
		
				System.out.println("\nCorrelativas de Ingenieria del Software:");
				List<Subject> correlativas_ingenieria = ingsoft.getCorrelatives();
				for (Subject correlativa : correlativas_ingenieria) {
				    System.out.println(correlativa.getName()); 
				}
		
	}
	
	public void students() {
		List<Subject> materias_aprobadass = new ArrayList<>();
		Subject  materia1 = Subject(1,"Algoritmos",materias_aprobadas);
		Subject  materia2 = Subject(2,"Aljebra",materias_aprobadas);
		materias_aprobadas.add(materia1);
		Student florencia = new Student("40236403","Florencia","Riposo",materias_aprobadas);
		 

		
	}
	

	public boolean approved() {
		
		return true;
	}
	
	
}
