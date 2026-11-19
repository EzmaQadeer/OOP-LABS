import java.util.Random;
public class Dice {
        private int sides;
        private int value;

        public Dice(int sides) {
            this.sides=sides;
        }

        public int roll() {
            Random random= new Random();
            value= random.nextInt(1,7);
            return value;
        } 

        public int myNextInt(int origin, int bound) {
            if(origin >= bound )
            {
                throw new IllegalArgumentException("Origin should be less than bound!");
            }
            int range = bound - origin;
            int randomNum= (int) (Math.random() * range) + origin;
            return randomNum;
        }

        public int getSides() {
            return this.sides;
        }

        public int getValue() {
            return this.value;
        }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String toString() {
        return "(sides: " + this.sides + ",value: " + this.value + ")";
    }
}