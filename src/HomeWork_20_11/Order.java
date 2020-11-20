package HomeWork_20_11;

public class Order {
    private String nameOfBuyer;
    private String nameOfProduct;

    Order(String nameOfBuyer, String nameOfProduct){
        this.nameOfBuyer = nameOfBuyer;
        this.nameOfProduct = nameOfProduct;
    }

    void display(){
        System.out.println("Заказ на имя: " + this.nameOfBuyer);
        System.out.println("Заказ: " + this.nameOfProduct);
    }

    public void purchase(Order[] historyOfRoders, int k){
        /*int k = 0;
        for (Order available : historyOfRoders) {
            if (available == null) {
                break;
            }
            k++;
        }*/
        historyOfRoders[k] = new Order(this.nameOfBuyer, this.nameOfProduct);
    }


}
