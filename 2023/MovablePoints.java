public class MovablePoints implements Movable {
    private int x, y;

    public MovablePoints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveDown() {
        y++;

    }

    @Override
    public void moveLeft() {
        x--;

    }

    @Override
    public void moveRight() {
        x++;

    }

    @Override
    public void moveUp() {
        y--;
    }

}