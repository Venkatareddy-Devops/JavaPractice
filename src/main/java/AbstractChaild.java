public class AbstractChaild extends AbstractionHome{

    public static void main(String[] args) {
        AbstractChaild abstractionchaild = new AbstractChaild();
        abstractionchaild.accountopen();
        abstractionchaild.atm();
        abstractionchaild.check();
        abstractionchaild.transcation();
        abstractionchaild.withdraw();
    }

    public void withdraw(){
        System.out.println("cash withdraw");
    }
    public void atm(){
        System.out.println("atm pin");
    }
    public void accountopen(){
        System.out.println("opening account");
    }

    public void check(){
        System.out.println("check no");
    }
}
