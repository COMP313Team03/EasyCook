package com.easycook.data;



/**
 * The class <code>RecipeDaoFactory</code> implements static methods that return instances of the class <code>{@link RecipeDao}</code>.
 *
 * @generatedBy CodePro at 17/04/16 1:18 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class RecipeDaoFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17/04/16 1:18 PM
	 */
	private RecipeDaoFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link RecipeDao}</code>.
	 *
	 * @generatedBy CodePro at 17/04/16 1:18 PM
	 */
	public static RecipeDao createRecipeDao() {
		return new RecipeDao();
	}
}