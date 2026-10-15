
package com.krakeDev.Taller.Exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerContacto {

    private static final Logger log =LogManager.getLogger(LeerContacto.class);

    public static void main(String[] args) {

        BufferedReader lector = null;
        FileReader archivo =null;

        try {
            archivo = new FileReader("contactos.txt");
            lector = new BufferedReader(archivo);          

            for (String linea; (linea = lector.readLine()) != null; ) {
                System.out.println(linea);
                log.info("Linea leida: " + linea);
            }

            log.info("Archivo leido correctamente");

        } catch (FileNotFoundException e) {
            log.error("No se encontro el archivo", e);

        } catch (IOException e) {
            log.error("Ocurrio un error al leer el archivo", e);

        } finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    log.error("Error al cerrar el archivo", e);
                }
            }
        }
    }
}
