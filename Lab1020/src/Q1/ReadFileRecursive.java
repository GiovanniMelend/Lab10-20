package Q1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileRecursive {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("src/sample.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        for(int i = lines.size()-1; i >= 0; i--){
            System.out.println(lines.get(i));
        }
    }
}
