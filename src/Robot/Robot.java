package Robot;

public class Robot {
	private int x = 0;
	private int y = 0;
	private Direction direction = Direction.UP;

	public Direction getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void turnLeft() {
		switch (direction) {
			case UP -> direction = Direction.LEFT;
			case RIGHT -> direction = Direction.UP;
			case DOWN -> direction = Direction.RIGHT;
			case LEFT -> direction = Direction.DOWN;
		}
	}

	public void turnRight() {
		switch (direction) {
			case UP -> direction = Direction.RIGHT;
			case RIGHT -> direction = Direction.DOWN;
			case DOWN -> direction = Direction.LEFT;
			case LEFT -> direction = Direction.UP;
		}
	}

	public void stepForward() {
		switch (direction) {
			case UP -> y += 1;
			case RIGHT -> x += 1;
			case DOWN -> y -= 1;
			case LEFT -> x -= 1;
		}
	}

	public void moveRobotTo(int toX, int toY) {
		x = toX;
		y = toY;
	}
}
