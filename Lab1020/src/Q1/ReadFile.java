package Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new File("src/sample.txt"))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
