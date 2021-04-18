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
    
    public Users(Integer ID, String U, String PW,String UT, String FN)
    {
        this.id = ID;
        this.username = U;
        this.password = PW;
        this.fullname = FN;
        this.user_type = UT;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public ArrayList<Users> UsersList(){
        
        ArrayList<Users> user_list = new ArrayList<>();
        connection = DB_INFO.getConnection();

        ResultSet rs;
        PreparedStatement ps;

               String query = "SELECT `id`, `username`, `password`, `user_type`, `fullname` FROM `users` WHERE `user_type` = 'user'";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
           
            Users user;
            while(rs.next()){
               user = new Users(rs.getInt("id"), 
                                 rs.getString("username"),
                                 rs.getString("password"),
                                 rs.getString("user_type"),
                                 rs.getString("fullname")
                );
                user_list.add(user);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user_list;
    }
}