package camera;

public class AnalogCamera extends Camera
{
    private int picturesRemaining;
    private int roll;

    public AnalogCamera(String manufacturer, String model, LensType type) {
        super(manufacturer, model, type);
        this.picturesRemaining = 0;
    }

    public void loadFilmRoll(int roll)
    {
        this.roll = roll;
    }

    @Override
    public boolean takePicture()
    {
        if(picturesRemaining > roll)
            return false;
        
        picturesRemaining++;
        return true;
    }


    
}
