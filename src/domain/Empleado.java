package domain;

//La clase Empleado hereda de Persona
public class Empleado extends Persona {

    //Los atributos son privados porque no está previsto que ninguna clase herede de Empleado
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; //este atributo está asociado a la clase

    //Constructor vacío
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    //Constructor
    public Empleado(String nombre, double sueldo) {        
        //super(nombre);  //El argumento nombre lo propagamos hacia la clase padre
        this(); //Llamamos al constructor vacío de esta clase
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //toString() utilizando Use StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        //sb.append(", nombre=").append(this.nombre);  //Esto es equivalente a: sb.append(", nombre=").append(this.getNombre());
        //En la siguiente línea utilizamos el toString() de la clase padre
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
