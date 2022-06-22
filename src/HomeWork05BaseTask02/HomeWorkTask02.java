package HomeWork05BaseTask02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWorkTask02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\kate\\repos\\HomeWork05Base\\resource\\my_first_file.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String readLine = bufferedReader.readLine();
            System.out.print(readLine);
        }
        fileReader.close();
   }

}
