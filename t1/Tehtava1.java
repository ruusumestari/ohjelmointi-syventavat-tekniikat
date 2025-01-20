import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args){
        int arvottuLuku = (int)(Math.random() * 100) + 1;
        Scanner luku = new Scanner(System.in);

        Boolean OikeaArvaus = false;
        int alkutila = 0;
        int MaxArvaus = 7;

        System.out.println("Tervetuloa! ");
        System.out.println("Arvaa luku väliltä 1-100.");
        System.out.println("Arvauksia on yhteensä 7 kpl.");

        while(!OikeaArvaus && alkutila < MaxArvaus){
        System.out.print("Syötäluku: ");
        int lukuKayttaja = luku.nextInt();

        if(lukuKayttaja > 100){
            System.out.println("Syötä luku väliltä 1-100.");
        }
        else{
            alkutila++;
        if(lukuKayttaja == arvottuLuku){
            System.out.println("Oikein arvattu!");
            OikeaArvaus = true;
        }
        else if(lukuKayttaja <= arvottuLuku){
            System.out.println("Luku on suurempi kun: " + lukuKayttaja);
        }
        else{
            System.out.println("Luku on pienempi kun: " + lukuKayttaja);
        }
    }
    }
     if(!OikeaArvaus){
        System.err.println("Hävisit pelin!");
        System.out.println("Arvottu luku: " + arvottuLuku);
    }
    luku.close();
    System.out.println("Peli loppui.");
    }

}