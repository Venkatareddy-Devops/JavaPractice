import javax.xml.namespace.QName;

public class BuyACar {
    public static void main(String[] argc) {
        BuyACar buyacar = new BuyACar();
        buyacar.selectBrand("bmw");
        buyacar.variant("x5");
        buyacar.color("blue");
        buyacar.payment(50000);
        buyacar.delivery();

    }

    public void selectBrand(String name) {
        System.out.println("select a brand" + name);
    }

    public void variant(String name) {
        System.out.println("Choose variant");
    }

    public void color(String name) {
        System.out.println("choose colour" + name);
    }

    public void price(int no) {
        System.out.println("price of a car ==" + no);
    }

    public void payment(int no) {
        System.out.println("success === " + no);
    }

    public void delivery() {
        System.out.println("car delivery ");
    }
}
