package interface_mobil;
import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    
        //membuat objek Mobil toyota
        Mobil avanza = new Toyota(); 
        //membuat user Toyota
        CarUser maska = new CarUser(avanza);
      
        
        //membuat objek Mobil prosche
        Mobil spider = new Ferari();
        //membuat user porsche 
        CarUser amnan = new CarUser(spider);
        
        //input merek 
        String merek;
        System.out.print("merek mobil : ");
        merek = input.next();
        
        int aksi;
        
         while (true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Stop Engine");
            System.out.println("[3] Naikkan kecepatan");
            System.out.println("[4] turunkan kecepatan");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();
            
            if (merek.equalsIgnoreCase("toyota")){
                switch(aksi){
                    case 1:
                        maska.startEngine();
                        break;
                    case 2:
                       maska.stopEngine();
                        break;
                    case 3:
                        maska.makeCarfaster();
                        break;
                    case 4:
                        maska.makeCarSlower();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Salah input!!");
               }
           }
            else  if (merek.equalsIgnoreCase("Ferari")){
                switch(aksi){
                    case 1:
                        amnan.startEngine();
                        break;
                    case 2:
                        amnan.stopEngine();
                        break;
                    case 3:
                        amnan.makeCarfaster();
                        break;
                    case 4:
                        amnan.makeCarSlower();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Salah input!!");
               }
           }
           else {
                System.out.println("Merek mobil tidak ditemukan");
                System.exit(0);
           }
        }
        
    }
}
