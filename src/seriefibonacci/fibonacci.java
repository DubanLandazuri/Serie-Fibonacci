package seriefibonacci;

import java.util.Scanner;

public class fibonacci {
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        
        //esta son la varibles que almacenaran los datos ingresados
        //se incializa laas variables a en 0 y b en una para luegue hacer la suma
        //la varieble c sera la encargada de hacer la suma
        int a = 0, b = 1, c , n;
        
        // Se manda un menaje para que el usuario ingreso el numero o la frecuaencia que se desea imprimir
        System.out.print("Ingrese la cantidad de elementos para la serie: ");
        //el dato ingresado se almacenara en la variable
        n = scanner.nextInt();
        
        for (int i = 0; 1 < n; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
  
        }
    } 
    
    
}
