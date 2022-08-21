
package punto1;

public class Palabra {

	// Se declaran los atributos de la clase
	private String palabra;
	private int desplazamiento;

	// Se declara el m�todo constructor por defecto
	public Palabra() {

	}

	// Se declara el m�todo constructor con par�metros
	public Palabra(String palabra, int desplazamiento) {
		this.palabra = palabra;
		this.desplazamiento = desplazamiento;
	}

	// Getters y setters de las variables privadas
	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(int desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

	// M�todo para encriptar la palabra
	public String palabraEncriptada(int desplazamiento) {
		char array[] = palabra.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if ((char) array[i] == 32) {
			} else if (((char) (array[i] + (char) desplazamiento) >= (char) 97
					&& (char) (array[i] + (char) desplazamiento) <= (char) 122)
					|| ((char) (array[i] + (char) desplazamiento) >= (char) 65
					&& (char) (array[i] + (char) desplazamiento) <= (char) 90)) {
				array[i] = (char) (array[i] + (char) desplazamiento);
			} else {
				array[i] = (char) (array[i] - (char) (Math.abs(26 - desplazamiento)));
			}
		}
		return String.valueOf(array);
	}

}