public class Vehicle extends Transport{

    public Vehicle(String name,String type,int price,int year) {
        super(name,type,price,year);
    }

    public void show() {
        System.out.println("Name of the Brand : "+this.name);
        System.out.println("Price : "+this.price);
    }

}
