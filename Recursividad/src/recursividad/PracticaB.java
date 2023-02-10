package recursividad;


public class PracticaB {
    
     public static int SumaRecursiva(int numero){
        
        int res;
            
        if (numero==1){
            return 1;
        }else{
            res=numero+SumaRecursiva(numero-1);
        }
        return res;
    }
    
}
