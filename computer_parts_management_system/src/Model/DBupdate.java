
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class DBupdate {
    
    public boolean updateItem(String id , String name ,String price ,  String add_date , String discription){
    boolean isUpdated = false;
        
    
  
    try {
        Connection conn = DBconnecter.getConnection();
        String sql = " update pruduct_db2 set name = ?, price = ?, add_date = ? , discription=? where Id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,name);
        pst.setString(2,price);
        pst.setString(3, add_date);
        pst.setString(4, discription);
        pst.setString(5, id);
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isUpdated = true;
        }else {
            isUpdated = false ;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isUpdated;
} 
    
    public boolean updateCustomer(String Customer_ID , String Customer_name ,String contact_No , String address){
    boolean isUpdated = false;
    
    try {
        Connection conn = DBconnecter.getConnection();
        String sql = " update customer_details set Customer_name = ?, contact_No = ?, address = ? where customer_id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,Customer_name);
        pst.setString(2,contact_No);
        pst.setString(3,address);
        pst.setString(4, Customer_ID);
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isUpdated = true;
        }else {
            isUpdated = false ;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isUpdated;
}
    
    public boolean updateSoldDetails( String soldID , String customerID , String cName , String productID , String pName , String quan , String pprice ){
    boolean isUpdated = false;
    try {
        Connection conn = DBconnecter.getConnection();
        String sql = " update sold_products set Customer_ID = ? ,Customer_name = ?,product_ID = ? ,product_name = ?  , Quntity = ? ,Price = ? where Sell_product_ID = ? ";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, customerID);
        pst.setString(2, cName);
        pst.setString(3, productID);
        pst.setString(4, pName);
        pst.setString(5, quan);
        pst.setString(6, pprice);
        pst.setString(7, soldID);
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isUpdated = true;
        }else {
            isUpdated = false ;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isUpdated;
}

}
