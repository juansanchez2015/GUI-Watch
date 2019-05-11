import java.util.*;
public class Watch extends TimeType{   //Start Watch class
  
  private int month, day, year;   //Private variables to be utilized
  private int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  //Array of days to reference
  
  public Watch(){                      //Watch Constuctor
    super();                           //Values passed in from the super class
    month = 1;                         //Initialize month to 1
    day = 1;                           //Initialize day to 1
    year = 1980;                       //Initialize year to 1980
}
  
  private boolean leapyear(int yr){    //Leapyear method to check if given year is a leap year
       if(yr%4 == 0 && yr%100 != 0){   //If year is divisible by 4 but not by 100
         days[1] = 29;                 //Set February's days to 29
         return true;                  //Retrn true.
    }
    return false;                      //Otherwise, return false.
  }
  
  public boolean setWatch(int hrs, int mins, int secs, int mon, int dy, int yr){  //setWatch returns true if all parameters are valid
    leapyear(yr);                                //Call leapyear on yr to check for leap year
        
    if(dy <= days[mon-1]){
    month = mon;              //Set month to value of mon
    day = dy;                 //Set day to value of dy
    year = yr;                //Set year to value of yr
    
    if(Set(hrs, mins, secs) == true){  //If time conditions are met
    return true; 
    }//Return true
    }
    return false;                      //Otherwise return false
  }
  
  public void increaseDay(){      //Increase day by one
        leapyear(year);           //Call leapyear on year to check for leap year
    day++;                        //Increment day
    if(day > days[month-1]){      //If day reaches higher than the month's day
      day = 1;                    //Set day to zero
      month++;                    //Increment month
    }
    if(month > 12){               //If month reaches greater than 12
        year++;                   //Increment year
        month = 1;                //Set month to 1
    }
}
 
  public void decreaseDay(){      //Decrease day by one
        leapyear(year);           //Call leapyear on year to check for leap year
    day--;                        //Decrement day
    if(day == 0){                 //If day reaches lower than the month's day
            month--;                    //Decrement month


      if(month == 0){             //If month reaches zero
          month = 12;             //Set month to 12 
          year--;                 //Decrement year
      }
            day = days[month-1];        //Set day to the previous month's value

    }  

  }
  
  public void increaseSecond(){     //Increase second by one
    
    this.Increase();                //Call increase method from super class
    if(this.toString().equals("00:00:00 AM")) //If hours, minutes, and seconds are all zero
      increaseDay();                //Call increaseDay method
   
  }
       
  public void decreaseSecond(){          //Decrease second by one
    this.Decrease();                //Call decrease method from super class
        if(this.toString().equals("23:59:59 PM")) //If hours, minutes, and seconds reahc their max value
          decreaseDay();            //Call decreaseDay method
  }
  
  public String showWatch(){                                        //Print String
   return month + "/" + day + "/" + year + " " +this.toString();  //Return string to be printed
    
  }


}   //End Watch class
