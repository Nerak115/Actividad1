package com.example;

public class Usuario {

    String nombre;
    String apellido;
    int edad; 
    String email;

    public void saludar (){
        System.out.println("Hola yo soy" + nombre);
    
    }

    public void mostrarinformación (){
        System.out.print("Nombre: " + nombre);
        System.out.print("Apellido: " + apellido);
        System.out.print("Edad: " + edad);
        System.out.print("Email: " + email);
    }

}
