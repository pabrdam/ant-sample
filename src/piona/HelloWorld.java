package piona;

/**
 * HelloWorld class.
 */
public class HelloWorld {

    /**
     * Greetings string.
     */
    String greetings;

    /**
     * HelloWorld constructor.
     */
    public HelloWorld() {
        greetings = "Hello World! Happy New Year";
    }

    /**
     * Creates String representation of object.
     *
     * @return HelloWorld string representation.
     */
    @Override
    public String toString() {
        return greetings;
    }
}

