/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSES;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author levai
 */
public class UsersTest {
    
    public UsersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Users.
     */
    
    @Test
    public void testUsersList() {
        System.out.println("UsersList");
        Users instance = new Users();
        ArrayList<Users> expResult = null;
        ArrayList<Users> result = instance.UsersList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
        public void testFullName() {
            Users u = new Users();
            u.setFullname("test");
            String s = u.getFullname();
            assertEquals(s,"test");
        }
    
    
}
