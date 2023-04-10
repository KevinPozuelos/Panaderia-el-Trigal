
package panaderia;
/**
 * Clase fecha ya que java no posee una clase para manejar fechas
 * @author Kevin Pozuelos   
 */

public class Fecha {
    private int dia;
	private int mes;
	private int anyo;

	public Fecha(int dia, int mes, int anyo) {
		setDia(dia);
		setMes(mes);
		setAnyo(anyo);
	}

	public Fecha() {
		this(1,1,1900);
	}

	public void setDia(int dia){
		this.dia = (dia >=1 && dia <= 31) ? dia : 1;
	}

	public void setMes(int mes){
		this.mes = mes;
	}

	public void setAnyo(int anyo){
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public String toString() {
		return toString( "/" );
	}

	public String toString(String separador) {
		return dia + separador + mes + separador + anyo;
	}
}
