public class MovieTicket {
    public static void main(String[] args) {
        MovieTicket movieTicket= new MovieTicket();
        movieTicket.openBookMyShow();
        movieTicket.movieNames("movie names");
        movieTicket.noOf(2);
        movieTicket.payment(456789);
        movieTicket.conformation("");
    }
    public void openBookMyShow(){
        System.out.println("search" );
    }
    public void movieNames(String name){
        System.out.println("movie names" );
    }
    public void noOf(int no){
        System.out.println("no");
    }
    public void payment(int no){
        System.out.println("payment status");
    }
    public void conformation(String sucess){
        System.out.println("sucess");
    }
}
