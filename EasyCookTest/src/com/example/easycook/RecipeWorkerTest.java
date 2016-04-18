package com.example.easycook;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import com.easycook.models.BridgeTable;
import com.easycook.models.Ingredient;
import com.easycook.models.IngredientCategory;
import com.easycook.models.Recipe;
import com.easycook.models.RecipeCategory;

/**
 * The class <code>RecipeWorkerTest</code> contains tests for the class <code>{@link RecipeWorker}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:49 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class RecipeWorkerTest {
	/**
	 * Run the RecipeWorker() constructor test.
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRecipeWorker_1()
		throws Exception {
		RecipeWorker result = new RecipeWorker();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_2()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		recipe.set_id(1);
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_3()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "SaveRecipe";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		recipe.set_id(1);
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_4()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		recipe.set_id(1);
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_5()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "SaveRecipe";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		recipe.set_id(1);
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_6()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		fixture.main = new RecipeActivity();
		fixture.Action = "";
		fixture.newRecipe = new Recipe();
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_7()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "main";
		fixture.newRecipe = new Recipe();
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_8()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		fixture.newRecipe = new Recipe();
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_9()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_10()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_11()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_12()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "SaveRecipe";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_13()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_14()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "SaveRecipe";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_15()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		recipeActivity.ingredients = new ArrayList();
		recipeActivity.bridgeTables = new ArrayList();
		recipeActivity.recipeCategory = new ArrayList();
		recipeActivity.ingredientCategory = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	@Test
	public void testRun_16()
		throws Exception {
		RecipeWorker fixture = new RecipeWorker();
		RecipeActivity recipeActivity = new RecipeActivity();
		recipeActivity.recipes = new ArrayList();
		fixture.main = recipeActivity;
		fixture.Action = "SaveRecipe";
		Recipe recipe = new Recipe();
		recipe.setRecipe_name("");
		fixture.newRecipe = recipe;
		fixture.imageURL = "";
		fixture.newBridges = new ArrayList();
		fixture.FLAG = true;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.RecipeActivity.<init>(RecipeActivity.java:31)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17/04/16 12:49 PM
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
	 * @generatedBy CodePro at 17/04/16 12:49 PM
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
	 * @generatedBy CodePro at 17/04/16 12:49 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RecipeWorkerTest.class);
	}
}