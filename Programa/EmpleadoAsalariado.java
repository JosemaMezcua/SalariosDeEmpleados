package Programa;

public class EmpleadoAsalariado extends Empleado {
    private double bonoAnual;

    public EmpleadoAsalariado(String nombre, double salarioBase, double bonoAnual) {
        super(nombre, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    public double calcularSalario() {
        return super.calcularSalario() + bonoAnual;
    }
}
