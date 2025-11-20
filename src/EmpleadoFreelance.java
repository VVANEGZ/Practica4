public class EmpleadoFreelance extends Empleado implements Beneficiable{
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(int horasTrabajadas, double tarifaHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public EmpleadoFreelance(String id, String nombre, double salarioBase, int horasTrabajadas, double tarifaHora) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public EmpleadoFreelance() {
        super();
    }

    @Override
    public double calcularBonificacion() {
        if(horasTrabajas>160){
            return (horasTrabajadas * tarifaHora)*0.05;
        } else{
            return 0;
        }
    }

    @Override
    public double calcularSalario() {
        double pagoPorHoras= horasTrabajadas * tarifaHora;
        return pagoPorHoras + calcularBonificacion();
    }

    @Override
    public double aplicarDescuentoSeguro() {
        return calcularSalario()*0.03;
    }
}
