
package testclass6;

import java.util.ArrayList;
import java.util.List;

public class flight extends reserveSeat{
    String flight_ID,to_location,departime_time;
    int s_no; 
    float Fare;
    static String from_location= "Karachi";
    public String date;
    List<flight> list;

    public flight() { }
    
    
    public flight(int s_no,String flight_ID, String to_location, String departime_time, float Fare) {
        this.s_no = s_no;
        this.flight_ID = flight_ID;
        this.to_location = to_location;
        this.departime_time = departime_time;
        this.Fare = Fare;


    }
    
    @Override
     void flight_List(){
           
         list =new ArrayList<flight>();
        flight f1= new flight(1,"PK 181", "Islamabad", "12:15",250f);
        flight f2= new flight(2,"PK 277","Gujranwala", "13:30",200f);
        flight f3= new flight(3,"PK 233", "Lahore", "14:20",280f);
        flight f4= new flight(4,"EK 615", "Faisalabad", "15:45",210f);
        flight f5= new flight(5,"PA 210", "Rawalpindi", "17:20",300f);
        flight f6= new flight(6,"PK 289", "Sialkot", "19:30",200f);
        
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6); 
     
        System.out.println("S.no \t\tFlight NO \tFrom Locationn \t\t TO \t\t Time \t\t   Fare");
        for(flight f:list){           
        System.out.println(f.s_no+"\t\t"+f.flight_ID+" \t\t " + flight.from_location + " \t\t "+f.to_location+" \t " +f.departime_time+" \t\t "+f.Fare);     
        }
    
    }
//throw new UnsupportedOperationException("Not supported yet.");
    
}