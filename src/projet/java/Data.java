/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;

/**
 *
 * @author Pandoc
 */
public class Data {
    
    public static void main(String[] args){
        try{
            Class.forName("org.mysql.Driver");
            
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String passwd = "root";
            
            Data conn = DriverManager.getConnection(url, user, passwd);
        } catch (Excepetion e){
            e.printStackTrace();
        }
    }
    
}
