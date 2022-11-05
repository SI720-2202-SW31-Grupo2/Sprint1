package pe.edu.upc.CompraloYa;

public class Buyer {
    //fields
    private int BuyerID;
    private String FirstName;
    private String LastName;
    private int DNI;
    private String Email;
    private int PhoneNumber;
    private String Password;
    private Ubication BuyerUbication;
    private PaymentMethod BuyerPaymentMethod;
    private Order order;
    public Buyer(String firstname, String lastname, int dni, String email, int phonenumber, String password){
        this.BuyerID = (int)(Math.random()*1000+1);
        this.FirstName = firstname;
        this.LastName = lastname;
        this.DNI = dni;
        this.Email = email;
        this.PhoneNumber = phonenumber;
        this.Password = password;
    }
    public void Login(String email, String password){
        if(this.Email == email);
        if(this.Password == password);
    };
    public void SetBuyerUbication(){
        BuyerUbication = new Ubication();
    }
    public void SetBuyerPaymentMethod(String kind, long accountNumber, String firstname, String lastname, int month, int year, int cvv){
        BuyerPaymentMethod = new PaymentMethod(kind, accountNumber, firstname, lastname, month, year, cvv);
    }
    public int GetBuyerID(){ return BuyerID; }
}
