class swap_data{
  public static void main(String[] args){

    int a = 3;
    int b = 4;

    System.out.println("Isi variable a sebelum di swap = " +a);
    System.out.println("Isi variable b seblum di swap = " +b);

    int temp;

    temp = a;
    System.out.println("Isi variable temp = " + temp);

    a = b;
    System.out.println("Isi variable A = " + a);

    b = temp;
    System.out.println("Isi variable B = " + b);
    
  }
  
}

