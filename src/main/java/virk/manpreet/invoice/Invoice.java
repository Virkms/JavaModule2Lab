/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package virk.manpreet.invoice;


public class Invoice {
      private String Description;
   private int quantity;
   private double price;
    private String Part;
    public Invoice(String par, String des,int q,double p){
    Part = par;
    Description =des;
    quantity = q;
    price = p;
    
}

    public String getPart(){
        return Part;
    }

    public void setPart(String Part) {
        this.Part = Part;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
      
        }
      public double getInvoiceAmount(){
            return getQuantity()* getPrice();
    }
}
    

    


    
