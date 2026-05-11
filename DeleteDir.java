package FileOperation;

import java.io.File;
import java.util.Scanner;

public class DeleteDir {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Path direktori yang akan dihapus: ");
        var path = keyboard.nextLine();
        var dir = new File(path);

        if (dir.exists() && dir.isDirectory()) {
            var files = dir.listFiles();
            if (files != null) {
                for (var f : files) {
                    f.delete(); 
                    System.out.println("File " + f.getName() + " dihapus.");
                }
            }
            
            if (dir.delete()) {
                System.out.println("Direktori berhasil dihapus.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
