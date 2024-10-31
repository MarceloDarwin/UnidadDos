package ups.aplicacion.unidad2.modelo;

//Subclase Noticiero que se extiende de ContenidoAudiovisual
public class Noticiero extends ContenidoAudiovisual {
  private String emision;
  //Constructor
  public Noticiero (String titulo, int duracionEnMinutos, String genero, String emision){
    super(titulo, duracionEnMinutos, genero);
    this.emision = emision;
  }

  //getter y setter para emision
  public String getEmision () {
    return emision;
  }

  public void setEmision (String emision) {
    this.emision = emision;
  }
  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles del Noticiero: ");
    System.out.println("ID: " + getId());
    System.out.println("Titulo: " + getTitulo());
    System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    System.out.println("Genero: " + getGenero());
    System.out.println("Emision: " + getEmision());
    System.out.println();
  }
}
