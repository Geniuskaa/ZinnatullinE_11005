package HomeWork_20_11;

public class Product {
    private String nameOfProduct;
    private int price; // В долларах
    private String manufacturer;

    Product(String nameOfProduct, int price, String manufacturer){
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void display(){
        System.out.println("Товар: " + this.nameOfProduct);
        System.out.println("Цена: " + this.price + "$");
        System.out.println("Производитель: " + this.manufacturer);
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
