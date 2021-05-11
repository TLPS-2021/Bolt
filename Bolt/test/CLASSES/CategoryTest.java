/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSES;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
/**
 *
 * @author levai
 */
public class CategoryTest {
    

    public CategoryTest() {
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

    String NAME = "ruha";
    int ID = 5;
    
    @Test
    public void testInsertCategory() {
           
        
        
        System.out.println("asd");
        Category category = new Category(ID, NAME);
        Category.insertCategory(category);
        
        System.out.println("asd2");
        Category expected = getCategoryByName(NAME);
        
        System.out.println("asd3");
        assertNotNull(expected);
    }
    
    @Test
    public void DelCategory() {
        
        Category cat = getCategoryByName(NAME);
        assertNotNull(cat);
        Category.deleteCategory(cat.getId());
        Category expected = getCategoryByName(NAME);
        assertNull(expected);
    }
    
    private Category getCategoryByName(String Name){
        Category category = new Category();
        ArrayList<Category> list = category.categoriesList();

        for(Category c : list){
            if(c.getName().equals(Name)){
                return c;
            }           
        }
        return null;
        
    }
    
    
    
}
