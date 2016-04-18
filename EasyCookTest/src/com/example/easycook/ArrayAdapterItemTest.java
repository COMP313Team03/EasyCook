package com.example.easycook;

import java.util.ArrayList;
import android.widget.GridLayout;
import org.junit.*;
import android.content.Context;
import android.view.ContextThemeWrapper;
import static org.junit.Assert.*;
import com.easycook.models.Ingredient;
import android.view.View;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.view.ViewGroup;

/**
 * The class <code>ArrayAdapterItemTest</code> contains tests for the class <code>{@link ArrayAdapterItem}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:53 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class ArrayAdapterItemTest {
	/**
	 * Run the ArrayAdapterItem(Context,int,ArrayList<Ingredient>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:53 PM
	 */
	@Test
	public void testArrayAdapterItem_1()
		throws Exception {
		Context mContext = new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper()));
		int layoutResourceId = 1;
		ArrayList<Ingredient> data = new ArrayList();

		ArrayAdapterItem result = new ArrayAdapterItem(mContext, layoutResourceId, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the View getView(int,View,ViewGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:53 PM
	 */
	@Test
	public void testGetView_1()
		throws Exception {
		ArrayAdapterItem fixture = new ArrayAdapterItem(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())), 1, new ArrayList());
		int position = 1;
		View convertView = new View(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));
		ViewGroup parent = new GridLayout(new ContextWrapper(new MutableContextWrapper(new ContextThemeWrapper())));

		View result = fixture.getView(position, convertView, parent);

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
	 * @generatedBy CodePro at 17/04/16 12:53 PM
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
	 * @generatedBy CodePro at 17/04/16 12:53 PM
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
	 * @generatedBy CodePro at 17/04/16 12:53 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ArrayAdapterItemTest.class);
	}
}