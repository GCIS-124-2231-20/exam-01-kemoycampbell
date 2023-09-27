package hospital;

public class Nurse extends Provider{
    

    private String degree;

    public Nurse(String name, String npi, String degree){
        super(name, npi);
        super.setIsAvailable(true);
        if(degree.equals("RN") || degree.equals("LN"))
        {
            this.degree = degree;  
        }
            
              
    }

    public boolean getIsAvailable(){
        return super.getIsAvailable();
    }

    public void treatPatient(Patient patient){
        super.setIsAvailable(false);
        patient.setCondition("ok");
        patient.setPrognosis("so so");
    }

    public void triagePatient(Patient patient){
        super.setIsAvailable(false);
        patient.setTemperature(99.9);
        patient.setBloodPressure("140/100");
    }
}
