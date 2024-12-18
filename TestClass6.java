/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass6;

/**
 *
 * @author ucs
 */
public class TestClass6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             onlineReservation m = new flight();
              System.out.println(m.Greeting());
              m.Menu();
              reserveSeat m2 = new flight();
              m2.book_Ticket();
              m2.find_Ticket_Details();
    }
    
}
