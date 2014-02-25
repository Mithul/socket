/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverprog;

import java.io.*;
import java.net.*;

/**
 *
 * @author mithul
 */
public class ClientProg {

    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        ClientProg Client = new ClientProg();
        Client.run();
    }

    public void run() throws UnknownHostException, IOException {
        Socket cs = new Socket("localhost", 444);
System.out.println(" Connected ");
        InputStreamReader IR2 = new InputStreamReader(System.in);
        BufferedReader BR2 = new BufferedReader(IR2);
        String oup = BR2.readLine();
        System.out.println(" User got ");
       
        System.out.println(" sending ");
       
            PrintStream PS = new PrintStream(cs.getOutputStream());
            PS.println(oup);

        
         System.out.println(" sent ");
         InputStreamReader IR = new InputStreamReader(cs.getInputStream());
        BufferedReader BR = new BufferedReader(IR);
        String inp = BR.readLine();
    }
}
