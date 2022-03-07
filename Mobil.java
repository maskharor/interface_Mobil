package interface_mobil;

public interface Mobil {
    int MAX_SPEED = 120;
    int MIN_SPEED= 0;
    
    void engineOn();
    void engineOff();
    void speedUp();
    void speedDown();
}
