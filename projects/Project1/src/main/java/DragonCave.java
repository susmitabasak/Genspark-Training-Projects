package genspark.projects.Project1.src.main.java;

import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you, " +
                "\nyou see two caves. In one cave, the dragon is friendly " +
                "\nand will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight." +
                "\nWhich cave will you go into? (1 or 2)");
        Scanner in = new Scanner(System.in);
        try {
            int choice = in.nextInt();
            if (choice == 1)
                System.out.println("You approach the cave... It is dark and spooky.. " +
                        "\nA large dragon jumps in front of you! He opens his jaw and..." +
                        "\nGobbles you down in one bite!");
            else if (choice == 2)
                System.out.println("You approach the cave... It is quite in there... " +
                        "\nA cute friendly dragon approaches you! " +
                        "\nHe shares HIS treasure with YOU :)!");
            else
                System.out.println("You have made an invalid choice");
        } catch (NumberFormatException ne) {
            System.out.println("You have not entered a valid number");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }

    }
}
