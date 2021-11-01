
package Personas;


public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String otroAtributo;

    public Persona() {
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura, String otroAtributo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.otroAtributo = otroAtributo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getOtroAtributo() {
        return otroAtributo;
    }

    public void setOtroAtributo(String otroAtributo) {
        this.otroAtributo = otroAtributo;
    }

    @Override
    public String toString() {
        return "Persona{ ID= "+id + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", otroAtributo=" + otroAtributo + '}';
    }
}
