package com.easycook.data;



/**
 * The class <code>IngredientDaoFactory</code> implements static methods that return instances of the class <code>{@link IngredientDao}</code>.
 *
 * @generatedBy CodePro at 17/04/16 1:18 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class IngredientDaoFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17/04/16 1:18 PM
	 */
	private IngredientDaoFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link IngredientDao}</code>.
	 *
	 * @generatedBy CodePro at 17/04/16 1:18 PM
	 */
	public static IngredientDao createIngredientDao() {
		return new IngredientDao();
	}
}