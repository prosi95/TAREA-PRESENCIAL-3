package ers.indiv03;

public class Libro
{ 
    String nombre;
    String autor;
    String descripcion;
    int paginas;
    Libro(String a, String b, String c, int d)
    {
        nombre = a;
        autor = b;
        descripcion = c;
        paginas = d;
    }
    String getNombre()
    {
         return nombre;
    }
    void setNombre(String a)
    {
        nombre = a;
    }
    String getAutor()
    {
         return autor;
    }
    void setAutor(String a)
    {
        autor = a;
    }  
    String getDescripcion()
    {
         return descripcion;
    }
    void setDescripcion(String a)
    {
        descripcion = a;
    }
    int getPaginas()
    {
         return paginas;
    }
    void setPaginas(int a)
    {
        paginas = a;
    }
    String toString2()
    {
        return nombre+" "+autor+" "+descripcion+" "+paginas;
    }
    public static void main(String[] args) 
    {
         Libro HarryPotter = new Libro("Harry Potter", "J.K.", "Un mago", 3);
         //System.out.println(HarryPotter.autor+HarryPotter.nombre);
         //System.out.println(HarryPotter.getNombre());
         HarryPotter.setNombre("HP");
         System.out.println(HarryPotter.toString2());
    }
}

