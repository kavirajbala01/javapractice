package oops;

interface rackets {
	public String getstrength();
	public String getweight();
}


class ProductDetails {
    private String brand;
    private String productId;
    private int price;
    private String color;
    
    public ProductDetails(String brand, String productId, int price, String color) {
        this.brand = brand;
        this.productId = productId;
        this.price = price;
        this.color = color;
    }
    
    public void printDetails() {
        System.out.println(getBrand());
        System.out.println(getProductId());
        System.out.println(getprice());
        System.out.println(getColor());
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public int getprice() {
        return price;
    }
    
    public void setprice(int price) {
        this.price = price;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}

class tennisrackets extends ProductDetails implements rackets{
    private String weight;
    private String strength;
    
    public tennisrackets(String brand, String productId, int price, String color, String weight, String strength) {
        super(brand, productId, price, color);
        this.weight = weight;
        this.strength = strength;
    }
    
    public String getweight() {
        return weight;
    }
    
    public String getstrength() {
        return strength;
    }
}
	

class AbstractionExample {
    public static void main(String[] args) {
        rackets rackets1 = new tennisrackets("yonex", "12345", 5400, "Black", "low", "min");
       rackets rackets2 = new tennisrackets("Adidas", "67890", 12000, "White", "high", "max");
    
        
        System.out.println("rackets 1:");
        System.out.println("Brand: " + ((tennisrackets) rackets1).getBrand());
        System.out.println("Product ID: " + ((tennisrackets) rackets1).getProductId());
        System.out.println("price: " + ((tennisrackets) rackets1).getprice());
        System.out.println("Color: " + ((tennisrackets) rackets1).getColor());
        System.out.println("weight: " + rackets1.getweight());
        System.out.println("strength: " + rackets1.getstrength());
        
        System.out.println("rackets 2:");
        System.out.println("Brand: " + ((tennisrackets) rackets2).getBrand());
        System.out.println("Product ID: " + ((tennisrackets) rackets2).getProductId());
        System.out.println("price: " + ((tennisrackets) rackets2).getprice());
        System.out.println("Color: " + ((tennisrackets) rackets2).getColor());
        System.out.println("weight: " + rackets2.getweight());
        System.out.println("strength: " + rackets2.getstrength());
    }
}

	
