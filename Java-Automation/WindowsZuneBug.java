import java.util.Scanner; 
/* There are 366 days in a yea*/ 
int year = 1980; 
public class ZuneBug{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
    System.out.println("Enter year"); 
    int year = input.nextInt(); 
    while(days > 365){
      if(isLeapYear(year)){
        if(days > 366){
          days -= 366;
          year++; 
      }else{
        days -= 365; 
         year += 1; 
        }
    }
  }
  public static boolean isLeapYear(int year){
   
  }
}
