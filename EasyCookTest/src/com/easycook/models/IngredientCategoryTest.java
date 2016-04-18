package com.easycook.models;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IngredientCategoryTest</code> contains tests for the class <code>{@link IngredientCategory}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:48 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class IngredientCategoryTest {
	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		IngredientCategory fixture = new IngredientCategory();
		fixture.set_id(1);
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int get_id() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGet_id_1()
		throws Exception {
		IngredientCategory fixture = new IngredientCategory();
		fixture.set_id(1);
		fixture.setName("");

		int result = fixture.get_id();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		IngredientCategory fixture = new IngredientCategory();
		fixture.set_id(1);
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void set_id(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSet_id_1()
		throws Exception {
		IngredientCategory fixture = new IngredientCategory();
		fixture.set_id(1);
		fixture.setName("");
		int _id = 1;

		fixture.set_id(_id);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(IngredientCategoryTest.class);
	}
}