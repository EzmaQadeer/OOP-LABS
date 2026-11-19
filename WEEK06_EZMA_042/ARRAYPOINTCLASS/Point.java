class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // New method inside Point to handle its own incrementing logic
    public void increment() {
        this.x++;
        this.y++;
    }

@Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}