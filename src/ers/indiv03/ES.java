package ers.indiv03;

public class ES
{
    static int entero;
    static long enteroLargo;
    static double real;
    static double realLargo;
    static String cadena;
    static String caracter;
    static boolean booleano;
    static String escribir;
    static String escribirln;

    static void leerEntero(int a)
    {
        entero = a;
    }
    static void leerEnteroLargo(long a)
    {
        enteroLargo  = a;
    }
    static void leerReal(double a)
    {
        real  = a;
    }
    static void leerRealLargo (double a)
    {
        realLargo = a;
    }
    static void leerCadena(String a)
    {
        cadena = a;
    }    
    static void leerCaracter(String a)
    {
        caracter = a;
    }    
    static void leerBooleano(boolean a)
    {
        booleano = a;
    }    
    static void Escribir()
    {
        System.out.print(escribir);
    }    
    static void EscribirLn()
    {
        System.out.println(escribirln);
    }       
    public static void main(String[] args) 
    {
    
    }
}