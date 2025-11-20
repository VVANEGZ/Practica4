public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    //getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    //metodos
    public abstract double calcularSalario();


    public void mostrarInfo() {
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario Base: "+salarioBase);
    }
}
