/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author kartikey
 */
public class SuperMarket {
    public static int BarCodeGenerator()
    {
        int i=899999;
        Random rand = new Random();
        //System.out.print("I:"+rand.nextInt(i+100000));
        return rand.nextInt(i);
    }
    public static void MessageDisplay(String Display)
    {
        try {
        FileWriter fw = new FileWriter("/home/kartikey/NetBeansProjects/SuperMarket/Database/Notifier.sh");

            try (PrintWriter pw = new PrintWriter(fw)) {
                pw.println("notify-send \""+Display+"\" ");
            }
    } catch (IOException e1) {
    }

    Process proc = null;

    try {
        proc = Runtime.getRuntime().exec("bash /home/kartikey/NetBeansProjects/SuperMarket/Database/Notifier.sh");
    } catch (IOException e) {
    }
    }
    
    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String[] args) {
       MessageDisplay("Rice");
        // TODO code application logic here
    }
}
