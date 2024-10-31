package ups.aplicacion.unidad2.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentalTest {
  @Test
  void testConstructor() {
    Documental documental = new Documental("Salesianos", 60, "Documental", "Cultura");

    assertEquals("Salesianos",
      documental.getTitulo());
    assertEquals(60,
      documental.getDuracionEnMinutos());
    assertEquals("Documental", documental.getGenero());
    assertEquals("Cultura", documental.getTema());
  }
  @Test
  void getAndSetTema () {
    Documental documental = new Documental("Salesianos", 60, "Documental", "Futbol");
    documental.setTema("Biografia");
    assertEquals("Biografia", documental.getTema());
  }
}


