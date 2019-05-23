package ut;



import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitSampleTest {

	private static int counter;

	private UnitSample sut;

	/**
	 * static initializer（スタティックイニシャライザ）
	 * staticフィールドの初期化に用いる。クラスロード時に1回だけ実行される
	 */
	static {
		counter = 0;
		System.out.println("static initializer:"+counter++);
	}

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class:"+counter++);
	}

	@AfterClass
	public static void AfterClass(){
		System.out.println("After Class:"+counter++);
	}

	@Before
	public void setUp() {
		sut = new UnitSample();
		System.out.println("Before:"+counter++);
	}

	@After
	public void tearDown() {
		sut = null;
		System.out.println("After:"+counter++);
	}

	@Test
	public void testAppend_1234567890() {
		System.out.println("testAppend:"+counter++);

		sut.append('1');
		sut.append('2');
		sut.append('3');
		sut.append('4');
		sut.append('5');
		sut.append('6');
		sut.append('7');
		sut.append('8');
		sut.append('9');
		sut.append('0');

		String actual = sut.getInput();
		String expected = "1234567890";

		assertThat("正常系", actual, is(expected));
	}

	@Test
	public void testAppend_oprtPlus() {
		System.out.println("testAppend:"+counter++);

		sut.append('+');

		String actual = sut.getOperator().toString();
		String expected = "+";

		assertTrue("正常系", actual.equals(expected));
	}

	@Test
	public void testAppend_oprtGt() {
		System.out.println("testAppend:"+counter++);

		sut.append('>');

		Character actual = sut.getOperator();

		assertThat("異常系",actual, nullValue());
	}


	@Test
	public void testAppend_input00() {
		System.out.println("testAppend:"+counter++);

		sut.append('0');
		sut.append('0');

		String actual = sut.getInput();
		String expected = "0";

		assertThat("正常系",actual, is(expected));
	}

	@Test
	public void testAppend_input100() {
		System.out.println("testAppend:"+counter++);

		sut.append('1');
		sut.append('0');
		sut.append('0');

		String expected = "100";
		String actual = sut.getInput();

		assertThat("正常系",actual, is(expected));
	}

}
