package com.practise.test;

public class ATM {
    
  //Initial values

    private int balance10s = 360;

    private int balance5s = 273;

    private int balance1s = 56;
    
    private static final String erromsg= "Incorrect or insufficient funds";

    //Withdraw implementation
    public void withdraw(int amount) {
        System.out.println("\nInput:"+ amount);
        if(amount < 0 || 
                amount > ((balance10s*10)+(balance5s*5)+(balance1s*1))) {
            System.out.println(erromsg); 
            return;
        }
        
        //Dispense 10s (Case 1)
       int dispense = amount/10;
       if(dispense>0 && dispense<=balance10s) {
           amount = amount%10;
           balance10s = balance10s - dispense;
           System.out.println("10s =>"+dispense);   
       }else if(dispense>0 && dispense>balance10s && (amount%balance10s)<=((balance5s*5)+(balance1s*1))){
           //Corner case: Example 3656 to 4965  (Case 4)
           amount = amount - (balance10s*10);
           System.out.println("10`s =>"+balance10s);
           //System.out.println("amount =>"+amount);
           balance10s = 0; //10s done
       }
       
       //Dispense 5s (Case 2)
       dispense = amount/5;
       if(dispense>0 && dispense<=balance5s) {
           amount = amount%5;
           balance5s = balance5s - dispense;
           System.out.println("5s =>"+dispense);   
       }else if(dispense>0 && dispense>balance5s && (amount%balance5s)<=(balance1s*1)){
         //Corner case: Example 3657 to 4967  (Case 5)
           amount = amount - (balance5s*5);
           System.out.println("5`s =>"+balance5s);
           balance5s = 0; //5s done
       }
       
       //Dispense 1s (Case 3)
       if(amount>0 && amount<=balance1s) {
           balance1s = balance1s - amount;
           System.out.println("1s =>"+amount);   
           amount = 0; //1s done
       }
        
       //Still amount is owe (which means did not processed above in any case)
       if(amount >0) {
           System.out.println("Unprocessable:"); 
           System.out.println(erromsg);  
       }
       
    }
    
    public static void main(String[] args) {
        new ATM().withdraw(10879);  //Problem Input Case
        new ATM().withdraw(-1);     //Problem Input Case
        new ATM().withdraw(87);     //Problem Input Case
        new ATM().withdraw(3656);   //Corner Case Test
        new ATM().withdraw(4965);   //Corner Case Test
        new ATM().withdraw(5021);   //Corner Case Test (Empty ATM Case) 
        
        
    }

}
