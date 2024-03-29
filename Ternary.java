public class Ternary {
    public static void main(String[]args){
        //(condition)?:statement;

        int a=30;
        int b=20;
        int c=40;
        int answer=(a<b)?a:b;
        System.out.println(answer);

       String Ans = (a<b)?"a is less":"b is less";
       System.out.println(Ans);

      int num= (a<b)? (a<c? a:b) :(b<c? b:c);
      System.out.println(num);

            if(a<b) {
                if(a<c){
                    System.out.println(a);
                }
                else{
                    System.out.println(c);
                }

            }
            else{
                    if(b<c){
                         System.out.println(b);
                    }
                else{
                     System.out.println(c);
                }
            }




    }

}