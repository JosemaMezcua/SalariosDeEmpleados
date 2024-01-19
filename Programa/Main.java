package Programa;

import Programa.EmpleadoAsalariado;
import Programa.EmpleadoPorHora;

public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan Prados", 3000.0, 500.0);
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Manolo", 10.0, 45, 20.0);

        System.out.println("Información del Empleado Asalariado:");
        System.out.println("Nombre: " + empleadoAsalariado.getNombre());
        System.out.println("Salario Base: €" + empleadoAsalariado.calcularSalario());

        System.out.println("\nInformación del Empleado Por Hora:");
        System.out.println("Nombre: " + empleadoPorHora.getNombre());
        System.out.println("Salario Base: €" + empleadoPorHora.calcularSalario());
        System.out.println("Horas Trabajadas: " + empleadoPorHora.getHorasTrabajadas());
    }
}

