package ups.aplicacion.unidad2.modelo;

public class Investigador {
  private String ambito;
  private boolean gradoUniversitario;

  public Investigador (String ambito, boolean gradoUniversitario) {
    this.ambito = ambito;
    this.gradoUniversitario = gradoUniversitario;
  }

  //Getter y Setter para ambito
  public String getAmbito () {
    return ambito;
  }
  public void setAmbito (String ambito) {
    this.ambito = ambito;
  }

  //Getter y setter para gradoUniversitario
  public boolean getGradoUniversitario () {
    return gradoUniversitario;
  }
  public void setGradoUniversitario (boolean gradoUniversitario) {
    this.gradoUniversitario = gradoUniversitario;
  }
}
