import java.util.Collections;
import java.util.List;

public class ObstacleCoordinates {
	
	//Lista de obstáculos que contiene el "mapa" o "grid"
	private List<String> obstacleList = Collections.emptyList();

	//Constructor
	public ObstacleCoordinates(List<String> obstacleList) {
		this.obstacleList = obstacleList;

	}

	

	//Después de cada mvimiento, cmprobamos si se ha encontrado uno de los obstáculos
	public boolean checkForObstacles(String beforePosition, String afterPosition) {
		for (int i = 0; i < this.obstacleList.size(); i++) {
			String element = this.obstacleList.get(i);
		    if (element.equals(afterPosition)) {
		    	System.out.println("Obstacle encountered at : " + afterPosition);
		    	System.out.println("The Rover will remain at: " + beforePosition);
		    	System.out.println("------------------------------------");
		    	return true;
		    }
		}
		return false;
	}
}
