import java.io.IOException;
import java.nio.file.*;


public class GestorTaller{
    public static void main(String[] args) throws IOException {
        Path dir = Path.of(System.getProperty("user.dir"));
        Path rutaRecepcion = Path.of("motortech_garage" , "recepcion");


        if(Files.notExists(rutaRecepcion)){
            Files.createDirectories(rutaRecepcion);
            System.out.println("Carpeta creada correctamente: " + rutaRecepcion);
        }else{
            System.out.println("La carpeta ya existe");
        }

        Path rutaFichero = rutaRecepcion.resolve("entrada_temp.tmp");
        if(Files.notExists(rutaFichero)){
            Files.createFile(rutaFichero);
            System.out.println("Fichero creado correctamente en: " + rutaFichero);
        }else{
            System.out.println("El fichero ya existe");
        }

        System.out.println(rutaFichero.getFileName());
        System.out.println(rutaFichero.toAbsolutePath());
        System.out.println(Files.size(rutaFichero));
        System.out.println(Files.isWritable(rutaFichero));
    }
}
