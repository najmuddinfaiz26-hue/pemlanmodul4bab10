package FileOperation;

import java.io.File;
import java.util.Scanner;

public class ListDir {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path direktori: ");
        var path = keyboard.nextLine();

        var dir = new File(path); 

        if (dir.exists() && dir.isDirectory()) { 
            var files = dir.listFiles(); 
            
            if (files != null) {
                int count = 0;
                for (var f : files) { 
                    if (f.isFile()) { 
                        count++;
                        System.out.println(count + ". " + f.getName());
                    }
                }
            }
        } else {
            System.out.println("Path tidak valid!");
        }
    }
}
