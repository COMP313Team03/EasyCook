package com.easycook.models;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IngredientCategoryRootTest</code> contains tests for the class <code>{@link IngredientCategoryRoot}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:48 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class IngredientCategoryRootTest {
	/**
	 * Run the IngredientCategoryRoot() constructor test.
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testIngredientCategoryRoot_1()
		throws Exception {
		IngredientCategoryRoot result = new IngredientCategoryRoot();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<IngredientCategory> getIngredientCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetIngredientCategory_1()
		throws Exception {
		IngredientCategoryRoot fixture = new IngredientCategoryRoot();

		List<IngredientCategory> result = fixture.getIngredientCategory();

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
		new org.junit.runner.JUnitCore().run(IngredientCategoryRootTest.class);
	}
}