package ups.aplicacion.unidad2.modelo;

//Subclase RealityDeTv que extiende de ContenidoAudiovisual
public class RealityDeTv extends ContenidoAudiovisual{
  private int numDeParticipantes;

  //Constructor
  public RealityDeTv (String titulo, int duracionEnMinutos, String genero, int numDeParticipantes) {
    super(titulo, duracionEnMinutos, genero);
    this.numDeParticipantes = numDeParticipantes;
  }

  //getter y setter numDeParticipnates
  public int getNumDeParticipantes () {
    return numDeParticipantes;
  }
  public void setNumDeParticipantes (int numDeParticipantes) {
    this.numDeParticipantes = numDeParticipantes;
  }

  @Override
  public void mostrarDetalles () {
    System.out.println("Detalles de el Reality:");
    System.out.println("ID: " + getId());
    System.out.println("Titulo: " + getTitulo());
    System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    System.out.println("Genero: " + getGenero());
    System.out.println("Numero de Participantes: " + getNumDeParticipantes());
    System.out.println();
  }
}
