package SALPD9;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("casa", "house");
        dictionary.put("libro", "book");
        dictionary.put("hola", "hello");
        dictionary.put("amigo", "friend");
        dictionary.put("sol", "sun");
        dictionary.put("luna", "moon");
        dictionary.put("agua", "water");
        dictionary.put("ciudad", "city");
        dictionary.put("rojo", "red");
        dictionary.put("verde", "green");
        dictionary.put("amarillo", "yellow");
        dictionary.put("coche", "car");
        dictionary.put("computadora", "computer");
        dictionary.put("musica", "music");
        dictionary.put("juego", "game");
        dictionary.put("tiempo", "weather");
        dictionary.put("trabajo", "work");
        dictionary.put("escuela", "school");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra en español: ");
        String wordToSearch = scanner.nextLine();
        scanner.close();

        String translation = dictionary.get(wordToSearch);

        System.out.println(translation != null ? "La traducción es: " + translation : "No se encontró la palabra");
	}

}
