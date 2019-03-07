package operaciones;

import java.util.ArrayList;

public class Cuenta implements ICuenta {

	private String nombreCliente;
	private String iban;
	private double saldo;
	private ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
	
	
	
	public Cuenta(String nombreCliente, String iban, double saldo) {
		this.nombreCliente = nombreCliente;
		this.iban = iban;
		this.saldo = saldo;
		
	}

	@Override
	public String movimientoIngreso(double dinero, String concepto) {
		
		String c="";
		
		setSaldo(saldo+dinero);
		Movimiento mi = new Movimiento(concepto, dinero, "Ingreso", saldo);
		movimientos.add(mi);
		c="Movimiento realizado correctamente.";
		
		return c;
	}

	@Override
	public String movimientoRetiro(double dinero, String concepto) {
		
		String c="";
		
		if(saldo-dinero>=0) {
			
			setSaldo(saldo-dinero);
			Movimiento mr = new Movimiento(concepto, dinero, "Retiro", saldo);
			movimientos.add(mr);
			c="Movimiento realizado correctamente.";
			
		} else {
			
			c="Tiene saldo insuficiente para este movimiento.";
		}

		return c;
	}

	public String getMovimientos() {
		
		String ret="";
		
		if(movimientos.size()>0) {
		
			for(Movimiento m : movimientos) {
				
				ret=ret + m.detalleMovimiento()+"\nY en concepto de: " 
						+ m.getConcepto()+"\nDejando un saldo de: " + m.getSaldo() + "€\n"
						+ "--------------------------------------------------\n";
			}
			
		} else {
			
			ret="No hay movimientos registrados";
		}

		
		return ret;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta de: " + nombreCliente + ", con el IBAN: " + iban + ", tiene un saldo de: "
				+ saldo + " y tiene " + movimientos.size() + " movimientos registrados.";
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
