
package Control;

import javax.swing.JOptionPane;

public class deleteController {
    
    public static void deletepruduct(String id ){
        
        if(id.equals("") ){
            JOptionPane.showMessageDialog(null, "product Deleted failed");
        }else{
            JOptionPane.showMessageDialog(null, "product Deleted ");
            new Model.DBdelete(). deleteItem(id );
        }
    }
    
    public static void deleteCustomer(String Customer_ID){
        
        if(Customer_ID.equals("") ){
            JOptionPane.showMessageDialog(null, "product Deleted failed");
        }else{
            JOptionPane.showMessageDialog(null, "product Deleted ");
            new Model.DBdelete(). deleteCustomer(Customer_ID);
        }
    }
}
