class Main {
  public static void main(String[] args) {
   int defaultedDays=20;
int amountPerDay=5000;
int amountToPay;
   int daysPaidFor;
int amountLeftToPay; 
int daysNotPaid;
int amountPaid=5000;
int amountNotPaidInDay;
   
   amountToPay=defaultedDays*amountPerDay;
   System.out.println("the amount to pay is "+amountToPay);
   
   daysPaidFor=amountPaid/amountPerDay;
   System.out.println("the days paid for are "+daysPaidFor);
   
   amountNotPaidInDay=amountPaid%amountPerDay;
   System.out.println("the amount that doesnt cover a day is "+amountNotPaidInDay);
   
   amountLeftToPay=((defaultedDays-daysPaidFor)*amountPerDay)+(amountPerDay-amountNotPaidInDay);
   System.out.println("the amount left to pay is "+amountLeftToPay);
   
   daysNotPaid=defaultedDays-daysPaidFor;
   System.out.println("the days not paid for are "+daysNotPaid);

   
    
  }
}
