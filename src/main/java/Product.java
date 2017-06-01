/**
 * Created by designer01 on 5/31/17.
 */
public class Product {
    private String title;
    private String id;
    private String brand;
    private String price;
    private int saleNumber;
    private String image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", saleNumber=" + saleNumber +
                ", image='" + image + '\'' +
                '}';
    }
}
