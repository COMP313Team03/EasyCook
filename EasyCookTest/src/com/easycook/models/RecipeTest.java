package com.easycook.models;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RecipeTest</code> contains tests for the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:48 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class RecipeTest {
	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIngredient_list() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetIngredient_list_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);

		String result = fixture.getIngredient_list();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getPhoto() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetPhoto_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);

		String result = fixture.getPhoto();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getPhoto_name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetPhoto_name_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);

		String result = fixture.getPhoto_name();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getRecipe_category_id() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetRecipe_category_id_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);

		int result = fixture.getRecipe_category_id();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getRecipe_name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testGetRecipe_name_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);

		String result = fixture.getRecipe_name();

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
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);

		int result = fixture.get_id();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setIngredient_list(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetIngredient_list_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);
		String ingredient_list = "";

		fixture.setIngredient_list(ingredient_list);

		// add additional test code here
	}

	/**
	 * Run the void setPhoto(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetPhoto_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);
		String photo = "";

		fixture.setPhoto(photo);

		// add additional test code here
	}

	/**
	 * Run the void setPhoto_name(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetPhoto_name_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);
		String photo_name = "";

		fixture.setPhoto_name(photo_name);

		// add additional test code here
	}

	/**
	 * Run the void setRecipe_category_id(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetRecipe_category_id_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);
		int recipe_category_id = 1;

		fixture.setRecipe_category_id(recipe_category_id);

		// add additional test code here
	}

	/**
	 * Run the void setRecipe_name(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	@Test
	public void testSetRecipe_name_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);
		String recipe_name = "";

		fixture.setRecipe_name(recipe_name);

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
		Recipe fixture = new Recipe();
		fixture.setPhoto("");
		fixture.setRecipe_name("");
		fixture.setDescription("");
		fixture.setIngredient_list("");
		fixture.set_id(1);
		fixture.setPhoto_name("");
		fixture.setRecipe_category_id(1);
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
		new org.junit.runner.JUnitCore().run(RecipeTest.class);
	}
}