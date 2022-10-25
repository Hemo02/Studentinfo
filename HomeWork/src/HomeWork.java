import java.util.Scanner;

public class HomeWork{

    public static void main(String[] args) {
        /*-------------- Varebal --------------*/
       String FirstName;String LastName; int id; String Section;
       String Subject1;String Subject2;String Subject3;
       int Degree1;int Degree2;int Degree3;
       int Smester;
       /*---------------- End ------------------*/
       /*----------------- InPut ----------------*/
       Scanner input = new Scanner(System.in);
       System.out.print("Enter First Name : ");
       FirstName=input.next();
       System.out.print("Enter Last Name : ");
       LastName=input.next();
       System.out.print("Enter Your Id : ");
       id = input.nextInt();
       System.out.print("Enter Your Section : ");
       Section =input.next();
       System.out.print("Enter Your Smester : ");
       Smester = input.nextInt();
       System.out.print("Enter First Subject : ");
       Subject1 = input.next();
       System.out.print("Enter Degree : ");
       Degree1 =input.nextInt();
       System.out.print("Enter Sacend Subject : ");
       Subject2 = input.next();
       System.out.print("Enter Degree : ");
       Degree2 =input.nextInt();
       System.out.print("Enter Therd Subject : ");
       Subject3 = input.next();
       System.out.print("Enter Degree : ");
       Degree3 =input.nextInt();
       /*--------------------- End ------------------------*/
       /*------------------- OutPut ---------------------*/
       System.out.printf("Fall Name :%s %s",FirstName,LastName);
       System.out.printf("\nId : %d",id);
       System.out.printf("\nSection : %s",Section);
       if(Smester >4)
       {
         System.out.print("\nSKIP THE BIASC CLASSES");
       }else
       {
           System.out.print("\nNOT PASS THE BIASC CLASSES");
       }
       if(Degree1 <50)
       {
       System.out.printf("\nSubject %s= Fail",Subject1);
       }else
       {
       System.out.printf("\nSubject %s= Pass",Subject1);
       }
       
       if(Degree2 <50)
       {
       System.out.printf("\nSubject %s= Fail",Subject2);
       }else
       {
       System.out.printf("\nSubject %s= Pass",Subject2);
       }
       
       if(Degree3 <50)
       {
       System.out.printf("\nSubject %s= Fail\n",Subject3);
       }else
       {
       System.out.printf("\nSubject %s= Pass\n",Subject3);
       }
       /*---------------------- End --------------------*/
       
       }
    
}
