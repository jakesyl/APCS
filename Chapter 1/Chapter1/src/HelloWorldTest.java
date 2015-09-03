import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.io.output.TeeOutputStream;

//import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;
import org.junit.contrib.java.lang.system.SystemOutRule;

import org.junit.Rule;
/**
 * 
 */

/**
 * @author jakesyl
 *
 */
public class HelloWorldTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	/**
	 * Test method for {@link HelloWorld#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		HelloWorld.main(null);
		assertEquals(systemOutRule.getLog(), "Hello, World!");
	}

}
