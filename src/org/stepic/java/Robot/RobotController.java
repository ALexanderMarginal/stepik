package org.stepic.java.Robot;

public class RobotController {
	public RobotController() {
		Robot robot = new Robot();
		RobotController.moveRobot(robot, 3, 0);
	}

	public static void moveRobot(Robot robot, int toX, int toY) {
		if (robot.getX() != toX) {
			Direction direction = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
			while (robot.getDirection() != direction) {
				robot.turnRight();
			}

			while (robot.getX() != toX) {
				robot.stepForward();
			}
		}

		if (robot.getY() != toY) {
			Direction direction = robot.getY() > toY ? Direction.DOWN : Direction.UP;
			while (robot.getDirection() != direction) {
				robot.turnRight();
			}

			while (robot.getY() != toY) {
				robot.stepForward();
			}
		}
	}
}
