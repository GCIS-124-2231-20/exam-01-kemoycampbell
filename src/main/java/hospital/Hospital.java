package hospital;

public class Hospital {
    
    private static Patient[] patients = {
        new Patient("Sam Malone"),
        new Patient("Steve Buschemi"),
        new Patient("Sally Struthers"),
        new Patient("Cher"),
        new Patient("Seal")
    };

    private static Provider[] providers = {
        new Nurse("Betty White", "12345", "RN"),
        new Nurse("Gordon Schumway", "67890", "LPN"),
        new Doctor("Doctor J", "9999"),
        new Doctor("Doctor Feelgood", "434343") 
    };



    public static void main(String[] args){

        for(int i = 0; i < patients.length; i++){

            Provider provider = getNextAvailableProvider();
            if(provider == null)
                break;
            
            provider.treatPatient(patients[i]);

        }


    }

    public static Provider getNextAvailableProvider()
    {
        for(int i = 0; i < providers.length; i++){
            if(providers[i].getIsAvailable())
                return providers[i];
        }

        return null;
    }
}
