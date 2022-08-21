
package punto2;

public class Estudiante {

	// Se declaran los atributos de la clase
	private String nombre;
	private String apellido;
	private double nota1;
	private double nota2;
	private double examenFinal;

	// Se declara un m�todo constructor para inicializar el objeto
	Estudiante(String nombre, String apellido, double nota1, double nota2, double examenFinal) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.examenFinal = examenFinal;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Declaro los getters y setters de los atributos privados
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getExamenFinal() {
		return examenFinal;
	}

	public void setExamenFinal(double examenFinal) {
		this.examenFinal = examenFinal;
	}

	// M�todo para calcular la nota final
	public double notaFinal() {
		return ((nota1 * 0.3) + (nota2 * 0.3) + (examenFinal * 0.4));
	}

}