package camera;

public class DigitalCamera extends Camera {
    private int pictureSizeInMB;
    private int remainingMB;

    public DigitalCamera(String manufacturer, String model, LensType type, int size) {
        super(manufacturer, model, type);
        this.pictureSizeInMB = size;
    }

    public void insertMemoryCard(int mb)
    {
        this.remainingMB = mb;
    }

    @Override
    public boolean takePicture()
    {
        if(this.pictureSizeInMB > this.remainingMB)
            return false;
        
            remainingMB--;
            return true;
    }

    
}
