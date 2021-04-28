import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class ConverterTest {

    @Test
    public void give_me_a_good_name_please() {
        Converter converter = new Converter();
        assertThat(converter, instanceOf(Converter.class));
    }
}
