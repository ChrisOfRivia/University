package Test;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
    private List<PrintStream> clients;
    private static final Object mutex;

    static {
        mutex = new Object();
    }

    private Server() {
        clients = new ArrayList<>();
    }


    public static void main(String[] args) {
        new Server().start();

    }

    private void start() {
        try {
            ServerSocket  socket = new ServerSocket(2101);

            //Server awaits client
            while(true){
                Socket client = socket.accept();

                //Thread for clients, so multiple Clients can send messages
                Thread clientThread = new Thread(() -> {
                    try{
                        //Write and read
                        Scanner in = new Scanner(client.getInputStream());
                        PrintStream out = new PrintStream(client.getOutputStream());

                        //Adds client to the List<PrintStream>
                        synchronized (mutex) {
                            clients.add(out);
                        }

                        //Awaits input, if quit close all
                        while(true){
                            String line = in.nextLine();
                            if(line.contains("quit")){
                                synchronized (mutex) {
                                    clients.remove(out);
                                }
                                in.close();
                                out.close();
                                client.close();
                                break;
                            }
                            //Show input for every client
                            synchronized (mutex) {
                                for(PrintStream c: clients){
                                    c.println(line);
                                }
                            }
                        }
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                clientThread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
