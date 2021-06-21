import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


	class RoverMainTest {
		
		private Rover rover;

		@BeforeEach
		public void init() {
			rover = new Rover();
		}
		
		//Partimos de que el rover se encuentra en la posición 0:0, encarado a N (norte)
		/******************************************************/
		//Rotación a la derecha	
			
		@ParameterizedTest
		@CsvSource({"R, 0:0:E", "RR, 0:0:S", "RRR, 0:0:W", "RRRR, 0:0:N", "RRRRR, 0:0:E"})

		public void rotateRight(String commands, String position) {
			assertEquals(rover.execute(commands), (position));
		}
		

		
		/******************************************************/
		//Rotación a la izquierda
			
		@ParameterizedTest
		@CsvSource({"L, 0:0:W", "LL, 0:0:S", "LLL, 0:0:E", "LLLL, 0:0:N", "LLLLL, 0:0:W"})

		public void rotateLeft(String commands, String position) {
			assertEquals(rover.execute(commands), (position));
		}
	

}
