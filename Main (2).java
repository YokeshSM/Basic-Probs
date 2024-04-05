import java.util.*;
import java.text.ParseException;
import java.time.LocalDate;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        LocalDate c=LocalDate.of(2017,2,13);
        LocalDate c1=c.plusDays(1);
        LocalDate c2=c.minusDays(1);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        int cj=c.getMonthValue();
        System.out.println(cj);
        
    }
}
