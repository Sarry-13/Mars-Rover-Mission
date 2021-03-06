import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.internal.TextListener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;


import org.junit.runner.JUnitCore;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RoverMainTest {

		private Rover rover;
		

		@BeforeEach
		public void init() {
			rover = new Rover();
		}

		
		
		
		//Para los tests, partimos de que el rover se encuentra en la posici?n 0:0, encarado a N (norte)
		//Situamos obst?culos en 1:4, 2:3, 4:3 (x:y)
		/******************************************************/
		//Rotaci?n a la derecha	
		
		@ParameterizedTest
		@CsvSource({"R, 0:0:E", "RR, 0:0:S", "RRR, 0:0:W", "RRRR, 0:0:N", "RRRRR, 0:0:E"})

		public void rotateRight(String commands, String position) {
			assertEquals(rover.execute(commands), (position));
		}
		

		
		/******************************************************/
		//Rotaci?n a la izquierda
		
		@ParameterizedTest
		@CsvSource({"L, 0:0:W", "LL, 0:0:S", "LLL, 0:0:E", "LLLL, 0:0:N", "LLLLL, 0:0:W"})

		public void rotateLeft(String commands, String position) {
			assertEquals(rover.execute(commands), (position));
		}


		/******************************************************/
		
		//Avance (sin y con giro)
	
		@ParameterizedTest
		@CsvSource({"F, 0:1:N", "FF, 0:2:N", "RF, 1:0:E"})

		public void moveForward(String commands, String position) {
			assertEquals(rover.execute(commands), (position));
		}
		
		
		/******************************************************/
				
		//Cuando llegamos a la casilla 0 o a la 199 no avanzamos m?s.(Tablero 200 x 200)
		
		@ParameterizedTest
		@MethodSource("maxSquares")
		public void moveToTheEnd(String commands, String position) {
			assertEquals(rover.execute(commands), (position));
		}
	
		private static Stream<Arguments> maxSquares() {
			String maximumSquares = "";
			for (int i = 0; i < 199; i++) {
				maximumSquares += "F";
			}
			return Stream.of(
					Arguments.of(maximumSquares,"0:199:N"),
					Arguments.of(maximumSquares + "F","0:199:N"),
					Arguments.of(maximumSquares + "FF","0:199:N"),
					
					Arguments.of("R" + maximumSquares + "FF","199:0:E"),
					
					Arguments.of("RR" + maximumSquares + "FF","0:0:S"),
					
					Arguments.of("L" + maximumSquares + "FFFF","0:0:W")
					);
		}
		
		/******************************************************/
		
		//Detecci?n de obstaculos
		//Tests:
		//	-Obst?culo en 1:4, 2:3, 4:3
		
		@ParameterizedTest
		@CsvSource({"RFLFFFF, 1:3:N", "RFFLFFFFFF, 2:2:N", "RFFFFFLFFFLFFFFFFF, 5:3:W"})

		public void detectObstacles(String commands, String position) {
			assertEquals(rover.execute(commands), (position));
		}
		
	

}
