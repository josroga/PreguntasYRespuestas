package preguntasyrespuestas;



import javax.swing.JOptionPane;

public class Cuestionario {

	public static void main(String[] args) {
		/* JUEGO TRIVIAL*/

		System.out.println("Juego trivial con 10 preguntas y 4 posibles respuestas. Si eliges la respuesta correcta ganas 2 puntos, "
				+ "si eliges la respuesta incorrecta pierdes 3 puntos. SUERTE.");
		
		int puntos = 0, respuesta;
		String srt;
		
		srt = JOptionPane.showInputDialog("PREGUNTA 1: ¿Qué tipo de animal es la ballena? : \n 1 - Un pez. \n 2 - Un mamífero. \n 3 - Un pájaro. \n 4 - Un reptil. \n Introduce el número de la respuesta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 2) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es mamífero.");
			System.out.println("Puntos totales: " + puntos);

		}
		
		srt = JOptionPane.showInputDialog("PREGUNTA 2: ¿Cuántos huesos tiene un cuerpo humano adulto? : \n 1 - 300. \n 2 - 250. \n 3 - 206. \n 4 - 198. \n Introduce el número de la respuesta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 3) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("LA respuesta correcta es 206.");
			System.out.println("Puntos totales: " + puntos);

		}
		srt = JOptionPane.showInputDialog("PREGUNTA 3: ¿Dónde se encuentra la torre de Pisa? : \n 1 - Italia. \n 2 - Francia. \n 3 - Grecia. \n 4 - España. \n Introduce el número de la respuesta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 1) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es Italia.");
			System.out.println("Puntos totales: " + puntos);

		}
		srt = JOptionPane.showInputDialog("PREGUNTA 4: ¿Cuál es el disco más vendido de la historia? : \n 1 -Back in Black, de AC/DC. \n 2 - My world, de Justin Bieber. \n 3 - Music of the sun, de Rihanna. \n 4 - Thriller, de Michael Jackson. \n Introduce el número de la respuesta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 4) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es Thriller, de Michael Jackson.");
			System.out.println("Puntos totales: " + puntos);

		}
		srt = JOptionPane.showInputDialog("PREGUNTA 5: ¿Cuál es el país más grande del mundo? : \n 1 - Europa. \n 2 - China. \n 3 - Rusia. \n 4 - América. \n Introduce el número de la respuesta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 3) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es Rusia.");
			System.out.println("Puntos totales: " + puntos);

		}
		
		srt = JOptionPane.showInputDialog("PREGUNTA 5: ¿Qué es más pequeño? : \n 1 - Átomo. \n 2 - Célula. \n 3 - Tejido. \n 4 - Molécula. \n Introduce el número de la respuesta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 1) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es el átomo.");
			System.out.println("Puntos totales: " + puntos);

		}
		
		srt = JOptionPane.showInputDialog("PREGUNTA 6: ¿Qué era el Concorde? : \n 1 - Una secta. \n 2 - Una organización religiosa. \n 3 - Un avión. \n 4 - Un edificio. \n Introduce el número de la respuesta correcta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 3) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es un avión.");
			System.out.println("Puntos totales: " + puntos);

		}
		
		srt = JOptionPane.showInputDialog("PREGUNTA 7: ¿Cuál es el metal más caro del mundo? : \n 1 - Oro. \n 2 - Platino. \n 3 - Plata. \n 4 - Rodio. \n Introduce el número de la respuesta correcta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 4) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es el rodio.");
			System.out.println("Puntos totales: " + puntos);

		}
		
		srt = JOptionPane.showInputDialog("PREGUNTA 8: ¿En qué año apareció en el mercado el primer videojuego protagonizado por Super Mario? : \n 1 - 1981. \n 2 - 1985. \n 3 - 1992. \n 4 - 1998. \n Introduce el número de la respuesta correcta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 2) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es 1985.");
			System.out.println("Puntos totales: " + puntos);

		}
		
		srt = JOptionPane.showInputDialog("PREGUNTA 9: ¿Cuál es el animal que tiene mayor facilidad para repetir las frases y palabras que escucha? : \n 1 - Loro. \n 2 - Cotorra. \n 3 - Cuervo. \n 4 -Papagayo. \n Introduce el número de la respuesta correcta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 3) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es el cuervo.");
			System.out.println("Puntos totales: " + puntos);

		}
		
		srt = JOptionPane.showInputDialog("PREGUNTA 9: ¿Cuál es la lengua más hablada del mundo? : \n 1 - Español. \n 2 - Inglés. \n 3 - Chino mandarín. \n 4 -Ruso. \n Introduce el número de la respuesta correcta: ");
		respuesta = Integer.parseInt(srt);
		if (respuesta == 3) {
			System.out.println("RESPUESTA CORRECTA. Has ganado 2 puntos:).");
			puntos = puntos + 2;
			System.out.println("Puntos totales: " + puntos);
		}
		else {
			System.out.println("RESPUESTA INCORRECTA. Has perdido 3 puntos:(.");
			puntos = puntos - 3;
			System.out.println("La respuesta correcta es el chino mandarín.");
			System.out.println("Puntos totales: " + puntos);

	}
		System.out.println("El resultado final es: " + puntos + ". Gracias por jugar");
        }
}