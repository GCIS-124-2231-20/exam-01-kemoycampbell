package hospital;

public class Doctor extends Provider{
     

    public Doctor(String name, String npi){
        super(name, npi);       
    }

    public boolean getIsAvailable(){
        return super.getIsAvailable();
    }

    @Override
    public void treatPatient(Patient patient){
        patient.setCondition("bad");
        patient.setPrognosis("very bad");
    }
}
