package hw;

import java.util.Random;

public class SomeApi {
    public String getResponse(String host, String path, String request) {
        boolean throwException = new Random().nextBoolean();

        if (throwException) {
            throw new RuntimeException("Oops");
        }

        return "someResponse";
    }
}
