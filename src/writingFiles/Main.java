package writingFiles;

import java.io.File;  //input out put
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("newFile.txt");
            if(!file.exists())
                file.createNewFile();
            //запись файла
            PrintWriter pw = new PrintWriter(file);
            pw.println("Forever is working");
            pw.println("Hallo world");
            pw.println("AntonBaltser");
            pw.close();
            // чтение файла
            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch ( IOException e ) {
                System.out.println("Error: " + e);
            }
        }
    }
}
