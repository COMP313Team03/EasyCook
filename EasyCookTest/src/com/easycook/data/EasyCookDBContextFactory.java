package com.easycook.data;

import android.content.Context;
import android.accounts.AccountAuthenticatorActivity;


/**
 * The class <code>EasyCookDBContextFactory</code> implements static methods that return instances of the class <code>{@link EasyCookDBContext}</code>.
 *
 * @generatedBy CodePro at 17/04/16 1:18 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class EasyCookDBContextFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17/04/16 1:18 PM
	 */
	private EasyCookDBContextFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link EasyCookDBContext}</code>.
	 *
	 * @generatedBy CodePro at 17/04/16 1:18 PM
	 */
	public static EasyCookDBContext createEasyCookDBContext() {
		return new EasyCookDBContext(new AccountAuthenticatorActivity());
	}
}