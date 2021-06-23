import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void getPhrase() {
        String phrase = new HelloWorld().getPhrase();

        Assertions.assertEquals("Phrase", phrase);

    }
}