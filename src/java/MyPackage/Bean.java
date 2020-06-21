/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.beans.*;
import java.io.Serializable;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Sumit
 */
public class Bean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    //private String name,address;
    //private int roll;
    PreparedStatement pst;
    ResultSet rs;
    Connection con;
  
    private PropertyChangeSupport propertySupport;
    
    public Bean() throws ClassNotFoundException, SQLException {
  
                Class.forName("oracle.jdbc.driver.OracleDriver");
       con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM1","1234");

    }
    
  /*  public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getRoll() {
        return roll;
    }
    public void setName(String value) {
        name=value;
    }
    public void setAddress(String value) {
        address=value;
    }
    public void setRoll(int value) {
        roll=value;
    }
*/
    public boolean Delete(int ro) throws SQLException{


    
        pst=con.prepareStatement("Delete from student where roll=?");
              pst.setInt(1,ro);
              rs=pst.executeQuery();
              if(rs.next())
                        {
                            return(true);
                        }
              else{
                  return(false);
              }
              
    }

    /**
     *
     * @param roll
     * @return
     * @throws java.sql.SQLException
     */
    public boolean Insert(int roll, String use, String pas) throws SQLException{
     pst=con.prepareStatement("Insert into student values(?,?,?)");

                           pst.setInt(1,roll);
                           pst.setString(2,use);
                           pst.setString(3,pas);
                             int r=pst.executeUpdate();
                        if(r>=1)
                        {   
                              return(true);
                        }
                        else{
                            return(false); 
                            }   
    }
    public boolean Login(String use,String pas) throws SQLException{

                         
            pst=con.prepareStatement("Select * from userdetail where username=? and password=?");
                         pst.setString(1, use);
                         pst.setString(2, pas);
                           rs=pst.executeQuery();
                        if(rs.next())
                        {
                            return(true);
                        }
                        else{
                            return(false); 
                            } 
        }
    public ArrayList Search(int r) throws SQLException {
        
        
       
                ArrayList al=new ArrayList();         
        try{
             pst=con.prepareStatement("Select * from student where roll=?");
                             pst.setInt(1,r);
                           rs=pst.executeQuery();
                        if(rs.next())
                        {
                             int r0= rs.getInt(1);
                             String n=rs.getString(2);
                             String ad=rs.getString(3);
                        
                        al.add(r0);
                        al.add(n);
                        al.add(ad);
                      return(al);
                      
                        }
                        else
                        {
                            al.add("false");
                            return(al);
            
                        }
                          }catch(SQLException e){
                            al.add("false");
                            return(al);
            
        }
        
    }
    public boolean Update(int roll, String use, String pas) throws SQLException{
        
        pst=con.prepareStatement("update student set name=? , address=? where roll=?");
            pst.setString(1,use);
                         pst.setString(2,pas);
                         pst.setInt(3,roll);
                           int r=pst.executeUpdate();
                      if(r>=1)
                      {
                          return true;
                          
                      }
                      else
                      {
                          return false;
                      }
        
        
    }

    /**
     *
     * @return 
     * @throws java.sql.SQLException
     */
    public ArrayList DisplayAll() throws SQLException{
        ArrayList asd=new ArrayList();
            pst=con.prepareStatement("select * from student",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             rs=pst.executeQuery();
             ResultSetMetaData rsmd=rs.getMetaData();
            int cols=rsmd.getColumnCount();
         
             String colname[]=new String[cols];
             for(int i=1;i<=cols;i++){
                 
         asd.add(rsmd.getColumnName(i));
             }
              while(rs.next()){
             
                 for(int i=1;i<=cols;i++)
                 {
                    asd.add(rs.getString(i));
                     }
                 
                 
             }
         
        
        
        return asd;
        
    }
    
                             
    }
    
    

