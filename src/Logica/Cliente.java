/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Cliente {
    int d;
    
    public void lanzamiento(){
        int f2=0, f3=0, f4=0, f5=0, f6=0, f7=0, f8=0, f9=0, f10=0, f11=0, f12=0;
        for (int i = 1; i <= 1000; i++){
            Dado d1 = new Dado();
            Dado d2 = new Dado();
            d1.setDado(6);
            d2.setDado(6);
            d = d1.getDado()+d2.getDado();
            
            if (d == 2){
                f2 = f2 +1;
            }if (d == 3){
                f3 = f3 +1;
            }if (d == 4){
                f4 = f4 +1;
            }if (d == 5){
                f5 = f5 +1;
            }if (d == 6){
                f6 = f6 +1;
            }if (d == 7){
                f7 = f7 +1;
            }if (d == 8){
                f8 = f8 +1;
            }if (d == 9){
                f9 = f9 +1;
            }if (d == 10){
                f10 = f10 +1;
            }if (d == 11){
                f11 = f11 +1;
            }if (d == 12){
                f12 = f12 +1;
            }
    }
        System.out.println("Frecuencia de N° 2: "+f2+"\n"+
                "Frecuencia de N° 3: "+f3+"\n"+
                "Frecuencia de N° 4: "+f4+"\n"+
                "Frecuencia de N° 5: "+f5+"\n"+
                "Frecuencia de N° 6: "+f6+"\n"+
                "Frecuencia de N° 7: "+f7+"\n"+
                "Frecuencia de N° 8: "+f8+"\n"+
                "Frecuencia de N° 9: "+f9+"\n"+
                "Frecuencia de N° 10: "+f10+"\n"+
                "Frecuencia de N° 11: "+f11+"\n"+
                "Frecuencia de N° 12: "+f12+"\n");
}
}

    
    
