package main.java.generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List<Object> listaSemGenerics = new ArrayList<>();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (verificar o tipo antes de fazer o cast)
        for (Object elemento : listaSemGenerics) {
            if (elemento instanceof String) {
                String str = (String) elemento;
                System.out.println(str);
            } else {
                System.out.println("Elemento não é uma String: " + elemento);
            }
        }
    }
}
