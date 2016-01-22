package DesignPattern.Builder;

public class CameraMaker {
    private CameraBuilder camBuilder = null;
    
    public void setCamaraBuilder(CameraBuilder camBuilder){
        this.camBuilder = camBuilder;
    }
     
    public Camera getCamara(){
        return this.camBuilder.getCamara();
    }
     
    public void constructCamara(){
        this.camBuilder.createNewCamera();
        this.camBuilder.buildDigitalZome();
        this.camBuilder.buildOpticalZome();
        this.camBuilder.buildDisplay();
        this.camBuilder.buildMemory();
    }
}
