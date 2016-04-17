package com.easycook.models;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IngredientTest</code> contains tests for the class <code>{@link Ingredient}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:48 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class IngredientTest {
	/**
	 * Run the int getCategory_id() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetCategory_id_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();

		int result = fixture.getCategory_id();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getImage_name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetImage_name_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();

		String result = fixture.getImage_name();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getIngredient_image() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetIngredient_image_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();

		String result = fixture.getIngredient_image();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getIngredient_name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetIngredient_name_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();

		String result = fixture.getIngredient_name();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getLike() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetLike_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();

		int result = fixture.getLike();

		// add additional test code here
		assertEquals(0, result);
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
		Ingredient fixture = IngredientFactory.createIngredient();

		int result = fixture.get_id();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setCategory_id(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetCategory_id_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();
		int category_id = 1;

		fixture.setCategory_id(category_id);

		// add additional test code here
	}

	/**
	 * Run the void setImage_name(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetImage_name_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();
		String image_name = "";

		fixture.setImage_name(image_name);

		// add additional test code here
	}

	/**
	 * Run the void setIngredient_image(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetIngredient_image_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();
		String ingredient_image = "";

		fixture.setIngredient_image(ingredient_image);

		// add additional test code here
	}

	/**
	 * Run the void setIngredient_name(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetIngredient_name_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();
		String ingredient_name = "";

		fixture.setIngredient_name(ingredient_name);

		// add additional test code here
	}

	/**
	 * Run the void setLike(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetLike_1()
		throws Exception {
		Ingredient fixture = IngredientFactory.createIngredient();
		int like = 1;

		fixture.setLike(like);

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
		Ingredient fixture = IngredientFactory.createIngredient();
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
		new org.junit.runner.JUnitCore().run(IngredientTest.class);
	}
}