package unam.ciencias.computoconcurrente;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] a) throws InterruptedException {
        JOptionPane.showMessageDialog(null,"Jodeeerr","Mensaje de advertencia",
				      JOptionPane.WARNING_MESSAGE);
	System.out.println("Veo que NO nada más corro aquí");
	String op = JOptionPane.showInputDialog(null,"Bienvenido, cómo te llamas?");
	JOptionPane.showMessageDialog(null,"Mucho gusto el conocerte " + op);
	final Filosofo joder = new Filosofo()
	    {
		void hasMagia()
		{
		    System.out.println("has magia");
		}
	    };


    }
}
