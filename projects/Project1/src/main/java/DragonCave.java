import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you, " +
                "\nyou see two caves. In one cave, the dragon is friendly " +
                "\nand will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight." +
                "\nWhich cave will you go into? (1 or 2)");
        int choice = 0;
        try {
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            if (choice == 1)
                System.out.println(userChooses1());
            else if (choice == 2)
                System.out.println(userChooses2());
            else
                System.out.println("You have made an invalid choice");
        } catch (NumberFormatException ne) {
            System.out.println("You have not entered a valid number");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String userChooses1() {
        String choice1 = "You approach the cave... It is dark and spooky.. " +
                "\nA large dragon jumps in front of you! He opens his jaw and..." +
                "\nGobbles you down in one bite!";
        return choice1;
    }
    public static String userChooses2() {
        String choice2 = "You approach the cave... It is quite in there... " +
                "\nA cute friendly dragon approaches you! " +
                "\nHe shares HIS treasure with YOU :)!";
        return choice2;
    }
}
