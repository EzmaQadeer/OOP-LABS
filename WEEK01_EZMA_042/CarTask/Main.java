public class Main {
 public static void main(String[] args){
     Car tesla = new Car();
     Car bmw = new Car(120, 45.0f);
     Car audi = new Car(bmw);
System.out.println("Displaying info of Tesla:");
tesla.display();
System.out.println("Current speed of Audi is:" + audi.getSpeed());
audi.setSpeed(-40);
System.out.println("New speed of Audi is:" + audi.getSpeed());
System.out.println("Current direction of BMW is:" + bmw.getDirection());
bmw.setDirection(60.0f);
System.out.println("New direction of BMW is:" + bmw.getDirection());
System.out.println("Driving Tesla");
tesla.drive();
     }
}