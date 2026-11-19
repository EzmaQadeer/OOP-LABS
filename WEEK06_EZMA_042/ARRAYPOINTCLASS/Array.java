class Array implements Cloneable {

    private Point[] anArray;
    private int value;

    public Array() {
        this.anArray = new Point[] {
            new Point(1,2),
            new Point(3,4),
            new Point(5,6) };
        this.value = 0;
    }

    public void increment() {
        this.anArray[this.value].increment();
        this.value++;
    }

    @Override
public String toString() {
    String result = "";
    for (int i = 0; i < this.anArray.length; i++) {
        result = result + this.anArray[i] + " ";
    }
    result = result + "\nvalue = " + this.value;
    return result;

}@Override
        public Object clone() throws CloneNotSupportedException {
        Array cloned = (Array) super.clone();
        
        // Create an entirely new array object in memory
        Point[] newArray = new Point[this.anArray.length];
        
        // Copy each element individually
        for (int i = 0; i < this.anArray.length; i++) {
            newArray[i] = (Point) this.anArray[i].clone();
        }
        
        // Assign the new array to the cloned object
        cloned.anArray = newArray;
        
        return cloned;
    }
    }
