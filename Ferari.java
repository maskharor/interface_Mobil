package interface_mobil;

public class Ferari implements Mobil{
    private int speed;
    private boolean isEngineOn;
    
    //consturctor
    public Ferari(){
        //Kecepatan awal
        this.speed = 0;
    }
    
    @Override
    public void engineOn() {
        isEngineOn = true;
        System.out.println("Engine on..");
        System.out.println("Please put your seatbelt");
        System.out.println("Mode sport");
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
                this.speed += 20;
                System.out.println("Car speed now: "+this.getSpeed());
            }
        }
        else {
            System.out.println("Please start the engine first!!");
        }
    }

    @Override
    public void speedDown() {
        if (isEngineOn){
            if(this.speed == MIN_SPEED){
                System.out.println("Car stopped");
                System.out.println("Speed "+this.getSpeed()+" Km/h");
            }
            else {
                this.speed -= 20;
                System.out.println("Car speed now: "+this.getSpeed());
            }
        }
        else {
            System.out.println("Please start the engine first!!");
        }
    }
  
    public int getSpeed(){
       return this.speed;
    }

}
