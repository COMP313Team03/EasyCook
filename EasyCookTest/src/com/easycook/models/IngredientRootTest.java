package com.easycook.models;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IngredientRootTest</code> contains tests for the class <code>{@link IngredientRoot}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:48 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class IngredientRootTest {
	/**
	 * Run the IngredientRoot() constructor test.
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testIngredientRoot_1()
		throws Exception {
		IngredientRoot result = new IngredientRoot();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<Ingredient> getIngredients() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetIngredients_1()
		throws Exception {
		IngredientRoot fixture = new IngredientRoot();

		List<Ingredient> result = fixture.getIngredients();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(IngredientRootTest.class);
	}
}