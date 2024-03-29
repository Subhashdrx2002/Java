public class Conditional1{
    
    public static void main(String[]args){
        // if-else statement
     /*    int age = 18;

        if(age>=18)
        {
            System.out.println("legal adualt");     

        }
        else
        {
            System.out.println("you are kid");
        } */

    //     int age = 17;
    //     if(age>=18 && age<60) 
    //  {
    //       System.out.println("you are an adualt");
    //    }
    //    else if(age>=60)
    //    {
    //     System.out.println("you are old man");

    //    }
    //    else 
    //    {
    //       System.out.println("you are kid");
    //    }
              
             int age = 10;
             if(age>=18 && age<60)
             {
                if(age>20 && age<30)
                {
                    System.out.println("you are in 20's");
                }
                else if (age>=30 && age<40)
                {
                    System.out.println("you are in 30's");

                }
                else
                {
                    System.out.println("you are in 10's");
                }
             }

             else if(age>60)
             {
                 System.out.println("you are old man");
             }
             else if(age>=16 && age<17)
             {
                  System.out.println("you are younge age");
             }
             else
             {
                  System.out.println("you are still child");
             }




    }
} 