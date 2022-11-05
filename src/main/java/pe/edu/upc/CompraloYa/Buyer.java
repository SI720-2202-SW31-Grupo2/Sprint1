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
    Ubication BuyerUbication = new Ubication();
    PaymentMethod BuyerPaymentMethod = new PaymentMethod();
    //constructor
    public Buyer(){
    }
    //methods
    public void RegisterBuyer(String firstname, String lastname, int dni, String email, int phonenumber, String password){
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
    public void SetBuyerUbication(Ubication ubication){
        this.BuyerUbication = ubication;
    }
    public void SetBuyerPaymentMethod(PaymentMethod paymentmethod){
        this.BuyerPaymentMethod = paymentmethod;
    }
    public int GetBuyerID(){ return BuyerID; }
}
