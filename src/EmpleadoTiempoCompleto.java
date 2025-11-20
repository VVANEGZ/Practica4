public class EmpleadoTiempoCompleto extends Empleado implements Beneficiable{
    private int antiguedad;
    private String departamento;

    public EmpleadoTiempoCompleto(int antiguedad, String departamento) {
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, int antiguedad, String departamento) {
        super(id, nombre, salarioBase);
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return salarioBase+calcularBonificacion();
    }

    @Override
    public double calcularBonificacion() {
        return salarioBase * 0.10 * antiguedad;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        return calcularSalario()*0.05;
    }
}
