
package lab1_c2_tp1.pkg2024;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    public static void Saludar(){
       System.out.println("Hola");
    }
    
    public static void Despedirse(){
        System.out.println("Chau");
    
    }
    
    
    
}
