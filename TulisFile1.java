package FileOperation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile1 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        var text = keyboard.nextLine();

       
        try (var writer = new FileWriter("test.txt", false)) { 
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file");
        }
    }
}
