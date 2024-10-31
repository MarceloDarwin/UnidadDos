package ups.aplicacion.unidad2.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeliculaTest {
@Test
  void testConstrutor () {
  Pelicula peli = new Pelicula("Marcelo Man", 120, "Accion", "UPS estudio" );
  assertEquals("Marcelo Man", peli.getTitulo());
  assertEquals(120, peli.getDuracionEnMinutos());
  assertEquals("Accion", peli.getGenero());
  assertEquals("UPS estudio", peli.getEstudio());
 }
@Test
 void testGetAndSet () {
  Pelicula peli = new Pelicula("Marcelo Man", 120, "Accion", "UPS estudio" );
  peli.setEstudio("Salesiana Estudios");
  assertEquals("Salesiana Estudios", peli.getEstudio());
}
}
