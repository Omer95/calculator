
package com.javatraineronline;

import java.util.Scanner;


public class Finilization{
    public String FinalResult(String FromCurrency,String ToCurrency,String Amount){
               Convertor obj = new Convertor();
               double value;
               String a;
               String r;
               
       
				
 
		String fromCurrencyCode = FromCurrency;
		double amount = Double.parseDouble(Amount);
                
		String toCurrencyCode = ToCurrency ;
		
		

		// Currency Conversion
		double coversionRate = obj.convert(fromCurrencyCode, toCurrencyCode);
		            if(coversionRate==0.0){
                               a = ("Currency Rates Not Available");
                               return a;
                                    
                         }
                            else{
	                    value = (coversionRate * amount);
                             r= Double.toString(value);
		               return r;
                            }
                            
	}
    
    public static void main(String[] args) {
    	Finilization obj= new Finilization();
    	System.out.println(obj.FinalResult("USD","INR", "100"));
    }
}

