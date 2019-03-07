El programa que deberás desarrollar simulará el funcionamiento de un cajero automático. Como punto de partida
te damos la clase Principal con la implementación de un menú que servirá como interfaz de usuario (en la página
siguiente).
Como puedes comprobar en el menú, el programa permitirá retirar dinero, ingresar dinero, consultar saldo o
consultar movimientos.
Debes desarrollar la lógica de la aplicación utilizando las siguientes clases e interfaces:
• ICuenta
Interfaz qué definirá el comportamiento (métodos) de una clase Cuenta.
• Cuenta
Representa una cuenta bancaria que debe contener el nombre del cliente, número de cuenta, movimientos y
saldo actual.
• Movimiento
Representa un movimiento en una cuenta (fecha_hora, concepto, etc.). Cada objeto Cuenta contendrá como
componente una colección de movimientos.
Tú decidirás los métodos que deberás implementar en las clases para conseguir el comportamiento deseado.

----------------------------------------------------------------------------------------------------------------------
RECURSOS PREVIOS


import java.util.Scanner;
public class Principal {
static Scanner lector;
public static void main(String[] args) {
lector = new Scanner(System.in);
String opc = "";
do {
System.out.println("Cuenta de ...");
System.out.println("-------------------------");
System.out.println(" R - Retirar");
System.out.println(" I - Ingresar");
System.out.println(" S - Consultar Saldo");
System.out.println(" M - Consultar movimientos");
System.out.println(" F - Fin del programa");
System.out.println("-------------------------");
System.out.println("¿Qué operación deseas realizar? ");
opc = lector.nextLine();
} while (!opc.toUpperCase().equals("F"));
lector.close();
}
}

----------------------------------------------------------------------------------------------------------------------
Tiempo 3h