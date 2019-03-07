import java.util.Scanner;

import operaciones.Cuenta;

public class Main {

	static Scanner lector;
	
	public static void main(String[] args) throws InterruptedException {
		
		lector = new Scanner(System.in);
		String opc = "";
		Cuenta clt;
		int optClt;
		String respt;
		double ent;
				
		do {
			do {
							
				//Para el planteamiento he decidido dejar poder escoger en dos cliente ya establecidos
				System.out.println("Escoge al cliente");
				System.out.println("1-Carlos Manuel Morales Pérez");
				System.out.println("2-María del Transito González Balcarce");
				System.out.println("-------------------------");
				System.out.println("¿Qué con cual cliente deseas operar? ");
				optClt = Integer.parseInt(lector.nextLine());
				
				if(optClt>2 || optClt<1) {
					
					System.out.println("Opción inválida, intente de nuevo.");
				}
				
			}while(optClt>2 || optClt<1);
				//Se selecciona el cliente
				if(optClt==1) {
					
					clt = new Cuenta ("Carlos Manuel Morales Pérez","ES10 2100 4501 2112 3456 7890",1120);
					
				} else {
					
					clt = new Cuenta ("María del Transito González Balcarce","ES10 0128 4501 3509 8765 4321",45142);
				}
			
				System.out.println("Cargando al cliente");
				espaciadorGuion();
				
			do {
				
				System.out.println("Cuenta de " + clt.getNombreCliente());
				System.out.println("-------------------------");
				System.out.println(" R - Retirar");
				System.out.println(" I - Ingresar");
				System.out.println(" S - Consultar Saldo");
				System.out.println(" M - Consultar movimientos");
				System.out.println(" F - Fin del programa");
				System.out.println("-------------------------");
				System.out.println("¿Qué operación deseas realizar? ");
				opc = lector.nextLine();
				System.out.println("Espere un momento por favor...");
				espaciadorGuion();
				
				switch(opc.toUpperCase()) {
				
					case "R":
						
						System.out.println("¿Cuanto dinero deseas retirar?");
						ent = Double.parseDouble(lector.nextLine());
						System.out.println("¿En concepto de ...?");
						respt=lector.nextLine();
						respt=clt.movimientoRetiro(ent, respt);
						System.out.println("Espere un momento por favor...");
						espaciadorGuion();
						System.out.println(respt);
						espaciadorGuion();
						break;
						
					case "I":
					
						System.out.println("¿Cuanto dinero deseas ingresar?");
						ent = Double.parseDouble(lector.nextLine());
						System.out.println("¿En concepto de ...?");
						respt=lector.nextLine();
						respt=clt.movimientoIngreso(ent, respt);
						System.out.println("Espere un momento por favor...");
						espaciadorGuion();
						System.out.println(respt);
						espaciadorGuion();
						break;
						
					case "S":
						
						System.out.println(clt.getSaldo());
						espaciadorGuion();
						break;
						
					case "M":
					
						System.out.println(clt.getMovimientos());
						System.out.println("Espere un momento por favor...");
						espaciadorGuion();
						break;
						
					case "F":
						
						System.out.println("Cierre del cliente");
						System.out.println("Espere un momento por favor...");
						espaciadorGuion();
						break;
						
					default:
						System.out.println("Opción inválida, intente nuevamente.");
						break;
				}
				
			} while (!opc.toUpperCase().equals("F"));
			
			do {
				System.out.println("¿Desea continuar con otro cliente?(S/N)");
				opc = lector.nextLine();
				System.out.println("Espere un momento por favor...");
				espaciadorGuion();
				opc=opc.toUpperCase();
				if(!opc.equalsIgnoreCase("N") && !opc.equalsIgnoreCase("S")) {
					
					System.out.println("Opción inválida, intente nuevamente.");
				}
			}while(!opc.equalsIgnoreCase("N") && !opc.equalsIgnoreCase("S"));
				
			
		}while(!opc.toUpperCase().equals("N"));
			
		lector.close();
		System.out.println("FIN DEL PROGRAMA");
		}
	
	public static void espaciadorGuion() throws InterruptedException {
				
		for(int i=0;i<50;i++) {
			
			System.out.print("-");
			Thread.sleep(20);
		}
		System.out.println();
		System.out.println();
		
	}
}
