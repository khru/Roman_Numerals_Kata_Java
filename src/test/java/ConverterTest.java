import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

    @Test
    public void should_convert_1_into_I() {
        Converter converter = new Converter();
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void should_convert_2_into_II() {
        Converter converter = new Converter();
        assertEquals("II", converter.convert(2));
    }

    @Test
    public void should_convert_3_into_III() {
        Converter converter = new Converter();
        assertEquals("III", converter.convert(3));
    }
}
