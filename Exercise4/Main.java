class Main{
  public static void main(String args[]){

    int dayNum=7;
    System.out.println("Value of the day : "+dayNum);

   switch(dayNum){

      case 1: System.out.println("Day of the week : Monday"); 
        break;
      case 2: System.out.println("Day of the week : Tuesday");
        break;
      case 3: System.out.println("Day of the week : Wednesday");
        break;
      case 4: System.out.println("Day of the week : Thursday");
        break;
      case 5: System.out.println("Day of the week : Friday");
        break;
      case 6: System.out.println("Day of the week : Saturday");
        break;
      case 7: System.out.println("Day of the week :Sunday");
        break;

      default: System.out.println("Invalid day");
    }

    System.out.println("Good Bye!");
  } 
}

