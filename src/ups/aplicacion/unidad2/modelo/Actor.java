package ups.aplicacion.unidad2.modelo;

public class Actor {
  private String nombre;
  private String genero;
  private int numDePeliculas;
  private boolean tieneUnOscar;

  // Constructor
  public Actor(String nombre, String genero, int numDePeliculas, boolean tieneUnOscar) {
    this.nombre = nombre;
    this.genero = genero;
    this.numDePeliculas = numDePeliculas;
    this.tieneUnOscar = tieneUnOscar;
  }

  // Getter y Setter para nombre
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Getter y Setter para numDePeliculas
  public int getNumDePeliculas() {
    return numDePeliculas;
  }

  public void setNumDePeliculas(int numDePeliculas) {
    this.numDePeliculas = numDePeliculas;
  }

  // Getter y Setter para tieneUnOscar
  public boolean isTieneUnOscar() {
    return tieneUnOscar;
  }

  public void setTieneUnOscar(boolean tieneUnOscar) {
    this.tieneUnOscar = tieneUnOscar;
  }

  // Getter y Setter para genero
  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }
}
