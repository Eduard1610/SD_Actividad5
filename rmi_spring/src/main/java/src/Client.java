package src;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Obtener la referencia del registro RMI en el localhost, puerto 1099
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Buscar el servicio del calculador por su nombre registrado
            CalculatorService calculatorService = (CalculatorService) registry.lookup("CalculatorService");

            // Realizar algunas operaciones de prueba
            int a = 10;
            int b = 5;

            System.out.println("Suma: " + a + " + " + b + " = " + calculatorService.add(a, b));
            System.out.println("Resta: " + a + " - " + b + " = " + calculatorService.subtract(a, b));
        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
