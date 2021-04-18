package CLASSES;

import CLASSES.DB_INFO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users {
    Connection connection;
    
    private Integer id;
    private String username;
    private String password;
    private String user_type;
    private String fullname;
}