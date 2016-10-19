/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p17;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c,d;
       a = pedirNumero();
       b = pedirNumero();
       //Pude poner la condicion del numero en el mismo metodo de calcular pero asi seria más facil de encontrar el error
       c = mayor(a,b);
       d = calcular(a,b,c);
       Mostrar(d);
    }
    public static int pedirNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba una cantidad");
        return n = entrada.nextInt();
    }
    public static int mayor(int a, int b){
        //Se tiene que determinar cual es el numero más alto para que podamos evaluar todos los casos
        int c=0;
        if(a>b){
            c = a;
        }else{
            c = b;
        }
        return c;
    }
    public static int calcular (int a, int b, int c){
        int d = 0,i;
        //La letra c es el numero más alto entr a y b
        for (i=1;i<=c;i++){
            if (a%i==0&&b%i==0)
                d = i;
            //Se guarda en la variable i solo si es divisible entro los 2 números
        }
        return d;
    }
    public static void Mostrar(int d){
        System.out.println("El divisor más alto de los 3 números es " +d);
    }
}
