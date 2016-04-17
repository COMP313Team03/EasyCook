package com.example.easycook;

import java.util.ArrayList;
import org.junit.*;
import android.content.Context;
import android.os.Bundle;
import static org.junit.Assert.*;
import com.easycook.models.BridgeTable;
import com.easycook.models.Ingredient;
import android.widget.ListView;
import android.content.ContextWrapper;
import com.easycook.models.IngredientCategory;
import android.widget.TextView;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import com.easycook.models.Recipe;
import android.content.Intent;
import android.content.MutableContextWrapper;
import com.easycook.models.RecipeCategory;

/**
 * The class <code>RecipeActivityTest</code> contains tests for the class <code>{@link RecipeActivity}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:51 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class RecipeActivityTest {
	/**
	 * Run the RecipeActivity() constructor test.
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testRecipeActivity_1()
		throws Exception {
		RecipeActivity result = new RecipeActivity();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void Finish() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testFinish_1()
		throws Exception {
		RecipeActivity fixture = new RecipeActivity();
		fixture.worker = new RecipeWorker();
		fixture.bridgeTables = new ArrayList();
		fixture.listView = new ListView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.saveButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.recipeCategory = new ArrayList();
		fixture.imageURL = "";
		fixture.imageName = new TextView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredientCategory = new ArrayList();
		fixture.browseButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredients = new ArrayList();
		fixture.recipes = new ArrayList();

		fixture.Finish();

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
	 * Run the void InitApplication() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testInitApplication_1()
		throws Exception {
		RecipeActivity fixture = new RecipeActivity();
		fixture.worker = new RecipeWorker();
		fixture.bridgeTables = new ArrayList();
		fixture.listView = new ListView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.saveButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.recipeCategory = new ArrayList();
		fixture.imageURL = "";
		fixture.imageName = new TextView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredientCategory = new ArrayList();
		fixture.browseButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredients = new ArrayList();
		fixture.recipes = new ArrayList();

		fixture.InitApplication();

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
	 * Run the void Populate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testPopulate_1()
		throws Exception {
		RecipeActivity fixture = new RecipeActivity();
		fixture.worker = new RecipeWorker();
		fixture.bridgeTables = new ArrayList();
		fixture.listView = new ListView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.saveButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.recipeCategory = new ArrayList();
		fixture.imageURL = "";
		fixture.imageName = new TextView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredientCategory = new ArrayList();
		fixture.browseButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredients = new ArrayList();
		fixture.recipes = new ArrayList();

		fixture.Populate();

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
	 * Run the void onActivityResult(int,int,Intent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testOnActivityResult_1()
		throws Exception {
		RecipeActivity fixture = new RecipeActivity();
		fixture.worker = new RecipeWorker();
		fixture.bridgeTables = new ArrayList();
		fixture.listView = new ListView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.saveButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.recipeCategory = new ArrayList();
		fixture.imageURL = "";
		fixture.imageName = new TextView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredientCategory = new ArrayList();
		fixture.browseButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredients = new ArrayList();
		fixture.recipes = new ArrayList();
		int requestCode = 1;
		int resultCode = -1;
		Intent data = new Intent();

		fixture.onActivityResult(requestCode, resultCode, data);

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
	 * Run the void onActivityResult(int,int,Intent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testOnActivityResult_2()
		throws Exception {
		RecipeActivity fixture = new RecipeActivity();
		fixture.worker = new RecipeWorker();
		fixture.bridgeTables = new ArrayList();
		fixture.listView = new ListView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.saveButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.recipeCategory = new ArrayList();
		fixture.imageURL = "";
		fixture.imageName = new TextView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredientCategory = new ArrayList();
		fixture.browseButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredients = new ArrayList();
		fixture.recipes = new ArrayList();
		int requestCode = 2;
		int resultCode = 1;
		Intent data = new Intent();

		fixture.onActivityResult(requestCode, resultCode, data);

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
	 * Run the void onActivityResult(int,int,Intent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testOnActivityResult_3()
		throws Exception {
		RecipeActivity fixture = new RecipeActivity();
		fixture.worker = new RecipeWorker();
		fixture.bridgeTables = new ArrayList();
		fixture.listView = new ListView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.saveButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.recipeCategory = new ArrayList();
		fixture.imageURL = "";
		fixture.imageName = new TextView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredientCategory = new ArrayList();
		fixture.browseButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredients = new ArrayList();
		fixture.recipes = new ArrayList();
		int requestCode = 1;
		int resultCode = 1;
		Intent data = new Intent();

		fixture.onActivityResult(requestCode, resultCode, data);

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
	 * Run the void onActivityResult(int,int,Intent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testOnActivityResult_4()
		throws Exception {
		RecipeActivity fixture = new RecipeActivity();
		fixture.worker = new RecipeWorker();
		fixture.bridgeTables = new ArrayList();
		fixture.listView = new ListView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.saveButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.recipeCategory = new ArrayList();
		fixture.imageURL = "";
		fixture.imageName = new TextView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredientCategory = new ArrayList();
		fixture.browseButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredients = new ArrayList();
		fixture.recipes = new ArrayList();
		int requestCode = 1;
		int resultCode = -1;
		Intent data = null;

		fixture.onActivityResult(requestCode, resultCode, data);

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
	 * Run the void onCreate(Bundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:51 PM
	 */
	@Test
	public void testOnCreate_1()
		throws Exception {
		RecipeActivity fixture = new RecipeActivity();
		fixture.worker = new RecipeWorker();
		fixture.bridgeTables = new ArrayList();
		fixture.listView = new ListView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.saveButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.recipeCategory = new ArrayList();
		fixture.imageURL = "";
		fixture.imageName = new TextView(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredientCategory = new ArrayList();
		fixture.browseButton = new Button(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		fixture.ingredients = new ArrayList();
		fixture.recipes = new ArrayList();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

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
		new org.junit.runner.JUnitCore().run(RecipeActivityTest.class);
	}
}