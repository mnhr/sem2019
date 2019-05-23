package playground;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalcTest {

	@Test
	public void testDisplay1足す1が2() {
		SimpleCalc sut = new SimpleCalc();
		sut.calc("1");
		sut.calc("+");
		sut.calc("1");
		sut.calc("=");
		int actual = sut.display();
		int expected = 2;
		assertThat(actual, is(expected));
	}

	@Test
	public void testDisplay11足す111が122() {
		SimpleCalc sut = new SimpleCalc();
		sut.calc("1");
		sut.calc("1");
		sut.calc("+");
		sut.calc("1");
		sut.calc("1");
		sut.calc("1");
		sut.calc("=");
		int actual = sut.display();
		int expected = 122;
		assertThat(actual, is(expected));
	}

	@Test
	public void testDisplay111足す1引く11は() {
		SimpleCalc sut = new SimpleCalc();
		sut.calc("1");
		sut.calc("1");
		sut.calc("1");
		sut.calc("+");
		sut.calc("1");
		sut.calc("-");
		sut.calc("1");
		sut.calc("1");
		sut.calc("=");
		int actual = sut.display();
		int expected = 101;
		assertThat(actual, is(expected));
	}

	@Test
	public void testDisplay11引く1足す() {
		SimpleCalc sut = new SimpleCalc();
		sut.calc("1");
		sut.calc("1");
		sut.calc("-");
		sut.calc("1");
		sut.calc("+");
		int actual = sut.display();
		int expected = 10;
		assertThat(actual, is(expected));
	}

	@Test
	public void testDisplayマイナス1は() {
		SimpleCalc sut = new SimpleCalc();
		sut.calc("-");
		sut.calc("1");
		sut.calc("=");
		int actual = sut.display();
		int expected = -1;
		assertThat(actual, is(expected));
	}

}
