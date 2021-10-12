import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Henter metoderne fra Resurser klassen.
        Resurser resurser = new Resurser();

        resurser.wood();
        resurser.updateResources();
        resurser.gold();
        resurser.metal();

        //Fil med liste over resurser.
        try {
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
        }
    }
}
