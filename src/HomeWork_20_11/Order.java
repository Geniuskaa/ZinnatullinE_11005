package HomeWork_20_11;

public class Order {
    //private String nameOfBuyer;
    private Buyer nameOfBuyer;
    private Product nameOfProduct;
    //private String nameOfProduct;

    Order(Buyer nameOfBuyer, Product nameOfProduct){
        this.nameOfBuyer = nameOfBuyer;
        this.nameOfProduct = nameOfProduct;
    }

    void display(){
        System.out.println("Заказ на имя: " + this.nameOfBuyer);
        System.out.println("Заказ: " + this.nameOfProduct);
    }

    public void purchase(Order[] historyOfOrders, int k){
        /*int k = 0;
        for (Order available : historyOfRoders) {
            if (available == null) {
                break;
            }
            k++;
        }*/
        historyOfOrders[k] = new Order(this.nameOfBuyer, this.nameOfProduct);
    }


}
