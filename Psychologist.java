package com.company;

import java.io.IOException;
import java.net.Socket;

public class Psychologist extends CitizenRole{

    public Psychologist(Socket socket,ClientsHandler clientsHandler) throws IOException, ClassNotFoundException {
        super(socket,clientsHandler);

    }

    @Override
    public void run() {
        super.run();
        while (!clientsHandler.isGameState()){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            output.writeObject("The Game Starts Now!\n");
            output.writeObject(Roles.PSYCHOLOGIST);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
