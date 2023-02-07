import javax.swing.JOptionPane;
public class PuntoC {

    public static void main(String[] args) {
     String input = JOptionPane.showInputDialog("Ingrese un número:");
        int number = Integer.parseInt(input);
        if (EsBinario(number)) {
            JOptionPane.showMessageDialog(null, "El número ingresado Si es binario");
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado NO es binario");
        }
    }
        public static boolean EsBinario(int n) {
        if (n == 0 || n == 1) { //Esta es la base del metodo si "n" es 0 o 1, significa que el numero es
            //binario y se devuelve un true
            return true;
        } else if (n < 0) { // Este "if" se utiliza para verficar si el numero es negativo. Si es asi, significa que el numero no es binario
            return false;
        } else {
            int lastDigit = n % 10;
            if (lastDigit > 1) {
            //Si el último dígito es mayor que 1, significa que el número no es binario y se devuelve false.
                return false;
            } else {
                return EsBinario(n / 10);
            //Si el último dígito es 0 o 1, se elimina el último dígito del número dividiendo n por 10. Por ejemplo, si n es 123, el nuevo número será 12. Luego, se llama al método EsBinario recursivamente con el nuevo número como entrada. 
            //Este proceso se repetirá hasta que el número sea 0 o 1 o hasta que se encuentre un dígito mayor que 1. En ese momento, la recursión terminará y se devolverá el valor adecuado de true o false.
            }
        }
    }

}
       
