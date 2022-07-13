package cl.crisan.playground.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<Nomina> nominaOptional = Optional.ofNullable(null);

        System.out.println(nominaOptional.isPresent());
    }
}
