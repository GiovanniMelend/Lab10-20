package Q4;


import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String data = "Book\nWater\nStreet\nCar";
        try(FileWriter writer = new FileWriter("output2.txt")){
            writer.write(data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
