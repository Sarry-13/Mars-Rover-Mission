
public class Movement {
	
	private String facingDirection;
	private int xCoordinate;
	private int yCoordinate;
	
	
	//Constructor
	public Movement(String facingDirection, int xcoordinate, int ycoordinate) {
		this.facingDirection = facingDirection;
		this.xCoordinate = xcoordinate;
		this.yCoordinate = ycoordinate;
	}

	
	//getters 
	public String getFacingDirection() {
		return facingDirection;
	}
	
	public int getXcoordinate() {
		return xCoordinate;
	}

	public int getYcoordinate() {
		return yCoordinate;
	}

	//Avance
	public void moveForward() {
		switch(facingDirection) {
		  case "N":
			  if (this.yCoordinate < 199) {
				  this.yCoordinate++;  
			  }
		    break;
		  case "E":
			  if (this.xCoordinate < 199) {
				  this.xCoordinate++;  
			  }
			break;
		  case "S":
			  if (this.yCoordinate > 0) {
				  this.yCoordinate--;  
			  }
			 break;
		  case "W":
			  if (this.xCoordinate > 0) {
				  this.xCoordinate--;  
			  }
			 break;
		}
	}
	
	
	//Giro
	public void turn(char turnDirection) {
		
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
}


