class Car implements Cloneable {
   private final String model;
   private int speed;
   private final float direction;

   public Car( String model, int speed, float direction) {
    this.model= model;
    this.speed=speed;
    this.direction=direction;
   }
   
   public void increment() {
      this.speed++;
   }

   @Override
   public String toString() {
    return "(Model: " + this.model + ", Speed: " + this.speed + ", Direction: " + this.direction + ")";
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
    return super.clone();
   }

}