package com.krakeDev.Taller.Exepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    private static final Logger log =LogManager.getLogger(Test.class);

    public static void main(String[] args) {

        String telefono = "0998877766";

        try {
            ValidarContacto.validarTelefono(telefono);

            GuardarContacto.guardar(telefono);

            LeerContacto.main(args);

            log.info("Se guardo el telefono de forma exitosa");

        } catch (IllegalArgumentException e) {
            log.error("Error: El telefono es invalido", e);
        }
    }
}
