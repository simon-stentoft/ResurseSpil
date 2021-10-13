import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Henter metoderne fra Resurser og Army klasserne.
        Resurser resurser = new Resurser();
        Army army = new Army();

        resurser.wood();
        resurser.gold();
        resurser.metal();


        while (true) {
            System.out.print("Write what you wish to do.\nTo show the amount of wood, gold or metal you have, write status. ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            //Type 0 to break loop
            if (input.equals("0")) {
                break;
            }
            if (input.equals("status")) {
                System.out.println("Wood: " + resurser.getWood() + "\nGold: " + resurser.getGold() + "\nMetal: " + resurser.getMetal());
            }
            if (input.equals("knight")) {
                System.out.println("   .\n" +
                        "  / \\\n" +
                        "  | |\n" +
                        "  |.|\n" +
                        "  |.|\n" +
                        "  |:|      __\n" +
                        ",_|:|_,   /  )\n" +
                        "  (Oo    / _I_\n" +
                        "   +\\ \\  || __|\n" +
                        "      \\ \\||___|\n" +
                        "        \\ /.:.\\-\\\n" +
                        "         |.:. /-----\\\n" +
                        "         |___|::oOo::|\n" +
                        "         /   |:<_T_>:|\n" +
                        "        |_____\\ ::: /\n" +
                        "         | |  \\ \\:/\n" +
                        "         | |   | |\n" +
                        "         \\ /   | \\___\n" +
                        "         / |   \\_____\\\n" +
                        "         `-'");
                System.out.println("You have " + army.getKnight() + " knights. Type buyknight to buy a knight for 20 Gold, 10 Wood and 5 Metal.");
            }
            if (input.equals("buyknight")) {
                army.setKnight(army.getKnight()+1);
                System.out.println(army.getKnight());
            }
        }


        //Fil med liste over resurser.
      /*  try {
            File fileScore = new File("Resurser.txt");
            if (fileScore.createNewFile()) {
                System.out.println("File was created: " + fileScore.getName());
            } else {
                System.out.println("Resurser.txt file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //Skriver til filen.
        try {
            FileWriter fileWriter = new FileWriter("Resurser.txt");
            fileWriter.write(resurser.getGold());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/
    }
}
