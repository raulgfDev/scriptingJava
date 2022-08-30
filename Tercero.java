import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Tercero {

    public static String sumar ( int x, int y ) { return String.valueOf( x + y );}
    public static String multiplicar ( int x, int y ) { return String.valueOf( x * y );}
    public static void main(String[] args) {

        System.out.println( "Hola mundo desde JAVA tercero by rgfDev" );
        int x = Integer.parseInt( args[0] );
        int y = Integer.parseInt( args[1] );
        System.out.println( sumar( x, y ) );
        System.out.println( multiplicar(x , y) );
        String persistencia = sumar( x, y ).concat( " " + multiplicar( x, y )
                + " . Esto dos numeros son los resultados del programa "
                + "JAVA, llamado desde el script" );
        File file = new File( "/Users/raul/Dropbox/programacion/scriptingJava/file.txt" );

        try{
            FileWriter writer = new FileWriter( file, false) ;
            BufferedWriter bufferedWriter = new BufferedWriter( writer );
            bufferedWriter.write( persistencia );
            bufferedWriter.close();
            writer.close();
            //send arg = "raul"
            String path = "/Users/raul/Dropbox/programacion/scriptingJava/cuarto.sh " + args[2];
            System.out.println( "_______Llamando a BASH desde JAVA pasando arg_______" );
            Runtime.getRuntime().exec( path );
        }catch (Exception e){
            e.printStackTrace();
        }
    }  
}   