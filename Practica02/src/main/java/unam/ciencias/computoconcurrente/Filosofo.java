package unam.ciencias.computoconcurrente;

public class Filosofo implements Runnable {


    private Object izq;
    private Object der;
 
    public Filosofo(Object izq, Object der) {
        this.izq = izq;
        this.der = der;
    }    
   // Member variables, methods defined earlier
     private void ejecuta(String programa) throws InterruptedException {
        System.out.println(
          Thread.currentThread().getName() + " " + programa);
        Thread.sleep(((int) (Math.random() * 100)));
    }
    @Override
    public void run() {
        try {
            while (true) {
                 
                // thinking
                ejecuta("Pensando"+
			" Han pasado " + System.nanoTime() + " nanosegundos");
                synchronized (izq) {
                    ejecuta("Tiene el palillo izquierdo"+
			    " --- Han pasado: " +
                      System.nanoTime() + " nanosegundos"
                        );
                    synchronized (der) {
                        // eating
                        ejecuta("Tiene el palillo derecho - está comiendo"+
				" Han pasado: " +
                          System.nanoTime() + " nanosegundos"
                            ); 
                         
                        ejecuta("Dejó en la mesa el palillo derecho"+
				" Han pasado: " + 
                          System.nanoTime() + " nanosegundos"
                            );
                    }
                     
                    // Back to thinking
                    ejecuta("Dejó el palillo izquierdo. Volverá a meditar por un rato"+
			    " Han pasado: " +
                      System.nanoTime() + " nanosegundos"
                        );
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}
