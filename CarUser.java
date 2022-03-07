package interface_mobil;

public class CarUser {
   
    private Mobil car;
    
    //constructor 
    public CarUser(Mobil car){
        this.car = car;
    }
    
    void startEngine(){
        this.car.engineOn();
    }
    
    void stopEngine(){
        this.car.engineOff();
    }
    
    void makeCarfaster(){
        this.car.speedUp();
    }
    
    void makeCarSlower(){
        this.car.speedDown();
    }
}
