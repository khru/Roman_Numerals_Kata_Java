import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class ConverterTest {

    @Test
    public void should_create_a_converter() {
        Converter converter = new Converter();
        assertThat(converter, instanceOf(Converter.class));
    }
}
