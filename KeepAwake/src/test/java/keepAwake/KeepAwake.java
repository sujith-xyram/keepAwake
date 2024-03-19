package keepAwake;

import java.awt.Robot;

public class KeepAwake {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		Robot robot = new Robot();
		while (true) {

			robot.mouseMove(0, 0);
			Thread.sleep(50000);
		}

	}

}
