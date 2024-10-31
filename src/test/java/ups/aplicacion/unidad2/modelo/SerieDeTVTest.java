package ups.aplicacion.unidad2.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerieDeTVTest {
  @Test
    void testConstructor () {
    SerieDeTV serie = new SerieDeTV("UPS serie", 56, "Novela", 3);
    assertEquals("UPS serie", serie.getTitulo());
    assertEquals(56, serie.getDuracionEnMinutos());
    assertEquals("Novela", serie.getGenero());
    assertEquals(3, serie.getTemporadas());
    }
  @Test
  void testGetandSet () {
    SerieDeTV serie = new SerieDeTV("UPS serie", 56, "Novela", 3);
    serie.setTemporadas(4);
    assertEquals(4, serie.getTemporadas());
  }

}
