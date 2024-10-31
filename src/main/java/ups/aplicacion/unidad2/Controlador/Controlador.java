package ups.aplicacion.unidad2.Controlador;

import ups.aplicacion.unidad2.modelo.*;
import java.util.ArrayList;

public class Controlador {
  private ArrayList<Documental> documentales = new ArrayList<>();
  private ArrayList<Pelicula> peliculas = new ArrayList<>();
  private ArrayList<SerieDeTV> seriesDeTV = new ArrayList<>();
  private ArrayList<RealityDeTv> realitysDeTv = new ArrayList<>();
  private ArrayList<Noticiero> noticieros = new ArrayList<>();

  // Método para precargar contenido audiovisual en las listas
  public void precargarBaseDeDatos() {
    peliculas.add(new Pelicula("Avatar", 125, "Accion", "20th Century Studios"));
    seriesDeTV.add(new SerieDeTV("Game of Thrones", 60, "Fantasy", 8));
    documentales.add(new Documental("Cosmos", 45, "Science", "Astronomy"));
    realitysDeTv.add(new RealityDeTv("Combate", 120 , "Entretenimiento", 14));
    noticieros.add(new Noticiero("Televistazo", 120, "Noticiero", "Matutina"));
  }

  // Métodos de agregar contenido
  public void addDocumental(String titulo, int duracionEnMinutos, String genero, String tema) {
    Documental doc = new Documental(titulo, duracionEnMinutos, genero, tema);
    documentales.add(doc);
  }

  public void addPelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
    Pelicula peli = new Pelicula(titulo, duracionEnMinutos, genero, estudio);
    peliculas.add(peli);
  }

  public void addSerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
    SerieDeTV serie = new SerieDeTV(titulo, duracionEnMinutos, genero, temporadas);
    seriesDeTV.add(serie);
  }

  public void addRealityDeTV(String titulo, int duracionEnMinutos, String genero, int numDeParticipantes) {
    RealityDeTv reality = new RealityDeTv(titulo, duracionEnMinutos, genero, numDeParticipantes);
    realitysDeTv.add(reality);
  }

  public void addNoticiero(String titulo, int duracionEnMinutos, String genero, String emision) {
    Noticiero noticiero = new Noticiero(titulo, duracionEnMinutos, genero, emision);
    noticieros.add(noticiero);
  }

  // Métodos para desplegar contenido
  public void desplegarDocumentales() {
    for (Documental doc : documentales) doc.mostrarDetalles();
  }

  public void desplegarPeliculas() {
    for (Pelicula peli : peliculas) peli.mostrarDetalles();
  }

  public void desplegarSeriesDeTV() {
    for (SerieDeTV serie : seriesDeTV) serie.mostrarDetalles();
  }

  public void desplegarRealitysDeTV() {
    for (RealityDeTv reality : realitysDeTv) reality.mostrarDetalles();
  }

  public void desplegarNoticieros() {
    for (Noticiero noticiero : noticieros) noticiero.mostrarDetalles();
  }
}

