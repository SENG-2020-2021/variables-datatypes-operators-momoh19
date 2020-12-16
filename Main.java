class Main{
    public static void main(String[] args) {
     // kindly use appropriate data types for your declaration
     //declare an array variable and assign the days of the month debtor defaulted,

     byte []daysDefaulted={10,12,14,16,18};
     
     // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
    
     float amountPerDay=500f;
     float amountPaid=2650f;

    // declare all the variables needed for your calculations

     float totalAmtToPay=0f;
     byte daysPaidFor;
     float incompleteAmount=0f;
     float amountLeftToPay=0f;
     byte daysNotPaidFor;
     float extraAmount=0f;
     byte numOfDaysDefaulted=5;
    

    // calculate and print total amount the debtor is to pay using for each loop
			for(byte x: daysDefaulted){
				totalAmtToPay=totalAmtToPay+amountPerDay;
			}
			  System.out.println("Total amount to pay is "+totalAmtToPay);
			  System.out.println();
		 
    // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
			
			daysPaidFor=(byte)(amountPaid/amountPerDay);
			  System.out.println("Days paid for is "+daysPaidFor+" days");
			  System.out.println();
		   
	        for(int i=0; i<numOfDaysDefaulted&&i<daysPaidFor; i++){
              System.out.println("Day "+daysDefaulted[i]+" has been paid for");    
	          System.out.println();
		    }
		  
	        if(amountPaid%amountPerDay>0)  
			  incompleteAmount=amountPerDay-(amountPaid%amountPerDay);
			  System.out.println("The Incomplete amount in day "+daysDefaulted[daysPaidFor +1]+ " left to pay is "+incompleteAmount);   
			  System.out.println(" ");

    // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the 	exact amount needed to be paid and print likewise
	
			if(totalAmtToPay>amountPaid) { 
              amountLeftToPay=totalAmtToPay-amountPaid;
              System.out.println("The amount left to pay is "+amountLeftToPay);
			  System.out.println();

			  daysNotPaidFor=(byte)(numOfDaysDefaulted-daysPaidFor);
			  System.out.println("Days not paid for are "+daysNotPaidFor+" day"); 
			  System.out.println();
			}	
			else if(totalAmtToPay<amountPaid){
		      extraAmount=amountPaid-totalAmtToPay;
			  System.out.println("Extra amount of "+extraAmount+" was paid");
			  System.out.println();
	        }
	   
	        else if(totalAmtToPay==amountPaid){
			  System.out.println("The exact amount was paid");
	        }
        

  }
  }