
package recursividad;

import static recursividad.PracticaB.SumaRecursiva;


public class Recursividad {

    
    public static void main(String[] args) {
      
        PracticaB pra = new PracticaB();
        
        int N=5;
        int resultado = SumaRecursiva(N);
        
        System.out.println(resultado);
    }
}
