package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedE {
    static void createBlankTXTFile() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\rachm\\Desktop\\doc.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
       try {
           createBlankTXTFile();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }
}
