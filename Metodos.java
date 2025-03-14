import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner (System.in);
    

    public Vehiculo[][] llenarMatriz (int dimension) {
        Vehiculo [][] m = new Vehiculo[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                Vehiculo o = new Vehiculo();
                System.out.println("Ingrese la Placa del Vehiculo:");
                o.setPlaca(sc.next());
                System.out.println("Ingrese el Nombre del Propietario:");
                o.setNombre(sc.next());
                System.out.println("Ingrese el Cilindraje del Vehiculo:");
                o.setCilindraje(sc.nextInt());
                System.out.println("Ingrese el Modelo del vehiculo:");
                o.setModelo(sc.nextInt());
                System.out.println("Ingrese 1 si hay Disponiblilidad ó 0 si no hay:");
                o.setDisponibilidad(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;
    }
    public void mostrarDisponibles(Vehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getDisponibilidad() == 1){
                    System.out.println("placa: " + m[i][j].getPlaca());
                    System.out.println("Nombre Propietario: " + m[i][j].getNombre());
                    System.out.println("Cilindraje: " + m[i][j].getCilindraje());
                    System.out.println("Modelo: " + m[i][j].getModelo());
                    System.out.println("Disponibilidad: " + m[i][j].getDisponibilidad());
                }
            }
            System.out.println();
        }
    
    }

    public void mostrarNoDisponibles(Vehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getDisponibilidad() == 0){
                    System.out.println("placa: " + m[i][j].getPlaca());
                    System.out.println("Nombre Propietario: " + m[i][j].getNombre());
                    System.out.println("Cilindraje: " + m[i][j].getCilindraje());
                    System.out.println("Modelo: " + m[i][j].getModelo());
                    System.out.println("Disponibilidad: " + m[i][j].getDisponibilidad());
                }
            }
            System.out.println();
        }
    
    }

    public double calcularInventarioTotal(Vehiculo[][] m) {
        double disponibilidadTotal = 0.0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m [i][j] != null) {
                    disponibilidadTotal += m[i][j].calcularDisponibilidadTotal();
                }
            }
        }
        return disponibilidadTotal;
    }
}

