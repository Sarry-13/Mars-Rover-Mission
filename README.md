# Mars-Rover-Mission
<h2>The problem</h2>
You’re part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet.
The planet, which is curiously rectangular and sized 200x200, must be navigated by Rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.
A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The planet is divided up into a grid to simplify navigation. An example position might be 0:0:N, which means the rover is in the bottom left corner and facing North. This is the position where the Rover will be located at the beggining of the mission.
In order to control a rover, the possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'F' means move forward one grid point, and maintain the same heading.
An obstacle detection before each move to a new square has been implemented. If a given sequence of commands encounters an obstacle, the rover moves up to the last
possible point, aborts the sequence and reports the obstacle.

<h2>Examples</h2>
Input:
FFFFF

Output:
0:5:N

<h2>Requirements</h2>
The project has been tested with JUnit5 on the Eclipse IDE. By now, it is necessary to open the project on the Eclipse IDE to perform them.
To run the program it is necessary to have Java installed.

<h2>The Solution</h2>

The tests consisted in:
<ul> 
  <li>Testing the spin of the rover for both directions</li>
  <li>Testing the forward movement</li>
  <li>Testing the non-transgression of grid limits</li>
  <li>Testing the obstacle detection system</li>
</ul>
Te program allows the user to input a string of commands and gets the final position of the Rover as an output, along with extra information in case of encountering an obstacle.
The Rover starts it's route at 0:0:N.

<h2>How to run</h2>
<h6>The tests</h6>
The project has been tested with JUnit5 on the Eclipse IDE. By now, it is necessary to open the project on the Eclipse IDE to perform them.

<h6>The program</h6>
Use the next command to run the app on windows or MacOS machines:

java Rover.class

Found in the src subfolder.

