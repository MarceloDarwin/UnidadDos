package ups.aplicacion.unidad2.Vista;

import ups.aplicacion.unidad2.modelo.ContenidoAudiovisual;
import ups.aplicacion.unidad2.Controlador.Controlador;
import java.util.Scanner;

public class VistaUsuario {
  private Controlador controlador;
  private Scanner scanner;

  public VistaUsuario(Controlador controlador) {
    this.controlador = controlador;
    scanner = new Scanner(System.in);
  }

  public void mostrarMenu() {
    int opcion;
    do {
      System.out.println("Seleccione una opcion:");
      System.out.println("1: Añadir documental");
      System.out.println("2: Añadir Película");
      System.out.println("3: Añadir Serie de TV");
      System.out.println("4: Añadir RealityDeTV");
      System.out.println("5: Añadir Noticiero");
      System.out.println("6: Ver Documentales");
      System.out.println("7: Ver Películas");
      System.out.println("8: Ver Series de TV");
      System.out.println("9: Ver Realitys de TV");
      System.out.println("10: Ver Noticieros");
      System.out.println("11: Salir");
      System.out.print("Opción: ");
      opcion = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea

      switch (opcion) {
        case 1:
          addDocumental();
          break;
        case 2:
          addPelicula();
          break;
        case 3:
          addSerieDeTV();
          break;
        case 4:
          addRealityDeTV();
          break;
        case 5:
          addNoticiero();
          break;
        case 6:
          controlador.desplegarDocumentales();
          break;
        case 7:
          controlador.desplegarPeliculas();
          break;
        case 8:
          controlador.desplegarSeriesDeTV();
          break;
        case 9:
          controlador.desplegarRealitysDeTV();
          break;
        case 10:
          controlador.desplegarNoticieros();
          break;
        case 11:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida");
      }
    } while (opcion != 11);
  }

  // Métodos privados para capturar los datos de cada tipo de contenido y añadirlos
  private void addDocumental() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Tema: ");
    String tema = scanner.nextLine();
    controlador.addDocumental(titulo, duracion, genero, tema);
  }

  private void addPelicula() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Estudio: ");
    String estudio = scanner.nextLine();
    controlador.addPelicula(titulo, duracion, genero, estudio);
  }

  private void addSerieDeTV() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Temporadas: ");
    int temporadas = scanner.nextInt();
    scanner.nextLine();
    controlador.addSerieDeTV(titulo, duracion, genero, temporadas);
  }

  private void addRealityDeTV() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Número de Participantes: ");
    int participantes = scanner.nextInt();
    scanner.nextLine();
    controlador.addRealityDeTV(titulo, duracion, genero, participantes);
  }

  private void addNoticiero() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Emisión: ");
    String emision = scanner.nextLine();
    controlador.addNoticiero(titulo, duracion, genero, emision);
  }
}
