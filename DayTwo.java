package AdventOfCode;
import java.io.FileNotFoundException;
import main.AdventUtilities;

public class DayTwo {
	public static void main(String[] args) throws FileNotFoundException {
		String[] lines = AdventUtilities.reader("input");
		String command = "";

		System.out.println("The horizontal position multipled by the depth is "+ partOne( command, lines));
		System.out.println("The final horizontal position multipled by the depth is "+ partTwo(command, lines));
	}


	public static int partOne( String command, String[] lines) {
		int position= 0, depth = 0, horizontal =  0;
		for (int i =0; i < lines.length; i++) {
			String[] s = new String[2];
			s = lines[i].split(" ");
			command = s[0];
			position = Integer.parseInt(s[1]);
			if (command.equals("forward")) {
				horizontal += position;
			} else if (command.equals("down")) {
				depth += position; 
			} else if (command.equals("up")) {
				depth -= position; 
			}
		}
		return depth * horizontal;
	}
	
	public static int partTwo( String command, String[] lines) {
		int position= 0, depth = 0, horizontal =  0, aim = 0;
		for (int i =0; i < lines.length; i++) {
			String[] s = new String[2];
			s = lines[i].split(" ");
			command = s[0];
			position = Integer.parseInt(s[1]);
			if (command.equals("forward")) {
				horizontal += position;
				depth += position * aim;
			} else if (command.equals("down")) {
				aim += position; 
			} else if (command.equals("up")) {
				aim -= position; 
			}
		}
		return depth * horizontal;
	}
}