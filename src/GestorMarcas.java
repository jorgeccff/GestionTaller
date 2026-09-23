import java.io.IOException;
import java.nio.file.*;

public class GestorMarcas {
    public static void main(String[] args) {

    Path dirSeat = Path.of("motortech_garage" , "marcas", "seat");
    Path dirToyota = Path.of("motortech_garage" , "marcas", "toyota");
    Path dirEntregados = Path.of("motortech_garage" , "entregados");

    Path ibiza = dirSeat.resolve("ibiza_1234BBB.car");
    Path leon = dirSeat.resolve("leon_5678CCC.car");
    Path corolla = dirToyota.resolve("corolla_9012DDD.car");

            try {
                Files.createDirectories(dirSeat);
                Files.createDirectories(dirToyota);
                Files.createDirectories(dirEntregados);

                crearFicheros(ibiza);
                crearFicheros(leon);
                crearFicheros(corolla);
                System.out.println("Carpeta creada correctamente");
            } catch (NoSuchFileException e) {
                System.out.println("Error al crear las carpetas" + e.getMessage());
            } catch (IOException e){
                System.out.println("Error en el disco" +e.getMessage());
            }
    }

    public static void crearFicheros(Path rutaFichero) throws IOException{
        if (Files.notExists(rutaFichero)){
            Files.createFile(rutaFichero);
            System.out.println("Fichero creado correctamente : "+ rutaFichero);
        }else{
            System.out.println("Fichero existente: " + rutaFichero);
        }
    }
}

