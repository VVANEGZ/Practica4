public class Main {
    public static void main(String[] args) {
        System.out.println("=== DETALLES EMPLEADO TIEMPO COMPLETO ===");

        EmpleadoTiempoCompleto empFijo = new EmpleadoTiempoCompleto(
                "Juan Pérez",
                "TC-001",
                10000.0,
                5,
                "Tecnología"
        );

        empFijo.mostrarInfo();

        System.out.println("Departamento: " + empFijo.getDepartamento());
        System.out.println("Antigüedad: " + empFijo.getAntiguedad() + " años");
        System.out.println("Bonificación: $" + empFijo.calcularBonificacion());
        System.out.println("Salario Final: $" + empFijo.calcularSalario());
        System.out.println("Descuento Seguro: $" + empFijo.aplicarDescuentoSeguro());
        System.out.println("\n-------------------------------------------------------\n");

        System.out.println("=== DETALLES EMPLEADO FREELANCE ===");

        EmpleadoFreelance empFree = new EmpleadoFreelance(
                "Ana López",
                "FL-099",
                0.0,
                170,
                500.0
        );

        empFree.mostrarInfo();

        System.out.println("Horas Trabajadas: " + empFree.getHorasTrabajadas());
        System.out.println("Tarifa por Hora: $" + empFree.getTarifaHora());

        System.out.println("Bonificación: $" + empFree.calcularBonificacion());
        System.out.println("Salario Final: $" + empFree.calcularSalario());
        System.out.println("Descuento Seguro: $" + empFree.aplicarDescuentoSeguro());
    }
}