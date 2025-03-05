
package Control;

import javax.swing.JOptionPane;

public class updateController {
    
    public static void updatepruduct(String id , String name ,String price ,  String add_date , String discription){
        
        if(id.equals("") || name.equals("") || price.equals("") || add_date.equals("")|| discription.equals("")){
            JOptionPane.showMessageDialog(null, "product update failed");
        }else{
            JOptionPane.showMessageDialog(null, "product updated ");
            new Model.DBupdate().updateItem(id , name , price , add_date , discription);
        }
    }

    public static void updateCustomer(String Customer_ID , String Customer_name ,String contact_No , String address){
        
        if(Customer_ID.equals("") || Customer_name.equals("") || contact_No.equals("") || address.equals("")){
            JOptionPane.showMessageDialog(null, "Customer update failed");
        }else{
            JOptionPane.showMessageDialog(null, "Customer updated ");
            new Model.DBupdate().updateCustomer(Customer_ID , Customer_name , contact_No , address);
        }
    }
    
    public static void updatesoldproduct(String soldID , String customerID , String cName , String productID , String pName , String quan , String pprice){
        
        if(soldID.equals("") || customerID.equals("") || cName.equals("") || productID.equals("") || pName.equals("") || quan.equals("") || pprice.equals("") ){
            JOptionPane.showMessageDialog(null, "product update failed");
        }else{
            JOptionPane.showMessageDialog(null, "product updated ");
            new Model.DBupdate().updateSoldDetails(soldID , customerID , cName , productID , pName , quan , pprice );
        }
    }
}
