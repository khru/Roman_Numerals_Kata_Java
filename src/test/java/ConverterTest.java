import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

	@Test
	public void give_me_a_good_name_please() {
		Converter converter = new Converter();

		boolean result = converter.theMethod();

		assertEquals(true, result);
		assertThat(result, equalTo(true));
	}
}
