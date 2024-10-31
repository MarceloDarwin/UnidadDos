package ups.aplicacion.unidad2.Controlador;

import org.junit.jupiter.api.Test;
import ups.aplicacion.unidad2.modelo.Documental;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {
 @Test
  void testPrecargarBaseDeDatos() {
   Controlador controlador = new Controlador();
   controlador.precargarBaseDeDatos();
 }
}
