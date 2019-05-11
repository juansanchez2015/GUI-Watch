public class TimeType{             // Begin TimeType class
  private Integer hours;           //Instance variable hours to be initialized
  private Integer minutes;           //Instance variable minutes to be initialized
  private Integer seconds;           //Instance variable seconds to be initialized
  
  public TimeType(){             //TimeType no argument constructor
  hours = 0;                   //Initialize hours to zero
  minutes = 0;                  //Initialize minutes to zero
  seconds = 0;                  //Initialize seconds to zero
}           //End TimeType constructor
  
  public TimeType(int h, int m, int s){        //TimeType constructor with arguments to be passed in 
    if(h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59){   //Condition if each variable is within time range
      hours = h;                 //Initialize hours to h parameter
      minutes = m;                  //Initialize minutes to m parameter
      seconds = s;                  //Initialize seconds to s parameter
      //         Set(h, m, s);
    }               //End if clause 
     else{                        //Else, set all variables to zero
      hours = 0;       //Set hours to zero
      minutes = 0;     //Set minutes to zero
      seconds = 0;     //Set hours to zero
    }       //End else clause
}           //End TimeType constructor
  
  public TimeType(TimeType object){    //TimeType constructor with object argument to be passed in  
    
   Set(object.hours, object.minutes, object.seconds);   //Set passed in values from old object to new object
 }           //End TimeType constructor

  public String toString(){         //ToString method to return String
    String time = "";           //Initialize time variable to hold string to be returned
    String ho = "";             //Initialize ho variable to hold hour to be returned
    String min = "";            //Initialize min variable to hold minute to be returned
    String sec = "";            //Initialize sec variable to hold second to be returned
   
    if(hours < 10)            //If hours only holds one digit
    ho = "0" + this.hours;    //Add a zero before the digit
    else
      ho = "" + hours;        //Else, store the number into ho unchanged
    
    if(minutes < 10)              //If minutes only holds one digit   
    min = ":0" + this.minutes;    //Add a zero before the digit
    else
      min = ":" + minutes;        //Else, store the number into min unchanged
    
    if(seconds < 10)              //If seconds only holds one digit
    sec = ":0" + this.seconds;    //Add a zero before the digit
    else
      sec = ":" + seconds;        //Else, store the number into sec unchanged
  
    time = ho + min + sec;        //Store each new variable within String time
    if(hours >= 12)
      time = time + " PM";
    else
      time = time + " AM";
    
    
    return time;                  //Return String time
  }                    //End toString method
  
  public boolean Set(int h, int m, int s){            //Set method to return true/false
    if(h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59){  //Condition if each variable is within time range
      hours = h;                    //Initialize hours to h parameter
      minutes = m;                  //Initialize minutes to m parameter
      seconds = s;                  //Initialize seconds to s parameter
    }
    else{               //Else - print Invalid time
     return false;     //Return false 
    }
    return true;      //Return true
  }                //End Set method              
  
  public void Increase(){     //Increase method, no return
    seconds++;                //Increment seconds
    if(seconds == 60){        //If seconds reaches 60
      seconds = 0;            //Set seconds to zero
      minutes++;              //Increment minutes
    }       
    if(minutes == 60){        //If minutes reaches 60
        minutes = 0;          //Set minutes to zero
        hours++;              //Increment hours
    }
    if(hours == 24)          //If hours reaches 24
          hours = 0;         //Set hours to zero
      }                     //End Increase method
  
  public void Decrease(){   //Decrease method, no return
    seconds--;              //Decrease seconds by 1
    if(seconds == -1){      //If seconds reaches -1
      seconds = 59;         //Set seconds to 59
      minutes--;            //Decrement minutes
    }
    if(minutes == -1){     //If minutes reaches -1
        minutes = 59;      //Set minutes to 59
        hours--;           //Decrememt hours by 1
    }
    if(hours == -1)       //If hours is -1
          hours = 23;     //Set hours to 23
      }                  //End Decrease method
}//End TimeType class