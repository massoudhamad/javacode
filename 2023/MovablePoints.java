public class MovablePoints implements Movable {
    private int x, y;

    public MovablePoints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        y++;

    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        x--;

    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        x++;

    }

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        y--;
    }

}