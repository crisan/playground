package cl.crisan.playground.instant;

import javax.mail.search.AndTerm;
import javax.mail.search.ComparisonTerm;
import javax.mail.search.ReceivedDateTerm;
import javax.mail.search.SearchTerm;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Tamaño de la partición
        final int tamanioParticion = 25;

        // Creando lista dummy de 5000 mensajes
        List<String> listaOriginal = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            listaOriginal.add(i+"");
        }
        // 5000 mensajes divididos en 25 (tamaño de la partición) = 200 sublistas
        List<List<String>> sublistas = new LinkedList<>();
        for (int i = 0; i < listaOriginal.size(); i += tamanioParticion) {
            // Logica de la división en partes iguales de las listas
            sublistas.add(listaOriginal.subList(i, Math.min(i + tamanioParticion, listaOriginal.size())));
        }
        // Tamaño de la lista original = 5000
        System.out.println("Tamaño lista: " + listaOriginal.size());
        // Tamaño del conjunto de listas = 200
        System.out.println("Tamaño de la lista de sublistas: " + sublistas.size());
        int i = 0;
        for(List<String> lista: sublistas) {
            System.out.println("Inicio bucle listas: " + i++);
            for(String unidad: lista) { // Procesamiento completo de cada sublista de 200 elementos
                // Logica del bucle actual
                System.out.println("Inicio bucle interno: " + unidad);
            }
        }





        IRemoteFilterable filter = () -> {
            Instant ayer = Instant.now().minus(5, ChronoUnit.DAYS);
            //2022-06-05T16:07:41.847Z
            Instant ahora = Instant.now().plus(2, ChronoUnit.DAYS);

            SearchTerm olderThan = new ReceivedDateTerm(ComparisonTerm.LT, Date.from(ahora)); // Sun Jun 05 13:20:40 CLT 2022

            SearchTerm newerThan = new ReceivedDateTerm(ComparisonTerm.GT, Date.from(ayer)); // Sun May 29 13:20:14 CLT 2022

            return new AndTerm(olderThan, newerThan);
        };

        SearchTerm searchTerm = filter.getFilter();
        // 2022-05-29T16:07:23.343Z

        System.out.println("Hola");
    }
}
