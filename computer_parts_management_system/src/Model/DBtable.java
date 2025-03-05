
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DBtable {
    
    public static void setItemToTable(DefaultTableModel model , JTable Table){
    try {
        Connection conn = DBconnecter.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(" select * from pruduct_db2");
        
        while(rs.next()){
            int id = rs. getInt ("Id");
            String name = rs. getString ("name");
            int price  = rs. getInt ("price");
            String add_date  = rs. getString ("add_date");
            String discription = rs. getString ("discription");
            
             
            
            Object[] obj = {id, name , price, add_date,discription};
            model =(DefaultTableModel) Table.getModel();
            model.addRow(obj);
        }
    
    } catch (Exception e) {
        e.printStackTrace();
    }
    
} 
    
    public static void setCustomerDetailsToTable(DefaultTableModel model , JTable Table){
    try {
        Connection conn = DBconnecter.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(" select * from customer_details");
        
        while(rs.next()){
            int customerID = rs. getInt ("Customer_ID");
            String name = rs. getString ("Customer_name");
            int contactNo = rs. getInt ("contact_No");
            String Address = rs. getString ("address");
            
            Object[] obj = {customerID, name , contactNo, Address};
            model =(DefaultTableModel) Table.getModel();
            model.addRow(obj);
        }
    
    } catch (Exception e) {
        e.printStackTrace();
    }
    
} 
    public static void setSoldProductsDetailsToTable(DefaultTableModel model , JTable Table){
    try {
        Connection conn = DBconnecter.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(" select * from sold_products");
        
        while(rs.next()){
            int soldID = rs. getInt ("Sell_product_ID");
            int customerID = rs. getInt ("Customer_ID");
            String cName = rs. getString ("Customer_name");
            int productID = rs. getInt ("product_ID");
            String pName = rs. getString ("product_name");
            int quan = rs. getInt ("Quntity");
            int pprice = rs. getInt ("price");
            
            
            Object[] obj = {soldID, customerID, cName , productID, pName , quan, pprice };
            model =(DefaultTableModel) Table.getModel();
            model.addRow(obj);
        }
    
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}  

}
