
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBdelete {
    public boolean deleteItem(String id){
        boolean isDeleted = false;

        try {
           Connection conn = DBconnecter.getConnection();
           String sql = "delete from pruduct_db2 where Id = ?";
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.setString(1,id);
           
           int rowCount = pst.executeUpdate();
           if(rowCount >0 ){
               isDeleted = true;
           }else {
               isDeleted = false;
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
    
    public boolean deleteCustomer(String Customer_ID){
        boolean isDeleted = false;
        
        
        try {
           Connection conn = DBconnecter.getConnection();
           String sql = "delete from customer_details where customer_id = ?";
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.setString(1,Customer_ID);
           
           int rowCount = pst.executeUpdate();
           if(rowCount >0 ){
               isDeleted = true;
           }else {
               isDeleted = false;
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
}
