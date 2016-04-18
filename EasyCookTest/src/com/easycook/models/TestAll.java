package com.easycook.models;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 17/04/16 12:48 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	RecipeCategoryRootTest.class,
	IngredientCategoryRootTest.class,
	IngredientTest.class,
	RecipeTest.class,
	RecipeRootTest.class,
	BridgeTableRootTest.class,
	IngredientCategoryTest.class,
	RecipeCategoryTest.class,
	IngredientRootTest.class,
	BridgeTableTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
