package com.example;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.nombre = "Carlos";
        usuario1.apellido = "Ortiz";
        usuario1.edad = 25;
        usuario1.email = "mari@gmail.com";

        usuario2.nombre = "Maria";
        usuario2.apellido = "Gomez";
        usuario2.edad = 25;
        usuario2.email = "mari@gmail.com";

        System.out.println("....................");
        usuario1.saludar();
        usuario1.mostrarinformación();
        System.out.println(".................."); 
        usuario2.saludar();
        usuario2.mostrarinformación();
        
        System.out.println("Hello world!");}

public static void saludar(String nombre){}
    }