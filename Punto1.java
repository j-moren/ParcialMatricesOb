public class Punto1 {
    public void P1(int d) {
        Metodos m = new Metodos();
        Vehiculo[][] M = new Vehiculo[d][d];
        M = m.llenarMatriz(d);
        System.out.println("Disponibles: ");
        m.mostrarDisponibles(M);
        System.out.println("No Disponibles: ");
        m.mostrarNoDisponibles(M);
        double calcularDisponibilidadTotal = m.calcularInventarioTotal(M);
        System.out.println("Disponibilidad Total: " + calcularDisponibilidadTotal);
    }
}
