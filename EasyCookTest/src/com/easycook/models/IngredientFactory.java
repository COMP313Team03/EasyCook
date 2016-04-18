package com.easycook.models;



/**
 * The class <code>IngredientFactory</code> implements static methods that return instances of the class <code>{@link Ingredient}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:48 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class IngredientFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	private IngredientFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Ingredient}</code>.
	 *
	 * @generatedBy CodePro at 17/04/16 12:48 PM
	 */
	public static Ingredient createIngredient() {
		return new Ingredient();
	}
}