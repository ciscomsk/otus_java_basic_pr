package hw;

public class SomeFile implements AutoCloseable {
    public String read(String path) {
        return "someBytes";
    }

    @Override
    public void close() throws Exception {

    }
}
