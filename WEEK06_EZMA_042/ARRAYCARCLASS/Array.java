class Array implements Cloneable {

    private Car[] anArray;
    private int value;

    public Array() {
        this.anArray = new Car[] {
            new Car( "Audi" , 250, 45.0f), 
            new Car( "BMW" , 300, 65.0f) };
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
}

@Override
        public Object clone() throws CloneNotSupportedException {
        Array cloned = (Array) super.clone();
        
        // Create an entirely new array object in memory
        Car[] newArray = new Car[this.anArray.length];
        
        // Copy each element individually
        for (int i = 0; i < this.anArray.length; i++) {
            newArray[i] = (Car) this.anArray[i].clone();
        }
        
        // Assign the new array to the cloned object
        cloned.anArray = newArray;
        
        return cloned;
    }
}
