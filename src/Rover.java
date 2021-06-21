
public class Rover {
	
	//El rover inicia su "ruta" encarando Norte. Inicializamos la variable 
	

	Movement move = new Movement("N", 0, 0);
	
	public String execute(String commands) {
		
		//Convertimos el string introducido a un array de caracteres
		for (char singleCommand : commands.toCharArray()) { 
			if (singleCommand == 'R') {
				move.turn('R');
			}else if(singleCommand == 'L') {
				move.turn('L');
			}else if(singleCommand == 'F') {
				move.moveForward();
			}
		}
		//Ubicación y orientación resultante
		return move.getXcoordinate() + ":" + move.getYcoordinate() + ":" + move.getFacingDirection();
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

