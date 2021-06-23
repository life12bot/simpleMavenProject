import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void getPhrase() {
        //give
        final String expected = "Hello World";

        //when
        final String actual = new HelloWorld().getPhrase();

        //then
        Assertions.assertEquals("Hello World", actual);
    }

    @Test
    void getPhraseLength() {
        //when
        int length = new HelloWorld().getPhraseLength();

        //then
        Assertions.assertEquals(11, length);

    }

    @Test
    void setPhrase() {
        //give
        final String expected = "some text";
        HelloWorld helloWorld = new HelloWorld();

        //when
        helloWorld.setPhrase(expected);
        final String actual = helloWorld.getPhrase();

        //then
        Assertions.assertEquals(expected, actual);
    }
}