package main.java.generics;
import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Map<String, Object> mapaSemGenerics = new HashMap<>();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", "valor"); // Permite adicionar qualquer tipo de objeto

        // Exemplo com Generics
        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20);

        // Iterando sobre o mapa com Generics
        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Iterando sobre o mapa sem Generics (verificar o tipo antes de fazer o cast)
        for (Map.Entry<String, Object> entry : mapaSemGenerics.entrySet()) {
            String chave = entry.getKey();
            Object valor = entry.getValue();
            if (valor instanceof Integer) {
                int intValue = (Integer) valor;
                System.out.println("Chave: " + chave + ", Valor: " + intValue);
            } else if (valor instanceof String) {
                String strValue = (String) valor;
                System.out.println("Chave: " + chave + ", Valor: " + strValue);
            } else {
                System.out.println("Chave: " + chave + ", Valor: " + valor);
            }
        }
    }
}
