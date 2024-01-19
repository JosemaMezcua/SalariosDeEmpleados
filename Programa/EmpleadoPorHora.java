package Programa;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;
    private static final int HORAS_REGULARES = 40;

    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public double calcularSalario() {
        int horasExtras = Math.max(0, horasTrabajadas - HORAS_REGULARES);
        double salarioRegular = super.calcularSalario();
        double salarioExtra = horasExtras * 1.5 * tarifaPorHora;

        return salarioRegular + salarioExtra;
    }
}
