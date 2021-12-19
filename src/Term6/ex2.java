package Term6;

public class ex2 {
    public static void main(String[] args) {
        Item_ex2 a = new Item_ex2();
        Item_ex2 b = new Item_ex2();
        a.name = "apple";
        b.price = 100;
        a.price = 200;
        b.name = "banana";
        a = b;
        a.printInfo();
    }
}
