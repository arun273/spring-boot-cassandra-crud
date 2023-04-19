package com.training.cassandra.optional;

import java.util.Optional;
import java.util.function.Function;


public class OptionalTest {

    public static void main(String[] args) {

        String check = "arUn.JR";
        String empty = "";

        String maybeValue = Optional.ofNullable(check).map(String::toLowerCase).orElse(empty);

        String maybeValue1 = Optional.ofNullable(check).orElse(empty);


        Optional<String> noValue = Optional.empty();
        Optional<String> withValue = Optional.of("definitly a string");

        if (maybeValue.equals(empty)) {
            System.out.println("Optional If Value: " + maybeValue);

        } else {
            System.out.println("Optional else Value: " + maybeValue);
        }

        Optional<Computer> computer = Optional.ofNullable(new Computer(new Soundcard(new USB())));

      /*  String version = computer.map(Computer::getSoundcard)
                .map(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");   */

    }
    public static <T, U> U defaultGet(T supplier, Function<T, U> mapper, U defaultValue) {
        return Optional.ofNullable(supplier).map(mapper).orElse(defaultValue);

    }

}
