/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass6;

import java.util.Scanner;

/**
 *
 * @author ucs
 */
public abstract class onlineReservation{
     Scanner sc = new Scanner(System.in);
    int choice;
    long millis=System.currentTimeMillis();  
    java.sql.Date date=new java.sql.Date(millis);  
    
    String Greeting(){
        return ">>>>>>>>>>>>>>>>>Welcome to Pakistan International Airline<<<<<<<<<<<<<<<<<<<<";
    }
    
    void Menu(){
        for (int i = 0; i < 10; i++) {
            System.out.println("\n__________________________________");
            System.out.println("----------------Menu--------------");
            System.out.println("1. Reserve Seats");
            System.out.println("2. My Tickets");
            System.out.println("3. Flight Schedule");
            System.out.println("4. Display Passengers");
            System.out.println("5. Exit");
            
            System.out.println("__________________________________");
             try{
                    System.out.print("Your choice: ");
                    choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            flight m2 = new flight();
                            m2.flight_List();
                            book_Ticket();  
                            break;
                        case 2:
                            find_Ticket_Details();
                            break;
                        case 3:
                            System.out.println(date);
                            System.out.println("----------------------------------------TODAY'S FLIGHTS SCHEDULE---------------------------------------------\n");
                            flight obj = new flight();
                            obj.flight_List();
                            break;
                        case 4:
                            display_pessenger();
                            break;
                        case 5: 
                            System.out.println("You decided to Exit..");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("No such option exist");
                            break;
                    }
                }
                catch(Exception ex){
                    System.out.println("Invalid input");
                    break;
                }
        }
      
    }
    
    
    abstract void book_Ticket();
    abstract void find_Ticket_Details();
    abstract void display_pessenger();

    
}
