package operaciones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

	private String fechaHora;
	private String concepto;
	private double importe;
	private boolean tipoMov;
	private double saldo;
	
	public Movimiento(String concepto, double importe, String tipoMov, double saldo) {
		this.fechaHora = asignarHora();
		this.concepto = concepto;
		this.importe = importe;
		this.saldo = saldo;
		
		if(tipoMov.equalsIgnoreCase("INGRESO")) {
			
			this.tipoMov=true;
			
		} else if(tipoMov.equalsIgnoreCase("RETIRO")) {
			
			this.tipoMov=false;
		}
	}
	
	public String detalleMovimiento() {
				
		return "Fecha de movimiento: " + fechaHora + " por importe de: " + importe + "€ y ha sido un: " + getTipoMov();
		
	}

	@Override
	public String toString() {
		return "Movimiento [fechaHora=" + fechaHora + ", concepto=" + concepto + ", importe=" + importe + ", tipoMov="
				+ tipoMov + "]";
	}

	private String asignarHora() {
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
		String dia = date.format(formatoDia);
		String hora = date.format(formatoHora);
		return hora + " " + dia;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getImporte() {
		return importe;
	}

	public String getTipoMov() {
		
		String ret="";
		
		if(tipoMov) {
			
			ret="Ingreso";
		} else {
			
			ret="Retiro";
		}
		
		return ret;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
}
