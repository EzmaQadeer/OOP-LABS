import java.util.Arrays;
public class Player {
    private String name;
    private Dice[] dice;
    private int total;

    public Player( String name, int count, int sides) {
        this.name= name;
        this.dice= new Dice[count]; 
            for(int i=0 ; i< count ; i++) {
                this.dice[i] = new Dice(sides);
            } 
        this.total=0;
    }

    public void roll() {
        total=0;
        for(int i=0 ; i<this.dice.length ; i++) {
            total = total + this.dice[i].roll();
        }
    }

    public int getTotal() {
        return this.total;
    }

    public void roll( int index ) {
        if(index >= this.dice.length) 
        {
         throw new ArrayIndexOutOfBoundsException( "Index should be within the range of array!" );
        }
        total = total - this.dice[index].getValue();
        total= total + this.dice[index].roll();
    }

    public String toString() {                  //toString with for loop
        String result = "Player's Name: " + this.name + "\nTotal: " + this.total + "\n";
        for(int i =0; i< this.dice.length ; i++) {
            result = result + this.dice[i];
        }
        return result;
    }

    public String toString(boolean s) {          //toString without for loop
        String result = "Player's Name: " + this.name + "\nTotal: " + this.total + "\n";
        int i= 0;
        while(i<this.dice.length) 
        {
            result += this.dice[i];
            i++;
        }
        return result;
    }

    public String toString(String s) {            //toString with Arrays.deepToString
        String result = "Player's Name: " + this.name + "\nTotal: " + this.total + "\n";
        result += Arrays.deepToString(dice);
        return result;
    }

    public void cheatRoll() {
    int lowestValue = this.dice[0].getValue();

    for (int i = 1; i < this.dice.length; i++) {
        if (this.dice[i].getValue() < lowestValue) {
            lowestValue = this.dice[i].getValue();
        }
    }

    for (int i = 0; i < this.dice.length; i++) {
        if (this.dice[i].getValue() == lowestValue) {

            int oldValue = this.dice[i].getValue();
            int newValue = this.dice[i].roll();

            while(newValue <= oldValue) {
                newValue = this.dice[i].roll();
            }

            this.total = this.total - oldValue;
            this.total = this.total + newValue;
        }
    }
}
}