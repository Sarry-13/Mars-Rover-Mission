
public class Rover {
	
	//El rover inicia su "ruta" encarando Norte. Inicializamos la variable 
	
	String facingDirection = "N";

	public String execute(String commands) {
		
		//Convertimos el string introducido a un array de caracteres
		for (char singleCommand : commands.toCharArray()) { 
			if (singleCommand == 'R') {
				turn('R');
			}else if(singleCommand == 'L') {
				turn('L');
			}
		}
		return "0:0:" + facingDirection;
	}
	
	

	private void turn(char turnDirection) {
		
		//Rotación a la derecha
		if (turnDirection == 'R') {
			switch(facingDirection) {
			  case "N":
				  facingDirection = "E";
			    break;
			  case "E":
				  facingDirection = "S";
			    break;
			  case "S":
				  facingDirection = "W";
				 break;
			  case "W":
				  facingDirection = "N";
				 break;
			}
			
		//Rotación a la izquierda
		}else if (turnDirection ==  'L') {
			switch(facingDirection) {
			  case "N":
				  facingDirection = "W";
			    break;
			  case "W":
				  facingDirection = "S";
			    break;
			  case "S":
				  facingDirection = "E";
				 break;
			  case "E":
				  facingDirection = "N";
				 break;
			}
		}
		
	}




/*





	private void turnLeft() {
		switch(direction) {
		  case "N":
		    direction = "W";
		    break;
		  case "W":
			direction = "S";
		    break;
		  case "S":
			 direction = "E";
			 break;
		  case "E":
			 direction = "N";
			 break;
		  default:
		    // code block
		}
	}

	private void turnRight() {
		switch(direction) {
		  case "N":
		    direction = "E";
		    break;
		  case "E":
			direction = "S";
		    break;
		  case "S":
			 direction = "W";
			 break;
		  case "W":
			 direction = "N";
			 break;
		  default:
		    // code block
		}
	}
*/
}
