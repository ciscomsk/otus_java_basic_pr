package hw;

import java.util.Optional;

public class SomeDaoImpl {
    public Optional<SomePerson> findPersonInDbById(long id) {
        try {
            return Optional.of(findPersonById(id));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    private static SomePerson findPersonById(long id) {
        return new SomePerson();
    }
}
