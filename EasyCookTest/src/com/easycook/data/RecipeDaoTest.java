package com.easycook.data;

import java.util.ArrayList;
import android.database.Cursor;
import org.junit.*;
import static org.junit.Assert.*;
import com.easycook.models.BridgeTable;
import com.easycook.models.Recipe;
import android.database.MatrixCursor;
import com.easycook.models.RecipeCategory;

/**
 * The class <code>RecipeDaoTest</code> contains tests for the class <code>{@link RecipeDao}</code>.
 *
 * @generatedBy CodePro at 17/04/16 12:29 PM
 * @author Dell
 * @version $Revision: 1.0 $
 */
public class RecipeDaoTest {
	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_1()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_2()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_3()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_4()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_5()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_6()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_7()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_8()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_9()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_10()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_11()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_12()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_13()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_14()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateBridgeTable(BridgeTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateBridgeTable_15()
		throws Exception {
		BridgeTable bridge = new BridgeTable();

		boolean result = RecipeDao.CreateBridgeTable(bridge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateBridgeTable(RecipeDao.java:308)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_1()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_2()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_3()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_4()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_5()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_6()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_7()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_8()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_9()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_10()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_11()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_12()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_13()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the boolean CreateRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testCreateRecipe_14()
		throws Exception {
		Recipe recipe = new Recipe();

		boolean result = RecipeDao.CreateRecipe(recipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$100(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$8.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getOutputStream(Unknown Source)
		//       at com.easycook.data.RecipeDao.CreateRecipe(RecipeDao.java:96)
		assertTrue(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_1()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_2()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_3()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_4()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_5()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_6()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_7()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_8()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_9()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_10()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_11()
		throws Exception {

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetBridgeTable(RecipeDao.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_12()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_13()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<BridgeTable> GetBridgeTable(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetBridgeTable_14()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<BridgeTable> result = RecipeDao.GetBridgeTable(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetIngredients(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetIngredients_1()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<Recipe> result = RecipeDao.GetIngredients(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetIngredients(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetIngredients_2()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<Recipe> result = RecipeDao.GetIngredients(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetIngredients(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetIngredients_3()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<Recipe> result = RecipeDao.GetIngredients(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_1()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_2()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_3()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_4()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_5()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_6()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_7()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_8()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_9()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_10()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_11()
		throws Exception {

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipeCategory(RecipeDao.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_12()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_13()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<RecipeCategory> GetRecipeCategory(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipeCategory_14()
		throws Exception {
		Cursor cursor = new MatrixCursor(new String[] {});

		ArrayList<RecipeCategory> result = RecipeDao.GetRecipeCategory(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.database.AbstractCursor.<init>(AbstractCursor.java:12)
		//       at android.database.MatrixCursor.<init>(MatrixCursor.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_2()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_3()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_4()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_5()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_6()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_7()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_8()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_9()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_10()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Recipe> GetRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/04/16 12:29 PM
	 */
	@Test
	public void testGetRecipes_11()
		throws Exception {

		ArrayList<Recipe> result = RecipeDao.GetRecipes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivilegedWithCombiner(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at com.easycook.data.RecipeDao.GetRecipes(RecipeDao.java:39)
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
		new org.junit.runner.JUnitCore().run(RecipeDaoTest.class);
	}
}