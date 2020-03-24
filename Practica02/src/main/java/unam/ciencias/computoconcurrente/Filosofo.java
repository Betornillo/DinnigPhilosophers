package unam.ciencias.computoconcurrente;

/**
 *  Cada filósofo se ejecuta en un hilo.
 */
public abstract class Filosofo implements Runnable {
    public static int DEFAULT_TABLE_SIZE = 5;

    protected int id;
    @Override
    public void run()
    {
	System.out.println("wuhuuu");
	System.out.println("Estoy corriendo dentro del run del filosofo");
	
    }
		public int contador(int cuenta)
		{
		    cuenta = cuenta + 6;
		    return cuenta;
		}
    
    void otro()
    {
	System.out.println("Este es un metodo ajeno que se agregó a la clase filosofo");	
    }
}
