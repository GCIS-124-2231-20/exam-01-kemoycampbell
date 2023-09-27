package camera;

public class Camera
{
    private String manufacturer;
    private String model;
    private LensType type;

    public Camera(String manufacturer, String model, LensType type)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
    }

    public boolean takePicture()
    {
        return true;
    }
}