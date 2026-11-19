public class Main {
    public static void main(String[] args) {

        // Create Sara with 2 dice, each having 6 sides
        Player player = new Player("Sara", 4, 6);

        player.roll();

        System.out.println("Initial total: " + player.getTotal());

        System.out.println(player.toString("yes"));

        /*player.roll(1);

        System.out.println("New total: " + player.getTotal()); */

        player.cheatRoll();

        System.out.println("New total after cheat roll: ");

        System.out.println(player.toString("yes"));

        /*Dice d = new Dice(6);
        System.out.println("Random number: " + d.myNextInt(4,9)); */

        /*System.out.println(player);   //with for loop toString()
        System.out.println(player.toString(true));     //without for loop toString()
        System.out.println(player.toString("yes"));    // with Arrays.deepToString() */
    }
}