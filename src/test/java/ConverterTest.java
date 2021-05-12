import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConverterTest {
  private Converter converter;

  @BeforeEach
  private void init() {
    this.converter = new Converter();
  }

  @Test
  public void should_convert_1_into_I() {
    assertEquals("I", converter.convert(1));
  }

  @Test
  public void should_convert_2_into_II() {
    assertEquals("II", converter.convert(2));
  }

  @Test
  public void should_convert_3_into_III() {
    assertEquals("III", converter.convert(3));
  }

  @Test
  public void should_convert_4_into_IV() {
    assertEquals("IV", converter.convert(4));
  }

  @Test
  public void should_convert_5_into_V() {
    assertEquals("V", converter.convert(5));
  }

  @Test
  public void should_convert_6_into_VI() {
    assertEquals("VI", converter.convert(6));
  }

  @Test
  public void should_convert_7_into_VII() {
    assertEquals("VII", converter.convert(7));
  }

  @Test
  public void should_convert_8_into_VIII() {
    assertEquals("VIII", converter.convert(8));
  }

  @Test
  public void should_convert_9_into_IX() {
    assertEquals("IX", converter.convert(9));
  }

  @Test
  public void should_convert_10_into_X() {
    assertEquals("X", converter.convert(10));
  }

    @Test
    public void should_convert_11_into_XI() {
        assertEquals("XI", converter.convert(11));
    }

    @Test
    public void should_convert_14_into_XII() {
        assertEquals("XIV", converter.convert(14));
    }

    @Test
    public void should_convert_19_into_XIX() {
        assertEquals("XIX", converter.convert(19));
    }
}
