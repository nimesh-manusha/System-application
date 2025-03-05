
package Control;

import javax.swing.JOptionPane;

public class insertController {
    
    public static void addpruduct(String id , String name ,String price ,  String add_date , String discription){
        
        if(id.equals("") || name.equals("") || price.equals("") || add_date.equals("")|| discription.equals("")){
            JOptionPane.showMessageDialog(null, "product added failed");
        }else{
            JOptionPane.showMessageDialog(null, "product added ");
            new Model.DBinsert().addItem(id , name , price , add_date , discription);
        }
    }
    
    public static void addCustomer(String Customer_ID , String Customer_name ,String contact_No ,  String address ){
        
        if(Customer_ID.equals("") || Customer_name.equals("") || contact_No.equals("") || address.equals("")){
            JOptionPane.showMessageDialog(null, "product added failed");
        }else{
            JOptionPane.showMessageDialog(null, "product added ");
            new Model.DBinsert().addCustomer(Customer_ID , Customer_name , contact_No , address );
        }
    }

    public static void addSoldProduct(String soldID , String customerID , String cName , String productID , String pName , String quan , String pprice){
        
        if( soldID.equals("") || customerID.equals("") || cName.equals("") || productID.equals("") || pName.equals("") || quan.equals("") || pprice.equals("")){
            JOptionPane.showMessageDialog(null, "product added failed");
        }else{
            JOptionPane.showMessageDialog(null, "product added ");
            new Model.DBinsert().addSoldProduct(soldID , customerID , cName ,  productID , pName , quan ,pprice );
        }
    }
}
