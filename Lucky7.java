
import java.util.Random;
import java.util.Scanner;
public class Lucky7{
    public static void main(String[] args) {
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    String input;
    String inputraha;
    //3 numeroa väliltä 1-10
    // Jos 7 kerro voiti, jos ei kerro hävisit
    //sen jlk peli loppuu
    int raha;
    
    System.out.println("Hei! Pelataan peliä!" + "\n " + "Arvon sinulle 3 numeroa. Jos yksi tai useampi numeroista on numero 7 - voitat pelin!");
    System.out.println("Yksi peli maksaa 1€. Paljonko haluat syöttää rahaa peliin?");
    inputraha = in.nextLine();
    raha = Integer.parseInt(inputraha);
    System.out.println("Kiitos! Syötit " + raha + " €." + "\n" + "Aloitetaan peli, ensimmäinen on ilmainen!");
    int randomNumber10 = random.nextInt(10);
    int randomNumber20 = random.nextInt(10);
    int randomNumber30 = random.nextInt(10);
     System.out.println("Sait numerot: " + "\n" + randomNumber10 + " - " + randomNumber20 + " - " + randomNumber30 + " .");
        
        if(randomNumber10 == 7 && randomNumber20 == 7 && randomNumber30 == 7){
        System.out.println("Onnea, voitit pelin!" + "\n" + "Voitit 7€ lisää!");
        raha+=7;
        } 
         else if(randomNumber10 == 7 && randomNumber20  == 7 || randomNumber20 == 7 && randomNumber30 == 7 || randomNumber10 == 7 && randomNumber30 == 7){
        System.out.println("Onnea, voitit pelin!" + "\n" + "Voitit 5€ lisää!");
        raha+=5;}
    
         else if(randomNumber10 == 7 || randomNumber20 == 7 || randomNumber30 == 7){
            System.out.println("Onnea, voitit pelin!" + "\n" + "Voitit 3€ lisää!");
            raha+=3;
        }
        else {
            System.out.println("Pahoittelut, hävisit pelin.");
            }
    while(raha > 0){
    System.out.println("Haluatko pelata uudelleen?");
    System.out.println("Pelaaminen maksaa 1€. Sinulla on tällä hetkellä " + raha + "€ rahaa.");
    System.out.println("Jos haluat pelata, paina enter. Jos et halua pelata, kirjoittamalla e ja painamalla enter pelisi päättyy ");
    input = in.nextLine();
        if(input.equals("")){
        raha--;
        int randomNumber1 = random.nextInt(10);
        int randomNumber2 = random.nextInt(10);
        int randomNumber3 = random.nextInt(10);
         System.out.println("Sait numerot: " + "\n" + randomNumber1 + " - " + randomNumber2 + " - " + randomNumber3 + " .");
         if(randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7){
            System.out.println("Onnea, voitit pelin!" + "\n" + "Voitit 7€ lisää!");
            raha+=7;
            } 
             else if(randomNumber1 == 7 && randomNumber2  == 7 || randomNumber2 == 7 && randomNumber3 == 7 || randomNumber1 == 7 && randomNumber3 == 7){
            System.out.println("Onnea, voitit pelin!" + "\n" + "Voitit 5€ lisää!");
            raha+=5;}
        
             else if(randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7){
                System.out.println("Onnea, voitit pelin!" + "\n" + "Voitit 3€ lisää!");
                raha+=3;
            }
            else {
                System.out.println("Pahoittelut, hävisit pelin.");
                }
             System.out.println("Kiitos kun pelasit!" + "\n" + " ");
        
            
            }else {
            System.out.println("Valitsit lopettaa pelaamisen.");
            break;
            }
    }
    if(raha <= 0){
        System.out.println("Ikävä kyllä rahasi loppuivat.");
    }
    System.out.println("Peli päättyi." + "\n" + "Kiitos!");
    }
}
