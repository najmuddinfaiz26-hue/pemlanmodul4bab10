package FileOperation;

import java.io.File;
import java.util.Scanner;

public class FileSize {
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);

       
        System.out.print("Masukkan nama file atau path lengkap (contoh: test.txt): ");
        String namaFile = keyboard.nextLine();

        
        File file = new File(namaFile);

        
        if (file.exists() && file.isFile()) {
            long sizeBytes = file.length(); 
            double sizeKB = 1024.0;
            double sizeMB = 1024.0 * 1024.0;

            
            if (sizeBytes < sizeMB) {
                double hasilKB = sizeBytes / sizeKB;
                System.out.printf("Ukuran file: %.2f KB%n", hasilKB);
            } else {
                double hasilMB = sizeBytes / sizeMB;
                System.out.printf("Ukuran file: %.2f MB%n", hasilMB);
            }
        } else {
            
            System.out.println("Error: File tidak ditemukan atau path tersebut adalah direktori.");
        }
        
        keyboard.close(); 
    }
}
