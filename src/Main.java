import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Henter metoderne og variabler fra Resurser og Army klasserne.
        Resurser resurser = new Resurser();
        Army army = new Army();

        resurser.wood();
        resurser.gold();
        resurser.metal();


        while (true) {
            System.out.println();
            System.out.print("Write what you wish to do.\nTo show the amount of wood, gold or metal you have, your income, and your army, write status." +
                    "\nTo show the cost of knights, write knight. \nTo show the cost of sorcerers, write sorcerer." +
                    "\nTo show the cost of more wood, gold and metal farmers, write farmers. Each farmer increases your income by 1. ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            //Type 0 to break loop
            if (input.equals("0")) {
                break;
            }
            if (input.equals("status")) {
                System.out.println("Wood: " + resurser.getWood() + ". Income: " + resurser.getWoodFarmer() + " wood every 5 seconds." +
                        "\nGold: " + resurser.getGold() + ". Income: " + resurser.getGoldFarmer() + " gold every 2 seconds." +
                        "\nMetal: " + resurser.getMetal() + ". Income: " + resurser.getMetalFarmer() + " wood every 10 seconds." +
                        "\nKnights: " + army.getKnight() +
                        "\nSorcerers: " + army.getSorcerer());
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
                if (resurser.getGold() >= 20 && resurser.getWood() >= 10 && resurser.getMetal() >=  5) {
                    resurser.setGold(resurser.getGold() - 20);
                    resurser.setWood(resurser.getWood() - 10);
                    resurser.setMetal(resurser.getMetal() - 5);
                    army.setKnight(army.getKnight() + 1);
                    System.out.println("You now have " + army.getKnight() + " knights.");
                }
            }
            if (input.equals("buysorcerer")) {
                if (resurser.getGold() >= 60 && resurser.getWood() >= 30 && resurser.getMetal() >=  15) {
                    resurser.setGold(resurser.getGold() - 60);
                    resurser.setWood(resurser.getWood() - 30);
                    resurser.setMetal(resurser.getMetal() - 15);
                    army.setSorcerer(army.getSorcerer() + 1);
                    System.out.println("You now have " + army.getSorcerer() + " sorcerers.");
                }
            }
            if (input.equals("sorcerer")) {
                System.out.println("              _,-'|\n" +
                        "           ,-'._  |\n" +
                        " .||,      |####\\ |\n" +
                        "\\.`',/     \\####| |\n" +
                        "= ,. =      |###| |\n" +
                        "/ || \\    ,-'\\#/,'`.\n" +
                        "  ||     ,'   `,,. `.\n" +
                        "  ,|____,' , ,;' \\| |\n" +
                        " (3|\\    _/|/'   _| |\n" +
                        "  ||/,-''  | >-'' _,\\\\\n" +
                        "  ||'      ==\\ ,-'  ,'\n" +
                        "  ||       |  V \\ ,|\n" +
                        "  ||       |    |` |\n" +
                        "  ||       |    |   \\\n" +
                        "  ||       |    \\    \\\n" +
                        "  ||       |     |    \\\n" +
                        "  ||       |      \\_,-'\n" +
                        "  ||       |___,,--\")_\\\n" +
                        "  ||         |_|   ccc/\n" +
                        "  ||        ccc/\n" +
                        "  ||                ");
                System.out.println("You have " + army.getSorcerer() + " sorcerers. Type buysorcerer to buy a sorcerer for 60 Gold, 30 Wood and 15 Metal.");
            }
            if (input.equals("farmers")) {
                System.out.println("You have " + resurser.getWoodFarmer() + " wood farmers. Type buywoodfarmer to buy a wood farmer for 10 gold and 10 wood.");
                System.out.println("You have " + resurser.getGoldFarmer() + " gold farmers. Type buygoldfarmer to buy a gold farmer for 20 gold.");
                System.out.println("You have " + resurser.getMetalFarmer() + " metal farmers. Type buymetalfarmer to buy a metal farmer for 30 gold, 10 wood and 5 metal.");
            }
            if (input.equals("buywoodfarmer")) {
                if (resurser.getGold() >= 10 && resurser.getWood() >= 10) {
                    resurser.setWoodFarmer(resurser.getWoodFarmer() + 1);
                    resurser.setWood(resurser.getWood() - 10);
                    resurser.setGold(resurser.getGold() - 10);
                    System.out.println("Your wood income has increased to " + resurser.getWoodFarmer() + ".");
                    resurser.wood();
                } else
                    System.out.println("You do not have enough resources to buy a wood farmer.");
            }
            if (input.equals("buygoldfarmer")) {
                if (resurser.getGold() >= 20) {
                    resurser.setGoldFarmer(resurser.getGoldFarmer() + 1);
                    resurser.setGold(resurser.getGold() - 20);
                    System.out.println("Your gold income has increased to " + resurser.getWoodFarmer() + ".");
                    resurser.gold();
                } else
                    System.out.println("You do not have enough resources to buy a gold farmer.");
            }
            if (input.equals("buymetalfarmer")) {
                if (resurser.getGold() >= 30 && resurser.getWood() >= 10 && resurser.getMetal() >= 5) {
                    resurser.setMetalFarmer(resurser.getMetalFarmer() + 1);
                    resurser.setGold(resurser.getGold() - 30);
                    resurser.setWood(resurser.getWood() - 10);
                    resurser.setMetal(resurser.getMetal() - 5);
                    System.out.println("Your metal income has increased to " + resurser.getMetalFarmer() + ".");
                    resurser.metal();
                } else
                    System.out.println("You do not have enough resources to buy a metal farmer.");
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
