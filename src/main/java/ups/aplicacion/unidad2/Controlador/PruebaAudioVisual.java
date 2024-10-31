package ups.aplicacion.unidad2.Controlador;
import ups.aplicacion.unidad2.Vista.VistaUsuario;
import ups.aplicacion.unidad2.modelo.*;

import java.util.ArrayList;


public class PruebaAudioVisual {
  public static void main(String[] args) {
    // Crear una instancia del controlador
    Controlador controlador = new Controlador();

    // Precargar contenido audiovisual
    controlador.precargarBaseDeDatos();

    // Crear una instancia de VistaUsuario
    VistaUsuario vista = new VistaUsuario(controlador);

    // Mostrar el menú de opciones
    vista.mostrarMenu();
  }
}

