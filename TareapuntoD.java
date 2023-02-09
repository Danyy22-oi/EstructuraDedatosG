

package com.mycompany.tareapuntod;
import javax.swing.JOptionPane;

public class TareapuntoD {

    public static void main(String[] args) {
        exponencial();
       
         }
    public static void exponencial(){
        int n;
        int x;
       n=Integer.parseInt(JOptionPane.showInputDialog("Digite n:"));
       x=Integer.parseInt(JOptionPane.showInputDialog("Digite x:"));
        double result;
        result=calcularExponen(n,x,0,0);
        System.out.println("El resultado es:"+result);  
    }
    public static double calcularExponen(int n, int x, int i, double result){
        if(i==n){
            return result;
        }
        if(i==0){
            result=result+(Math.pow(x,i)/calcFactorial(i+1));
        } else{
            result=result+(Math.pow(x,i)/calcFactorial(i));
        }
        return calcularExponen(n,x,i+1,result);
    }
    public static double calcFactorial(int x){
        double result;
        if(x==1){
            result=1;
        }else{
            result=x*calcFactorial(x-1);
        }
        return result;
    }
}
