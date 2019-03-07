package operaciones;

public interface ICuenta {

	 //Modelo de Metodo de movimientos de ingreso
	public String movimientoIngreso(double dinero, String concepto);
	
	//Modelo de Metodo de movimientos de retiro
	public String movimientoRetiro(double dinero, String concepto);

	
}
