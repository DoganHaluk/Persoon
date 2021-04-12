package be.vdab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Persoon {
    private final List<String> voornamen = new ArrayList<>();

    public void add(String voornaam) {
        if (voornaam == null || voornaam.trim().isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            Stream.of(voornaam)
                    .map(naam -> naam.split(" "))
                    .flatMap(Arrays::stream)
                    .filter(naam -> naam.length() > 0)
                    .distinct()
                    .forEach(voornamen::add);
        }
    }

    @Override
    public String toString() {
        return String.join(" ", voornamen);
    }
}
