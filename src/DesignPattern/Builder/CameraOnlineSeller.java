package DesignPattern.Builder;

public class CameraOnlineSeller {
    public static void main(String a[]){
        CameraMaker cm = new CameraMaker();
        System.out.println("Creating camara with optical zoom...");
        CameraBuilder ozcb = new OpticalZoomCameraBuilder();
        cm.setCamaraBuilder(ozcb);
        cm.constructCamara();
        Camera cam = cm.getCamara();
    }
}
