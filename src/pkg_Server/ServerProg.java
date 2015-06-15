/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Mithun Chakaravarrti
 */
public class ServerProg {

    public static void main(String[] args) throws IOException {

        ServerProg Server = new ServerProg();
        Server.run();

    }

    public void run() throws IOException {
        ServerSocket ss = new ServerSocket(4444);
        Socket s = ss.accept();
        String inp, oup;
        System.out.println(" Connected ");

        InputStreamReader IR2 = new InputStreamReader(System.in);
        BufferedReader BR2 = new BufferedReader(IR2);
        oup = BR2.readLine();
        System.out.println(" Got from user ");

        InputStreamReader IR = new InputStreamReader(s.getInputStream());
        BufferedReader BR = new BufferedReader(IR);
        inp = BR.readLine();
        System.out.println("Client: " + inp);

        PrintStream PS = new PrintStream(s.getOutputStream());
        PS.println(oup);

    }

}
