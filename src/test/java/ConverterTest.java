import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

    @Test
    public void should_convert_1_into_I() {
        Converter converter = new Converter();
        assertEquals("I", converter.convert(1));
    }
}
