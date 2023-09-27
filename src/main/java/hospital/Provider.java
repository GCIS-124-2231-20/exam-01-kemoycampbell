package hospital;

public abstract class Provider {
    private String name;
    private String npi;    
    private boolean isAvailable;

    public Provider(String name, String npi){
        this.name = name;
        this.npi = npi;        
    }

    public boolean getIsAvailable(){
        return this.isAvailable;
    }

    public void setIsAvailable(boolean available)
    {
        this.isAvailable = false;
    }

    public abstract void treatPatient(Patient patient);

}
