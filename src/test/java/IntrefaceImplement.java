public class IntrefaceImplement implements InterfaceHome,InterfaceSecond{

    public static void main(String[] args) {
        IntrefaceImplement intrefaceImplement = new IntrefaceImplement();
        intrefaceImplement.atm();
        intrefaceImplement.accountopen();
        intrefaceImplement.check();
        intrefaceImplement.studentadd();
        intrefaceImplement.studentid();
        intrefaceImplement.studentname();



        intrefaceImplement.openaccount();
        intrefaceImplement.transfer();
    }



    public void atm(){
        System.out.println("atm pin");

    }

    @Override
    public void openaccount() {

    }

    public void accountopen(){
        System.out.println("account open form");
    }
    public void check(){
        System.out.println("chech no");

    }

    @Override
    public void transfer() {

    }

    public void transcation(){
        System.out.println("transaction detailes");
    }

    public void studentid(){
        System.out.println("student number");
    }

    public void studentname(){
        System.out.println("name of the student");
    }

    public void studentadd(){
        System.out.println("student address");
    }

}
