package com.easycook.data;

import org.junit.*;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.database.Cursor;
import static org.junit.Assert.*;

/**
 * The class <code>EasyCookDBContextTest</code> contains tests for the class <code>{@link EasyCookDBContext}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:29 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class EasyCookDBContextTest {
	/**
	 * Run the EasyCookDBContext(Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testEasyCookDBContext_1()
		throws Exception {
		Context context = new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper()));

		EasyCookDBContext result = new EasyCookDBContext(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the Cursor GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_1()
		throws Exception {
		EasyCookDBContext fixture = new EasyCookDBContext(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));

		Cursor result = fixture.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the Cursor GetIngredientCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetIngredientCategory_1()
		throws Exception {
		EasyCookDBContext fixture = new EasyCookDBContext(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));

		Cursor result = fixture.GetIngredientCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the Cursor GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_1()
		throws Exception {
		EasyCookDBContext fixture = new EasyCookDBContext(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));

		Cursor result = fixture.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the void UpdateLikeIngredient(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testUpdateLikeIngredient_1()
		throws Exception {
		EasyCookDBContext fixture = new EasyCookDBContext(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		int id = 1;
		int like = 1;

		fixture.UpdateLikeIngredient(id, like);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
	}

	/**
	 * Run the Cursor getIngredients() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetIngredients_1()
		throws Exception {
		EasyCookDBContext fixture = new EasyCookDBContext(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));

		Cursor result = fixture.getIngredients();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the Cursor getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		EasyCookDBContext fixture = new EasyCookDBContext(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));

		Cursor result = fixture.getRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
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
	 * @generatedBy CodePro at 17/04/16 12:29 PM
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
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EasyCookDBContextTest.class);
	}
}