import java.util.List;
import java.util.Scanner;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
public class Rover {
	
	//El rover inicia su "ruta" encarando Norte. Inicializamos la variable 
	

	Movement move = new Movement("N", 0, 0);
	ObstacleCoordinates obstacleList = new ObstacleCoordinates(List.of("1:4", "2:3", "4:3"));
	
	
	public static void main(String args[]) {

		Rover rover = new Rover();
		
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Enter a string containing R(turn right), L(turn left) and F(move forward): ");
		String str= (sc.nextLine().toUpperCase()); 
		rover.execute(str);
		 
	}
		
	
	public String execute(String commands) {
		String beforePosition;
		String afterPosition;
		String finalPosition;
		
		//Convertimos el string introducido a un array de caracteres
		for (char singleCommand : commands.toCharArray()) { 
			//Posición antes del movimiento
			beforePosition = move.getXcoordinate() + ":" + move.getYcoordinate() + ":" + move.getFacingDirection();

			if (singleCommand == 'R') {
				move.turn('R');
			}else if(singleCommand == 'L') {
				move.turn('L');
			}else if(singleCommand == 'F') {
				move.moveForward();
			}
			//Posición después del movimiento
			afterPosition = move.getXcoordinate() + ":" + move.getYcoordinate();
			//Hay un obstáculo en esa casilla?
			if(obstacleList.checkForObstacles(beforePosition, afterPosition)) {
				//System.out.println("Choque");
				return beforePosition;
			}
			
		}
		
		
		//Ubicación y orientación resultante
		finalPosition = move.getXcoordinate() + ":" + move.getYcoordinate() + ":" + move.getFacingDirection();
		System.out.println("The Rover finished the sequence of commands at: " + finalPosition);
		System.out.println("------------------------------------");
		return finalPosition;
	}
	
			
	}




