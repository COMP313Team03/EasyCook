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
 * The class <code>WorkerTest</code> contains tests for the class <code>{@link Worker}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:51 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class WorkerTest {
	/**
	 * Run the Worker() constructor test.
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testWorker_1()
		throws Exception {
		Worker result = new Worker();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		Worker fixture = new Worker();
		fixture.FLAG = true;
		MainActivity mainActivity = new MainActivity();
		mainActivity.bridgeTables = new ArrayList();
		mainActivity.ingredients = new ArrayList();
		mainActivity.recipes = new ArrayList();
		mainActivity.recipeCategory = new ArrayList();
		mainActivity.ingredientCategory = new ArrayList();
		fixture.main = mainActivity;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.MainActivity.<init>(MainActivity.java:35)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testRun_2()
		throws Exception {
		Worker fixture = new Worker();
		fixture.FLAG = true;
		MainActivity mainActivity = new MainActivity();
		mainActivity.bridgeTables = new ArrayList();
		mainActivity.ingredients = new ArrayList();
		mainActivity.recipes = new ArrayList();
		mainActivity.recipeCategory = new ArrayList();
		mainActivity.ingredientCategory = new ArrayList();
		fixture.main = mainActivity;

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.example.easycook.MainActivity.<init>(MainActivity.java:35)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
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
	 * @generatedBy CodePro at 17/04/16 12:51 PM
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
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorkerTest.class);
	}
}