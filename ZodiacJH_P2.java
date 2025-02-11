//Janiyah Hubbard
//04/17/24
//This is a horoscope program using conditional statements part 1


import java.util.Scanner;

public class ZodiacJH_P2
{
   public static void main(String[] args)
   {
         Scanner keyboard = new Scanner(System.in);

//1 Ask user to enter their name, birthday month, birthday.
         
         System.out.println("Enter your name, birthday month, and birthday.");
         
         String fullName = keyboard.nextLine();
         
         int birthMonth = keyboard.nextInt();
         
         int birthDay = keyboard.nextInt();
         
         System.out.println(fullName + "'s birthday is " + birthMonth + " " + birthDay + ". ");
         
         String monthString = keyboard.nextLine();

//2 Create condtional statements to determine thier horoscope.
//use a switch statement to convert the month from a number to the correct word for the month.
        
       switch(birthMonth)                 
       {
         case 1:
         monthString = Integer.toString(1);
         monthString = "January";
         break;
         case 2:
         monthString = Integer.toString(2);
         monthString = "Febuary";
         break;
         case 3:
         monthString = Integer.toString(3);
         monthString = "March";
         break;
         case 4:
         monthString = Integer.toString(4);
         monthString = "April";
         break;
         case 5:
         monthString = Integer.toString(5); 
         monthString = "May";
         break;
         case 6:
         monthString = Integer.toString(6);
         monthString = "June";               
         break;
         case 7:
         monthString = Integer.toString(7);
         monthString = "July";
         break;
         case 8:
         monthString = Integer.toString(8);
         monthString = "August";
         break;
         case 9:
         monthString = Integer.toString(9);
         monthString = "September";
         break;
         case 10:
         monthString = Integer.toString(10);
         monthString = "October";
         break;
         case 11:
         monthString = Integer.toString(11);
         monthString = "November";
         break;
         case 12:
         monthString = Integer.toString(12);
         monthString = "December";
         break;
      }

//The conditional statement (if..else..if) will be used to test for the range if each sign.
//Then you will print the following: Birthday, zodiac, symbol, horoscope.
 //3 Add the Earth symbols for each.
     
     String sign, horoscope, element, zodiac;
     
    if (birthMonth == 1 && birthDay >= 20 || birthMonth == 2 && birthDay <= 18)
      {
   System.out.println("You are a Aquarius!");
   
     zodiac = "Aquarius";
         
     sign = "The Water Bearer";
         
   System.out.println("Your symbol is the water bearer.");
   
     horoscope = "You need to move past your trauma and heal in order to have fortune.";
    
     element = "air.";
   
      }      
      
         
    else if(birthMonth == 2 && birthDay >= 19 || birthMonth == 3 && birthDay <= 20)
         {
          System.out.println("You are a Picses!");
           
            zodiac = "Picses";
           
            sign = "The Fish";
            
            horoscope = "You lot are not good people. Become better people to prosper.";
            
            element = "water";
           
           System.out.println("Your symbol is a fish.");
       }
           
    else if(birthMonth == 3 && birthDay >= 21 || birthMonth == 4 && birthDay <= 19)       
        {
         System.out.println("You are a Aries!");
         
          zodiac = "Aries";
      
          sign = "The head of a Ram";
          
          horoscope = "You will seek out what was missing inside you.";
          
          element = "fire";
           
         System.out.println("Your symbol is the head of a ram.");  
         }
      
    else if(birthMonth == 4 && birthDay >= 20 || birthMonth == 5 && birthDay <= 20)
         {         
           System.out.println("You are a Taurus!");
           
           zodiac = "Taurus";
           
           sign = "The Bull";
           
           horoscope = "Your a gem to be around, generally no bad qualities, but your stuborness will cost you greatly.";
           
           element = "earth";
           
           System.out.println("Your sign is the bull.");   
       }
        
    else if(birthMonth == 5 && birthDay >= 21 || birthMonth == 6 && birthDay <= 20)
      {
         System.out.println("You are a Gemini!");
         
            zodiac = "Gemini";
           
            sign = "The Twins";
            
            horoscope = "You should seek out the things that make you happy.";
            
            element = "air";
           
           System.out.println("Your symbol is the twins.");
      }
          
    else if(birthMonth == 6 && birthDay >= 21 || birthMonth == 7 && birthDay <= 22)
      {
          System.out.println("You are a Cancer!");
          
            zodiac = " Cancer";
           
            sign = "The Crab";
            
            horoscope = "You are loved and adored. You're the universe's favorite individual.";
            
            element = "water";
           
           System.out.println("Your symbol is the crab");
        
      }
           
    else if(birthMonth == 7 && birthDay >= 23 || birthMonth == 8 && birthDay <= 22)
      {
         System.out.println("You are a Leo!");
         
            zodiac = "Leo";
           
            sign = "The Lion";
            
            horoscope = "You are incredibly arrogrant and too prideful; it will be your downfall.";
            
            element = "fire";
           
           System.out.println("Your symbol is the lion.");
     }     
           
     else if(birthMonth == 8 && birthDay >= 23 || birthDay == 9 && birthDay <= 22)
      {        
         System.out.println("You are a Virgo!");
           
           zodiac = "Virgo";
           
           sign = "The Maiden";
           
           horoscope = "You can be very judgemental and critical; learn the skill of tact and patience.";
           
           element = "earth";
           
           System.out.println("Your symbol is the maiden.");
       } 
           
     else if(birthMonth == 9 && birthDay >= 23 || birthMonth == 10 && birthDay <= 22)
      {
        System.out.println("You are a Libra!");
        
           zodiac = "Libra";
           
           sign = "The Scales";
           
           horoscope = "You are a hilarious person with great heart; but you can be irritating and loathesome.";
           
           element = "air";
           
           System.out.println("Your symbol is the scales."); 
      }     
           
     else if(birthMonth == 10 && birthDay >= 23 || birthMonth == 11 && birthDay <= 21)
      {
       
         System.out.println("You are a Scorpio!");
         
         zodiac = "Scorpio";
           
           sign = "The Scorpion";
           
           horoscope = "A deeply troubled sign that can be guided with patience and love.";
           
           element = "water";
           
           System.out.println("Your symbol is the scorpion.");
         
       }
       
     else if(birthMonth == 11 && birthDay >= 22 || birthMonth == 12 && birthDay <= 21)
      {         
            System.out.println("You are a Sagittarius!");
            
            zodiac = "Sagittarius";
           
           sign = "The Archer";
           
           horoscope = "A very interesting people wwith much room for maturity and growth.";
           
           element = "fire";
           
           System.out.println("Your symbol is the archer.");
      } 
        else
          {         
            System.out.println("You are a Capricorn!");
            
            zodiac = "Capricorn";
           
            sign = "The Goat";
           
            horoscope = "Interesting people. Favored by few; loathed by many.";
           
            element = "earth";
           
           System.out.println("Your symbol is the goat.");
          }

//print : Name , sign, symbol, earth symbol, and horoscope.(make a sentence.)

       System.out.println(fullName + "'s birthday is " + monthString + " " + birthDay);
        
       System.out.println("Your sign is " + zodiac + ", your symbol is " + sign + " and your horoscope is : " + horoscope);  
         
       System.out.println(fullName + " was born " +  monthString + " " + birthDay + " which is why their sign is " + zodiac + ".");
         
         

   }         
}