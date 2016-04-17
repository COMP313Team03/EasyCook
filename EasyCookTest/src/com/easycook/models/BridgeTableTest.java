package com.easycook.models;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BridgeTableTest</code> contains tests for the class <code>{@link BridgeTable}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:48 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class BridgeTableTest {
	/**
	 * Run the int getIngredient_id() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetIngredient_id_1()
		throws Exception {
		BridgeTable fixture = new BridgeTable();
		fixture.setIngredient_id(1);
		fixture.set_id(1);
		fixture.setRecipe_id(1);

		int result = fixture.getIngredient_id();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getRecipe_id() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetRecipe_id_1()
		throws Exception {
		BridgeTable fixture = new BridgeTable();
		fixture.setIngredient_id(1);
		fixture.set_id(1);
		fixture.setRecipe_id(1);

		int result = fixture.getRecipe_id();

		// add additional test code here
		assertEquals(1, result);
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
		BridgeTable fixture = new BridgeTable();
		fixture.setIngredient_id(1);
		fixture.set_id(1);
		fixture.setRecipe_id(1);

		int result = fixture.get_id();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setIngredient_id(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetIngredient_id_1()
		throws Exception {
		BridgeTable fixture = new BridgeTable();
		fixture.setIngredient_id(1);
		fixture.set_id(1);
		fixture.setRecipe_id(1);
		int ingredient_id = 1;

		fixture.setIngredient_id(ingredient_id);

		// add additional test code here
	}

	/**
	 * Run the void setRecipe_id(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetRecipe_id_1()
		throws Exception {
		BridgeTable fixture = new BridgeTable();
		fixture.setIngredient_id(1);
		fixture.set_id(1);
		fixture.setRecipe_id(1);
		int recipe_id = 1;

		fixture.setRecipe_id(recipe_id);

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
		BridgeTable fixture = new BridgeTable();
		fixture.setIngredient_id(1);
		fixture.set_id(1);
		fixture.setRecipe_id(1);
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
		new org.junit.runner.JUnitCore().run(BridgeTableTest.class);
	}
}