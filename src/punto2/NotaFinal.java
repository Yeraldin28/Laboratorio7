
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NotaFinal {

	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA LA NOTA FINAL DE UN CURSO DE TRES ESTUDIANTES\n");

		// Se declara un pbjeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir;

		do {

			double nota1, nota2, examenFinal, promedioCurso = 0;
			String nombre, apellido;

			// Se declara un array que contendr� tres objetos de tipo Estudiante
			Estudiante[] curso = new Estudiante[3];

			// Se piden los datos de los objetos que van dentro del array y se comprueba que
			// esten bien escritos
			for (int i = 0; i < 3; i++) {

				System.out.print("\n\n\tIngresa los datos del estudiante N�" + (i+1) + ":\n\n\tNombres: ");
				nombre = in.readLine();
				System.out.print("\tApellidos: ");
				apellido = in.readLine();
				System.out.print("\tNota N�1: ");
				nota1 = Double.parseDouble(in.readLine());

				if (nota1 < 0 || nota1 > 50) {
					while (nota1 < 0 || nota1 > 50) {
						System.out.print("\n\n\tEscribe un n�mero que este entre 0 y 50: ");
						nota1 = Double.parseDouble(in.readLine());
					}
				}

				System.out.print("\tNota N�2: ");
				nota2 = Double.parseDouble(in.readLine());

				if (nota2 < 0 || nota2 > 50) {
					while (nota2 < 0 || nota2 > 50) {
						System.out.print("\n\n\tEscribe un n�mero que este entre 0 y 50: ");
						nota2 = Double.parseDouble(in.readLine());
					}
				}

				System.out.print("\tNota examen final: ");
				examenFinal = Double.parseDouble(in.readLine());

				if (examenFinal < 0 || examenFinal > 50) {
					while (examenFinal < 0 || examenFinal > 50) {
						System.out.print("\n\n\tEscribe un n�mero que este entre 0 y 50: ");
						examenFinal = Double.parseDouble(in.readLine());
					}
				}

				// Se guarda cada objeto en el array
				curso[i] = new Estudiante(nombre, apellido, nota1, nota2, examenFinal);
			}

			// Imprimo la cabecera de la tabla
			System.out.print(
					"\n\n\t___________________________________________________________________________________\n");
			System.out.printf("\t|%-3s|%-15s|%-15s|%-10s|%-10s|%-10s|%-12s|", "    ", "Nombres", "Apellidos",
					"Nota N�1", "Nota N�2", "Examen", "Definitva");
			System.out.print(
					"\n\t|____|_______________|_______________|__________|__________|__________|____________|\n");

			// Muestro los datos de cada estudiante
			for (int i = 0; i < 3; i++) {
				System.out.printf("\t|%3d.|%-15.14s|%-15.14s|%-10.2f|%-10.2f|%-10.2f|%-12.2f|%n", i,
						curso[i].getNombre(), curso[i].getApellido(), curso[i].getNota1(), curso[i].getNota2(),
						curso[i].getExamenFinal(), curso[i].notaFinal());
				promedioCurso += curso[i].notaFinal();
			}

			// Muestro el promedio del curso en general
			System.out
					.print("\t|__________________________________________________________________________________|\n");
			System.out.printf("\t|%77s%3.2f|", "El promedio del curso es: ", promedioCurso / 3);
			System.out.print(
					"\n\t|__________________________________________________________________________________|\n");

			// Se le pregunta al usuario si quiere volver a usar el programa
			System.out.print("\n\n\t�Quieres volver a usar el programa? \n\t1. Si\n\t2. No\n\tDecisi�n: ");
			repetir = Integer.parseInt(in.readLine());
			if (repetir < 1 || repetir > 2) {
				while (repetir < 1 || repetir > 2) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					repetir = Integer.parseInt(in.readLine());
				}
			}
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}
