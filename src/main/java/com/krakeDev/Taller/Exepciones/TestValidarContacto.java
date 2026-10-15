package com.krakeDev.Taller.Exepciones;

public class TestValidarContacto {

    public static void main(String[] args) {

        ValidarContacto.validarTelefono("0981234567");

        System.out.println("Telefono valido");
        
        
        ValidarContacto.validarTelefono("12345");
    }
}
