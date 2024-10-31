package ups.aplicacion.unidad2.modelo;
public class Documental extends ContenidoAudiovisual {
  private String tema;

  // Updated constructor
  public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
    super(titulo, duracionEnMinutos, genero);
    this.tema = tema;
  }

  public String getTema() {
    return tema;
  }

  public void setTema(String tema) {
    this.tema = tema;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles del documental:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Tema: " + this.tema);
    System.out.println();
  }
}
