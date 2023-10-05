package tutorial;

import java.util.Scanner;

public class TarifBiaya{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        
       System.out.print("Masukan jenis kendaraan (motor/mobil)");
       String jeniskendaraan = input.nextLine();

       System.out.print("Masukan durasi parkir (jam): ");
       double durasiParkir = input.nextDouble();

       double tarifMotor = 3000;
       double tarifMobil = 5000;

       double biayaParkir = 0;

       if (jeniskendaraan.equalsIgnoreCase("Motor")){
        biayaParkir = tarifMotor * durasiParkir;}
       else if (jeniskendaraan.equalsIgnoreCase("mobil")){
        biayaParkir = tarifMobil * durasiParkir;} 
       else {System.out.println("Jenis kendaraan tidak valid");System.exit(1);}
       
       System.out.println(" Biaya parkir untuk " + jeniskendaraan + " selama " + durasiParkir + " jam adalah Rp." + biayaParkir);

       input.close();
       }

}