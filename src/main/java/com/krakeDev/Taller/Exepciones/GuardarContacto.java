package com.krakeDev.Taller.Exepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuardarContacto  {

    private static final Logger log = LogManager.getLogger(GuardarContacto.class);

    public static void guardar (String telefono) {

        FileWriter escritor = null;

        try {
            escritor = new FileWriter("contactos.txt", true);

            escritor.write("Nombre: Maria\n");
            escritor.write("Apellido: Gomez\n");
            escritor.write("Telefono: " + telefono + "\n");

            log.info("Contacto guardado exitosamente");

        } catch (IOException e) {
            log.error("Error al guardar el contacto", e);

        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                    log.info("Archivo cerrado correctamente");
                } catch (IOException e) {
                    log.error("Error al cerrar el archivo", e);
                }
            }
        }
    }
}

