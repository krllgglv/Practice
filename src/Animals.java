public class Animals {
    public void makenoise(int a){
        System.out.println("привет из суперкласса");
    }
}
class Cat extends Animals{



    public int makenoise(float a, float b) {
        System.out.println(" привет от кошки");
        return (int) a;
    }
    public void makeCatsNoise(){
        System.out.println(" мяу");
    }
}
