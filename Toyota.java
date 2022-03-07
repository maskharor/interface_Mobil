package interface_mobil;

public class Toyota implements Mobil{
    
    private int speed;
    private boolean isEngineOn;
    
    //consturctor
    public Toyota(){
        //Kecepatan awal
        this.speed = 0;
    }
    
    @Override
    public void engineOn() {
        isEngineOn = true;
        System.out.println("Engine on..");
        System.out.println("Silahkan gunakan sabuk pengaman");
        System.out.println("Mode normal");
    }

    @Override
    public void engineOff() {
        isEngineOn = false;
        System.out.println("Engine off");
    }

    @Override
    public void speedUp() {
        if (isEngineOn){
            if(this.speed == MAX_SPEED){
                System.out.println("Speed limit !!!");
                System.out.println("Speed "+this.getSpeed()+" Km/h");
            }
            else {
                this.speed += 10;
                System.out.println("Kecepatan sekarang : "+this.getSpeed());
            }
        }
        else {
            System.out.println("Nyalakan mesin telebih dahulu");
        }
    }

    @Override
    public void speedDown() {
        if (isEngineOn){
            if(this.speed == MIN_SPEED){
                System.out.println("Mobil berhenti");
                System.out.println("Speed "+this.getSpeed()+" Km/h");
            }
            else {
                this.speed -= 10;
                System.out.println("Kecepatan sekarang : "+this.getSpeed());
            }
        }
        else {
            System.out.println("Nyalakan mesin telebih dahulu");
        }
    }
  
    public int getSpeed(){
       return this.speed;
    }
}
