package Views;

import java.sql.Connection;

import Controllers.Enrrolment;
import Data.ConnectionDB;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Ignorar esto, estaba probando usar base de datos
		
		/*Connection connection = ConnectionDB.connect();
		
		 if (connection != null) {
	            System.out.println("Conexión bd ok");
	           
	        } else {
	            System.out.println("error bd");
	        }*/
		
		Enrrolment enrrollment = new Enrrolment();
		
		
		enrrollment.approved();
		

	}

}
