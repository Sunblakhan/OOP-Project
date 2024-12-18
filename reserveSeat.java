package testclass6;
import java.util.ArrayList;
import java.util.List;
public abstract class reserveSeat extends onlineReservation{
  
  private int [] ticket_no = new int[10];
  protected String [] name = new String[10];
  protected int [] contact = new int[15];
  protected String [] address = new String[10];
  private int [] passport = new int[15];
  int size;
  String flight_ID,to;
  int choice2;   

    @Override
    void book_Ticket() throws UnsupportedOperationException {
        System.out.print("Select a flight to reserve your seat:");
        choice2 = sc.nextInt();
        switch(choice2){
            case 1:
                flight_ID = "PK 181";
                to = "Islamabad";
                break;
            case 2:
                flight_ID = "PK 277";
                to = "Gujranwala";
                break;
            case 3:
                flight_ID = "PK 233";
                to = "Lahore";
                break;
            case 4:
                flight_ID = "EK 615";
                to = "Faislabad";
                break;
            case 5:
                flight_ID = "PA 210";
                to = "Rawalpindi";
                break;
            case 6:
                flight_ID = "PK 289";
                to = "Sialkot";
                break;    
            default:
                System.out.println("No such flight exist..");
                break;
        }
        
        System.out.print("\nHow many seats do you want to reserve: ");
        size = sc.nextInt();
        for (int i = 1; i <= size; i++)
        {
            System.out.println("Pessenger "+i+" Details: ");
            System.out.print("Enter your name: ");
            name [i] = sc.next();
            sc.next();
            System.out.print("Enter your passport no: ");
            passport [i] = sc.nextInt();
            System.out.print("Enter your contact no: ");
            contact [i]= sc.nextInt();
            System.out.print("Enter your address: ");
            address [i] = sc.next();
            sc.next();
            ticket_no [i] = 12300+i;
            System.out.print("Your Ticket num is: "+ticket_no[i]+"\n");
        }
      }

 
    @Override
    void find_Ticket_Details(){
        int t_no;
        
         System.out.println("\t\t\t\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ TICKET DETAILS  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
         System.out.print("\t\t\tEnter your ticket no: ");
         t_no = sc.nextInt();
         for (int i = 1; i <= size; i++)
         {
            if(t_no==ticket_no[i])
            {   
                System.out.println("\t\t\tFlight ID\tTicket No\tPassenger Name\tPassport No\tContact No\tAddress");
                System.out.println("\t\t\t"+flight_ID+"\t\t"+ticket_no[i]+"\t\t"+name[i]+"\t\t"+passport[i]+"\t\t"+contact[i]+"\t  "+address[i]);
            }
//            else 
//            {
//                System.out.println("\t\tInvalid Ticket NO");
//          
//            }
          }
       }
   
  @Override
     void display_pessenger(){
        System.out.println("\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>FLIGHT PESSENGERS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");    
        System.out.println("\t\t\tFlight ID\tFrom Location\tTo Location\tTicket No\tPassenger Name\tPassport No\tContact No\tAddress");
                
            for (int i = 1; i <= size; i++)
            {
              System.out.println("\t\t\t"+flight_ID+"\t\t"+flight.from_location+"\t\t"+to+"\t"+ticket_no[i]+"\t\t"+name[i]+"\t\t"+passport[i]+"\t\t"+contact[i]+"\t  "+address[i]);   
            }
        }   
    
abstract void flight_List();

}

