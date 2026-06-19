package actividad4.pkg4;

public class EquipoMaratonProgramacion {
    String nombreEquipo;
    String universidad;
    String lenguajeProgramacion;

    Programador[] programadores;

    int tamañoEquipo;

    EquipoMaratonProgramacion(String nombreEquipo, String universidad,
            String lenguajeProgramacion) {

        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;

        programadores = new Programador[3];

        tamañoEquipo = 0;
    }

    boolean estaLleno() {

        return tamañoEquipo == programadores.length;
    }

    void añadir(Programador programador) throws Exception {

        if (estaLleno()) {

            throw new Exception("El equipo está completo. No se pudo agregar programador.");
        }

        programadores[tamañoEquipo] = programador;

        tamañoEquipo++;
    }

    static void validarCampo(String campo) throws Exception {

        for (int i = 0; i < campo.length(); i++) {

            char c = campo.charAt(i);

            if (Character.isDigit(c)) {

                throw new Exception("El campo no puede contener dígitos.");
            }
        }

        if (campo.length() > 20) {

            throw new Exception("La longitud no debe ser superior a 20 caracteres.");
        }

        if (campo.isEmpty()) {

            throw new Exception("El campo no puede estar vacío.");
        }
    }

    int getTamañoEquipo() {

        return tamañoEquipo;
    }

    Programador getProgramador(int i) {

        return programadores[i];
    }
}
