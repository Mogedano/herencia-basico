package domain;

public class Persona {

    //Atributos
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //Constructor vacío: podemos crear objetos de tipo persona sin necesidad de inicializar los atributos de esta clase
    public Persona() {

    }

    //Constructor con argumentos
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Constructor completo para inicializar todos los atributos con los argumentos que se reciben
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //getters y setters
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método toString() donde se imprime el estado de este objeto con el valor de cada uno de los atributos de nuestra clase
    //    @Override
    //    public String toString() {
    //        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    //    }

    //Método toString() 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", direccion memoria clase padre Object=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }




}
