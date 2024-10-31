package ups.aplicacion.unidad2.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoticieroTest {
  @Test
  void testConstructor () {
    Noticiero noticiero = new Noticiero("UPS Informa", 120, "Informativo", "Estelar");
    assertEquals("UPS Informa", noticiero.getTitulo());
    assertEquals(120, noticiero.getDuracionEnMinutos());
    assertEquals("Informativo", noticiero.getGenero());
    assertEquals("Estelar", noticiero.getEmision());
  }

  @Test
  void testGetAndSet () {
    Noticiero noticiero = new Noticiero("UPS Informativo", 120, "Informativo", "Estelar");
    noticiero.setEmision("Matutina");
    assertEquals("Matutina", noticiero.getEmision());
  }
}
