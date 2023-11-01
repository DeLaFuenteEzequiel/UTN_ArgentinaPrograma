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
				Subject aljebra = new Subject(1,"Aljebra",correlatives);
				Subject ingles = new Subject(1,"Ingles",correlatives);
				
				correlatives.add(aljebra);
				correlatives.add(algoritmos);
				Subject ingsoft = new Subject(1,"Ingenieria del Software",correlatives);
				
				correlatives = new ArrayList<>();
				correlatives.add(ingles);
				Subject aspectos = new Subject(1,"Aspectos Legales de la Profesion",correlatives);
				
				correlatives = new ArrayList<>();
				correlatives.add(algoritmos);
				correlatives.add(aljebra);
				correlatives.add(ingles);
				
				Subject based = new Subject(1,"Base de Datos",correlatives);
				
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
		
		
		
	}
	

	public boolean approved() {
		
		return true;
	}
	
	
}
