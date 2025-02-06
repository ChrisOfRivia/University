package Test;

import java.io.*;
import java.nio.Buffer;

public class Example {
    public static void main(String[] args) {


        String s = null;

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();

        }catch (IOException e){
            e.printStackTrace();
        }

        // try(...) plays the role of finally (you don't need to close the file)
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/Test/text.txt"));) {
            bw.write(s);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
