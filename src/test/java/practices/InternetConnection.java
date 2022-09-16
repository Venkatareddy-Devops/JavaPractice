package practices;

public class InternetConnection {
    public static void main(String[] argc){
        InternetConnection internetConnection= new InternetConnection();
        internetConnection.customerAadhar("123456789");
        internetConnection.idCreation(5109);
        internetConnection.activation("date");


    }

    public void customerAadhar(String aadharno){
        System.out.println("aadharno" + aadharno);

    }
    public void idCreation(int no){
        System.out.println("id no" + no);
    }
    public void activation(String date){
        System.out.println("activation date" +date);

    }
}


