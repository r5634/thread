package DesignPattern.Builder;

public class DigitalZoomCameraBuilder extends CameraBuilder {
    @Override
    public void buildOpticalZome() {
        this.cam.setOpticalZoom("None");
    }
 
    @Override
    public void buildDigitalZome() {
        this.cam.setDigitalZoom("10X Optical Zoom");
    }
 
    @Override
    public void buildDisplay() {
        this.cam.setDisplaySize("4 inch LED screen");
    }
 
    @Override
    public void buildMemory() {
        this.cam.setInMemorySize("16GB inbuilt memory");
    }

}
