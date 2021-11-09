package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static List<String> numeros = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("[1] colocar mais numeros");
            System.out.println("[2] ver resultados");
            System.out.print("digite: ");
            int escolha = Integer.parseInt(scanner.nextLine());
            switch (escolha) {
                case 1 ->  adicionarNumeros();
                case 2 -> resultado();
            }
        }
    }
    static public void resultado() {
        System.out.println("---------------------------------------------------");
        double media = 0;
        for (int i = 0; i< numeros.size(); i++) {
            media = media + Double.parseDouble(numeros.get(i));
        }
        System.out.println("media: " + media);
        double maior  = 0;
        for (int i = 0; i< numeros.size(); i++) {
            if(maior < Double.parseDouble(numeros.get(i))) {
                maior = Double.parseDouble(numeros.get(i));
            }
        }
        System.out.println("maior numero: " + maior);
        double menor = Double.parseDouble(numeros.get(0));
        for (int i = 0; i< numeros.size(); i++) {
            if(menor > Double.parseDouble(numeros.get(i))) {
                menor = Double.parseDouble(numeros.get(i));
            }
        }
        System.out.println("menor numero: " + menor);
    }
    static public void adicionarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero: ");
        numeros.add(scanner.nextLine());
    }
}
