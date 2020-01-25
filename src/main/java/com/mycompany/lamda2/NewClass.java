package com.mycompany.lamda2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NewClass {

    public static void main(String[] args) {

        int n;

        List<Integer> numeros = new ArrayList();
        
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Introduce 10 numeros");

            

            n = entrada.nextInt();

            numeros.add(n);
        }
        
        System.out.println("Numeros pares ordenados: ");
        
        numeros.stream().filter((e) -> (e%2==0)).sorted().collect(Collectors.toList()).stream().forEach(x->System.out.println(x));
        
        System.out.println("Numeros impares ordenados: ");
        
        numeros.stream().filter((e) -> (!(e%2==0))).sorted().collect(Collectors.toList()).stream().forEach(x->System.out.println(x));
        
        System.out.println("Numeros positivos ordenados: ");
        
         numeros.stream().filter((e) -> (e>0)).sorted().collect(Collectors.toList()).stream().forEach(x->System.out.println(x));
         
        System.out.println("Numeros negativos ordenados: ");
        
         numeros.stream().filter((e) -> (e<0)).sorted().collect(Collectors.toList()).stream().forEach(x->System.out.println(x));
         
         
        System.out.println("Numeros pares positivos orndenados: ");
        
        numeros.stream().filter((e) -> ((e%2==0) && (e>0))).sorted().collect(Collectors.toList()).stream().forEach(x->System.out.print(x));
        
    } 
    
    
       

}
