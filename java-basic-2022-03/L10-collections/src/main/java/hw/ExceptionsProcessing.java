package hw;

import java.util.Optional;

public class ExceptionsProcessing {
    private static int MAX_ATTEMPTS_COUNT = 10;
    private static long TIMEOUT_BETWEEN_ATTEMPTS = 5000L;

    public static void main(String[] args) throws InterruptedException {
        // Retry
        SomeApi api = new SomeApi();
        String response = null;

        for (int i = 0; i < MAX_ATTEMPTS_COUNT; i++) {
            System.out.println("Connection attempt: " + (i + 1));

            try {
                response = api.getResponse("someHost", "somePath", "someRequest");
                break;
            } catch (Exception e) {
            }

            Thread.sleep(TIMEOUT_BETWEEN_ATTEMPTS);

        }

        if (response == null) {
            throw new RuntimeException("Connection failed");
        }
        // work with response

        // Log error
        try (SomeFile someFile = new SomeFile()) {
            String fileContent  = someFile.read("somePath");
        } catch (Exception e) {
            // v1
            System.err.println("An error occurred while working with the file: " + e.getMessage());
            // v2
//            e.printStackTrace();
        }

        // Return default value
        SomeDaoImpl someDaoImpl = new SomeDaoImpl();
        Optional<SomePerson> somePerson = someDaoImpl.findPersonInDbById(0L);
        System.out.println(somePerson.isEmpty());
    }
}
