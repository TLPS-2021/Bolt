package CLASSES;

//hi

import CLASSES.DB_INFO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 1BestCsharp
 */
public class Category {
    
    
    Connection connection;
    
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCategoryId(String name) {
        return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public Category(){}
    
    public Category(Integer ID, String NAME)
    {
        this.id = ID;
        this.name = NAME;
    }
    
    
  
}
