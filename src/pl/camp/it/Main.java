package pl.camp.it;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /************************* WCZYTYWANIE **************************/
        String filePath = "E:\\IT-CAMP4\\plik.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Nie da się wczytac pliku !!");
        }
        /************************** ZAPISYWANIE ************************/
        String outPath = "E:\\IT-CAMP4\\out.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outPath, true));

            writer.append("Cos");
            writer.newLine();
            writer.append("cos2");
            writer.newLine();
            writer.append("cos3");

            writer.close();
        } catch (IOException e) {
            System.out.println("Nie da się zapisać pliku !!");
        }
    }
}
