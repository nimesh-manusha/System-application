
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class DBinsert {
    
    public boolean addItem(String id , String name ,String price ,  String add_date , String discription){
    boolean isAdded = false;

    try {
        Connection conn = DBconnecter.getConnection();
        String sql = "insert into pruduct_db2 values (?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, id);
        pst.setString(2, name);
        pst.setString(3, price);
        pst.setString(4, add_date);
        pst.setString(5, discription);
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isAdded = true;
        }else {
            isAdded = false;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isAdded;
}
    
    public boolean addCustomer(String Customer_ID , String Customer_name ,String contact_No , String address  ){
        
    boolean isAdded = false;
    
    
    try {
        Connection conn = DBconnecter.getConnection();
        String sql = "insert into customer_details values (?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, Customer_ID);
        pst.setString(2,Customer_name);
        pst.setString(3, contact_No);
        pst.setString(4, address); 
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isAdded = true;
        }else {
            isAdded = false;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isAdded;
}
    
    public boolean addSoldProduct(String soldID , String customerID , String cName , String productID , String pName , String quan , String pprice){
             boolean isadded = false;
            
            
     
            try {
          Connection conn = DBconnecter.getConnection();
          String sql = "insert into sold_products ( Sell_product_ID , Customer_ID , Customer_name, product_ID, product_name  , Quntity , price ) values (?,?,?,?,?,?,?)";
          PreparedStatement pst = conn.prepareStatement(sql);
          pst.setString(1, soldID);
        pst.setString(2, customerID);
        pst.setString(3, cName);
        pst.setString(4, productID);
        pst.setString(5, pName);
        pst.setString(6, quan);
        pst.setString(7, pprice);
        
      int rowCount = pst.executeUpdate();
       if(rowCount >0 ){
         isadded = true;
           } else {
         isadded = false;
}

      } catch (Exception e) {
      }
        return isadded;    
  } 
  
}
