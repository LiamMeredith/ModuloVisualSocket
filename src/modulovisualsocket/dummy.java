/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulovisualsocket;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.physicballs.items.*;

/**
 *
 * @author Liam-Portatil
 */
public class dummy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModuloVisualSocket c = new ModuloVisualSocket();
        Scanner i = new Scanner(System.in);
        boolean exit = false;
        int option = 0;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. send ball");
            System.out.println("2. view walls");
            System.out.println("3. view balls");
            System.out.println("4. create ball");
            System.out.println("0. exit");
            option = i.nextInt();
            i = new Scanner(System.in);
            switch (option) {
                case 1:
                    System.out.println("1 top 2 bottom 3 left 4 right");
                    int n = i.nextInt();
                    switch (n) {
                        case 1:
                            c.sendBall(new Ball(), Walls.wall.TOP);
                            break;
                        case 2:
                            c.sendBall(new Ball(), Walls.wall.BOTTOM);
                            break;
                        case 3:
                            c.sendBall(new Ball(), Walls.wall.LEFT);
                            break;
                        case 4:
                            c.sendBall(new Ball(), Walls.wall.RIGHT);
                            break;
                    }
                    i = new Scanner(System.in);
                    break;
                case 2:
                    ArrayList<Walls.wall> w = c.getWalls();
                    for (int j = 0; j < w.size(); j++) {
                        System.out.println(w.get(j));
                    }
                    break;
                case 3:
                    Ball b = new Ball();
                    (new Thread() {
                        public void run() {
//                            b.getTime();
//                            while (true) {
//                                Physics.ballMovement(this, space);
//                                do {
//                                    try {
//                                        Thread.sleep(15);
//                                    } catch (InterruptedException ex) {
//                                        Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//                                } while (b.isActive());
//                            }
                        }
                    }).start();

                    break;

                case 0:
//                    c.live = false;
                    exit = true;
                    break;
            }
        }

    }

}
