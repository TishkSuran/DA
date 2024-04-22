package Religious_Applications;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hadith_Generator {
    public static void readHadith() {
        File hadithFile = new File("/Users/tishksuran/IdeaProjects/Digital_Artefact/src/Religious_Applications/Hadiths.txt");

        try {
            Scanner scan = new Scanner(hadithFile);
            ArrayList<String> listOfHadiths = new ArrayList<>();
            while (scan.hasNext()) {
                listOfHadiths.add(scan.nextLine());
            }

            int index = (int)(Math.random() * listOfHadiths.size());
            System.out.println(listOfHadiths.get(index));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
