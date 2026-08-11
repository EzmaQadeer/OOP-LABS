class Car{
    private int speed;
    private float direction;
    private static int count=0;


 public Car() //null constructor
{
     this.speed=60;
     this.direction=0;
     count++;
}


public Car(int speed, float direction) //parameterize constructor
{
    this.speed=speed;
    this.direction=direction;
    count++;
}


public Car(Car s1) // copy constructor
{
    this.speed=s1.speed;
    this.direction=s1.direction;
    count++;
}


public void setSpeed(int speed)
{
    if(speed<0){
    System.out.println("Speed cannot be negative! Setting to 0.");
    this.speed=0;}
    else if (speed>250)
    {
        System.out.println("Exceeds max speed limit! Setting to 250.");
        this.speed=250;
    } else {
        this.speed=speed;
    }
}


public void setDirection(float direction){
    this.direction=direction;
}


public int getSpeed()
{
return this.speed;
}


public float getDirection()
{
return this.direction;
}


public static int getObjectCount()
{
return count;
}

public void drive()
{
        if (speed == 0) {
            System.out.println("The car is parked.");
        } else {
            System.out.println("Driving forward at " + speed + " km/h!");
        }
}

public void moveLeft()
{
        this.direction -= 15.0f; 
        System.out.println("Turned left. Current direction: " + direction + "°");
}

public void moveRight()
{
        this.direction += 15.0f; 
        System.out.println("Turned right. Current direction: " + direction + "°");
}

public void horn()
{
    System.out.println("Beep Beep!!");
}

public void display()
{
    System.out.println("Your car's speed is:" + speed + " and direction is:" + direction);
}
}