package unam.ciencias.computoconcurrente;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
 
        Filosofo[] filosofos = new Filosofo[5];
        Object[] palillos = new Object[filosofos.length];
 
        for (int i = 0; i < palillos.length; i++) {
            palillos[i] = new Object();
        }
 
        for (int i = 0; i < filosofos.length; i++) {
            Object izq = palillos[i];
            Object der = palillos[(i + 1) % palillos.length];
 
            filosofos[i] = new Filosofo(izq, der);
             
            Thread t 
		= new Thread(filosofos[i], "Filosofo " + (i + 1));
            t.start();
        }
    }

    
}
