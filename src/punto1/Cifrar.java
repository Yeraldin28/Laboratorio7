
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cifrar {

	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA ENCRIPTA UNA PALABARA CON EL CIFRADO JULIO CESARn");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir;

		do {
			// Se declaran las variables a usar
			String palabra, palabraEncriptada;
			int desplazamiento, contador = 0;
			boolean comprobante;

			// Se pide la palbra a encriptar y el desplazamiento
			do {
				comprobante = true;

				System.out.print((contador == 0) ? "\n\n\tIngresa la palabra a encriptar: "
						: "\n\n\tLa palabra esta mal escrita vuelve a escribirla: ");
				palabra = in.readLine();

				// Se comprueba que esten ingresados solo letras
				for (int i = 0; i < palabra.length(); i++) {
					char caracter = palabra.toUpperCase().charAt(i);
					int valorASCII = (int) caracter;
					if (valorASCII != 32 && valorASCII < 65 || valorASCII > 90) {
						comprobante = false;
					}
				}
				contador++;
			} while (comprobante == false);

			System.out.print("\n\n\tIngresa el n�mero de desplazamiento con el que vas a encriptar: ");
			desplazamiento = Integer.parseInt(in.readLine());

			if (desplazamiento < 1 || desplazamiento > 25) {
				while (desplazamiento < 1 || desplazamiento > 25) {
					System.out.print("\n\n\tEscribe un desplazamiento entre 1 y 25: ");
					repetir = Integer.parseInt(in.readLine());
					;
				}
			}

			// Se declara el objeto de tipo Palabra
			Palabra palabraAEncriptar = new Palabra(palabra, desplazamiento);

			// Se encripta la palabra
			palabraEncriptada = palabraAEncriptar.palabraEncriptada(desplazamiento);

			// Muestro la palabra inicial y la encriptada
			System.out.print("\n\n\tLa palabra a encriptar es: " + palabraAEncriptar.getPalabra()
					+ "\n\tEncriptada con un desplazamiento de: " + palabraAEncriptar.getDesplazamiento()
					+ " queda como: " + palabraEncriptada);

			// Se le pregunta al usuario si quiere volver a usar el programa
			System.out.print("\n\n\t�Quieres volver a usar el programa? \n\t1. Si\n\t2. No\n\tDecisi�n: ");
			repetir = Integer.parseInt(in.readLine());
			;
			if (repetir < 1 || repetir > 2) {
				while (repetir < 1 || repetir > 2) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					repetir = Integer.parseInt(in.readLine());
					;
				}
			}
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}
