public class Rose extends  Flowers{
    private String color;
    private String sort;


    public Rose(String type,String color, String sort) {
        super(type);
        this.color = color;
        this.sort = sort;
    }


    void blossomed(){
        System.out.println("Flowers blossomed...");
    }
    void withered(){
        System.out.println("Flowers withered...");
    }

}
