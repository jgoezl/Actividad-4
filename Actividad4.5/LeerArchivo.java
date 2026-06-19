package actividad4.pkg5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerArchivo {
    String nombreArchivo;

    LeerArchivo(String nombreArchivo){

        this.nombreArchivo = nombreArchivo;

    }

    String leer() throws IOException{

        FileInputStream archivo;

        InputStreamReader conversor;

        BufferedReader filtro;

        String linea;

        String contenido = "";

        archivo = new FileInputStream(nombreArchivo);

        conversor = new InputStreamReader(archivo);

        filtro = new BufferedReader(conversor);

        linea = filtro.readLine();

        while(linea != null){

            contenido += linea + "\n";

            linea = filtro.readLine();

        }

        filtro.close();

        return contenido;

    }

}

