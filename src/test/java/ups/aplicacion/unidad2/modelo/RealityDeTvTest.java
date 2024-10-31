package ups.aplicacion.unidad2.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealityDeTvTest {
  @Test
  void testConstructor () {
    RealityDeTv reality = new RealityDeTv("UPS Reality", 60, "Entretenimiento", 25);
    assertEquals("UPS Reality", reality.getTitulo());
    assertEquals(60, reality.getDuracionEnMinutos());
    assertEquals("Entretenimiento", reality.getGenero());
    assertEquals(25, reality.getNumDeParticipantes());
  }

  @Test
  void testGetAndSet () {
    RealityDeTv reality = new RealityDeTv("UPS Reality", 60, "Entretenimiento", 25);
    reality.setNumDeParticipantes(12);
    assertEquals(12, reality.getNumDeParticipantes());
  }
}
