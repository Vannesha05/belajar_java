import java.util.Scanner;

class tugasno2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int p;
    int l;
    int L;
    
    System.out.println("Masukkan nilai panjang :");
    p = scan.nextInt();
    System.out.println("Masukkan nilai lebar :");
    l = scan.nextInt();

    L = p * l;
    
    System.out.println("Luas persegi panjang = " + L);
    
  }
}