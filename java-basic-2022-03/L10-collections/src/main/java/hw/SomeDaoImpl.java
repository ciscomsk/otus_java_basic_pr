package hw;

import java.util.Optional;
import java.util.Random;

public class SomeDaoImpl {
    public Optional<SomePerson> findPersonInDbById(long id) {
        try {
            return Optional.of(findPersonById(id));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    private static SomePerson findPersonById(long id) {
        boolean throwException = new Random().nextBoolean();

        if (throwException) {
            throw new RuntimeException("Oops");
        }

        return new SomePerson(id);
    }
}
