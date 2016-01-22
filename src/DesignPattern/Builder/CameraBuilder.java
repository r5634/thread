package DesignPattern.Builder;

public abstract class CameraBuilder {
    protected Camera cam;
    
    public Camera getCamara(){
        return this.cam;
    }
     
    public void createNewCamera(){
        this.cam = new Camera();
    }
     
    public abstract void buildOpticalZome();
    public abstract void buildDigitalZome();
    public abstract void buildDisplay();
    public abstract void buildMemory();
}
