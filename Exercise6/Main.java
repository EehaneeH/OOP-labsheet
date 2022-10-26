// getting 2 star patterns in the previous exercise next to each other

class Main {
  public static void main(String args[]){

    for(int i=1; i<=5 ; i++){
      
      //square star pattern
      for(int j=1 ; j<=5; j++){
        System.out.print(" * ");
      }
      
       System.out.print("\t\t");// to keep certain distance between 2 star apatters
      
      //Triangular star pattern
      for(int b=5 ; b>=i ; b--){ // decrementing the spaces
        System.out.print(" ");
      }
      for(int b=1 ; b<=i ; b++){
        System.out.print("* ");
      }
      System.out.println("\n");// seperate each lines
    }
    
  }
}

