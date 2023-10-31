package Controllers;

import java.util.List;

import Models.Subject;

public class Enrrolment {

	public Enrrolment() {
		
		
	}
	
	public void subjects() {
		// Lista de correlativas 
				List<Subject> correlatives = null;
				
				//6 Materias, Algoritmos Algebra e Ingles sin correlativas
				//Ingenieria del software (correlativa algoritmos y matematica)
				//Aspectos legales (correlativa ingles)
				//Base de datos (correlativa algoritmos aljebra e ingles)
				
				Subject algoritmos = new Subject(1,"Algoritmos",correlatives);
				Subject aljebra = new Subject(1,"Aljebra",correlatives);
				Subject ingles = new Subject(1,"Ingles",correlatives);
				Subject ingsoft = new Subject(1,"Ingenieria del Software",correlatives);
				Subject aspectos = new Subject(1,"Aspectos Legales de la Profesion",correlatives);
				Subject based = new Subject(1,"Base de Datos",correlatives);
		
	}
	
	public void students() {
		
		
	}
	

	public boolean approved() {
		
		return true;
	}
}
