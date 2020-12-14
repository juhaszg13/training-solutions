package week08d01;

public class Robot {

    Point position = new Point(0, 0);

    public Point move(String movement) {
        for (int i = 0; i < movement.length(); i++) {
            moveOneStep(movement.charAt(i));
        }
        return this.position;
    }

    private void moveOneStep(char letter) {
        switch (letter) {
            case 'F': {
                position.increaseY();
                return;
            }
            case 'L': {
                position.decreaseY();
                return;
            }
            case 'J': {
                position.increaseX();
                return;
            }
            case 'B': {
                position.decreaseX();
                return;
            }
            default:
                throw new IllegalArgumentException("Unknown movement!");
        }
    }

    public Point getPosition() {
        return position;
    }
}