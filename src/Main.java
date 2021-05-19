
public class Main {

	public static void main(String[] args) {
		// Classify and angle
		int angle = 90;

		// If
		if (angle == 90) {
			System.out.println("Right");
		}

		// If-Else
		if (angle == 90) {
			System.out.println("Right");
		} else {
			System.out.println("Not Right");
		}

		// IF-Else If-Else
		if (angle == 90) {
			System.out.println("Right");
		} else if (angle > 90 && angle < 180) {
			System.out.println("Obtuse");
		} else if (angle > 0 && angle < 90) {
			System.out.println("Acute");
		} else {
			System.out.println("Straight");
		}

		int input = 0;
		
		// Short-circuiting
		// && requires both conditions to be true
		// If Java sees input == 0, it knows that
		// the boolean will be false and stops checking
		// This prevents a run-time error from dividing by 0
		if(input != 0 && 100 / input == 5) {
			//Do stuff
		}
		
		String str = "Avocado";
		if(str.charAt(10) == 'A'&& str.length() > 10  ) {
			//Do stuff			
		}


	}

}
