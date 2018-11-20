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
    ES(int a, long b, double c, double d, String e, String f, boolean g)
    {
        entero = a;
        enteroLargo = b;
        real = c;
        realLargo = d;
        cadena = e;
        caracter = f;
        booleano = g;
    }
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
    
    }    
    static void EscribirLn()
    {
    
    }       
    /*
    }
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        ES obj = new ES();
        System.out.println("Introduzca un numero");
        int numeroIntroducidoNormal;
        long numeroIntroducidoLargo;
        int aa = 1;
        long bb = 1;
        long c = aa+bb;
        try {
            numeroIntroducidoNormal = keyboard.nextInt();
            obj.leerEntero(numeroIntroducidoNormal);
        }
        catch (Exception a) {
            System.out.println("Exception1 occurred: "+a);
            try {
                numeroIntroducidoLargo = keyboard.nextLong();
                obj.leerEnteroLargo(numeroIntroducidoLargo);
            }
            catch (Exception b) {
                System.out.println("Exception2 occurred: "+b);
            }
        }
        
    }*/
}