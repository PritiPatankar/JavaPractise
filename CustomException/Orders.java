package CustomException;
import java.util.Scanner;

public class Orders {
    Scanner sc = new Scanner(System.in);
    private int orderID;
    private String orderItem;

    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    public int getOrderID(){
        return orderID;
    }
    public void setOrderItem(String orderItem){
        this.orderItem = orderItem;
    }
    public String getOrderItem(){
        return orderItem;
    }

    void getData() throws emptyCartException{
        System.out.println("Enter number of items: ");
        int n=sc.nextInt();
        if(n<=0){
            throw new emptyCartException("Cart is Empty");
        }
        else{
            for(int i=0; i<n; i++){
                System.out.println("Enter order ID: ");
                this.setOrderID(sc.nextInt());
                System.out.println("Enter Order Item: ");
                this.setOrderItem(sc.next());
            }
            
        }
    }

        public static void main(String[] args){
            Orders O = new Orders();
            try{
                O.getData();
            }
            catch(emptyCartException ece){
                System.out.println(ece);
            }
        }
    
    
}
