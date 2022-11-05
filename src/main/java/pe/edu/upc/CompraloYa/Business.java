package pe.edu.upc.CompraloYa;

public class Business {
    //fields
    private int BusinessID;
    Owner owner = new Owner();
    private String Name;
    private long RUC;
    private boolean State;
    Ubication BusinessUbication = new Ubication();
    //constructor
    public Business(Owner owner, String name, long ruc, Ubication ubication){
        this.owner = owner;
        this.Name = name;
        this.RUC = ruc;
        this.BusinessUbication = ubication;
        this.BusinessID = (int)(Math.random()*1000+1);
        this.State = false;
    }
    //methods
    public void OpenBusiness(){ this.State = true; }
    public void CloseBusiness(){ this.State = false; }
    public int GetBusinessID(){ return BusinessID; }
    public Owner GetOwner(){ return owner; }
    public String GetName(){ return Name; }
    public void SetName(String name){ this.Name = name;}
    public long GetRUC(){ return RUC; }
    public void SetRUC(long ruc){ this.RUC = ruc; }
    public boolean GetState(){ return State; }
    public Ubication GetUbication(){ return BusinessUbication; }
}
