package pack;

public abstract class Image {

    public abstract void drawImage();
}

class Landmarks extends Image{

    public void drawImage(){
        System.out.println("I am drawing a landmark");
    }
}
