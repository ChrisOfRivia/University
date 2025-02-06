package Exercise;

import java.io.*;
import java.util.Scanner;

public class FileReadThreads {
    private static String input;
    private static final Object mutex;

    static {
        input = "";
        mutex = new Object();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File file1 = new File("src/Exercise/file.txt");

        Runnable r1 = () -> {
                while (true) {
                    String input = sc.nextLine();
                    if(input.equals("DONE")){
                        break;
                    }
                    try {
                        synchronized (mutex) {
                        FileWriter fw = new FileWriter(file1);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(input);
                        bw.close();
                        }

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

        Runnable r2 = () -> {
            while(true) {
                try {
                    Thread.sleep(5000);
                    synchronized (mutex) {
                    FileReader fr = new FileReader(file1);
                    BufferedReader br = new BufferedReader(fr);
                    System.out.println(br.readLine());
                    br.close();
                    }


                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
