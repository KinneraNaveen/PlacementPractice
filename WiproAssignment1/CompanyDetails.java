package WiproAssignment1;
import java.util.*; 
public class CompanyDetails { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter Company Name: "); 
String company = sc.nextLine(); 
System.out.print("Enter Location: "); 
String location = sc.nextLine(); 
System.out.println(company + " Technologies " + location); 
sc.close(); 
} 
}
