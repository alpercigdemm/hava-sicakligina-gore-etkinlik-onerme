import  java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

                int heat ;
                Scanner input = new Scanner(System.in);
                System.out.print("Hava sıcaklığını giriniz : ");
                heat= input.nextInt();
                if(heat<5){
                    System.out.println("Kayak yapabilirsin.");
                }
                else if(heat<15){
                    System.out.println("Sinemaya Gidebilirsin");
                    System.out.println("Piknik yapabilirsin");
                } else if (heat<25) {
                    System.out.println("Piknik yapabilirsin");
                }
                else{
                    System.out.println("Yüzebilirsin");

                }
            }
        }
