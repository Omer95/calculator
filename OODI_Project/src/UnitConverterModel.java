public class UnitConverterModel {
    
   private String ans;
   private double cal;
    // km to m
     public String KMtoM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*1000);
        return ans;   
    }
    // m to cm 
     public String MtoCM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*100);
        return ans;   
    }
    // cm to mm
     public String CMtoMM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*10);
        return ans;   
    }
    //  mm to micrometer
     public String MMtoMicroMeter(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*1000);
        return ans;   
    } 
    // micrometer to mm
     public String MicrotoMM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/1000);
        return ans;   
    }
    // mm to cm
     public String MMtoCM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/10);
        return ans;   
    }
    // cm to m
     public String CMtoM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/100);
        return ans;   
    }
    // m to km 
     public String MtoKM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/1000);
        return ans;   
    }
    // km to cm 
     public String KMtoCM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*100000);
         System.out.println(ans);
        return ans;   
    }
    // km to mm
     public String KMtoMM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*1000000);
        return ans;   
    }
    // km to micrometer
     public String KMtoMicrometer(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*1000000000);
        return ans;   
    }
    // cm to km
    public String CMtoKM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/100000);
         System.out.println(ans);
        return ans;   
    }
    // mm to km
    public String MMtoKM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/1000000);
        return ans;   
    }
    // micrometer to km 
    public String MicrometertoKM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/1000000000);
        return ans;   
    }
    // meter to mm 
    public String MtoMM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*1000);
        return ans;   
    }
    //meter to micrometer
    public String MtoMicrometer(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*1000000);
        return ans;   
    }
    // mm to meter
   public String MMtoM(String x){
      cal = Double.parseDouble(x);
      ans = Double.toString(cal/1000);
        return ans;   
    }
   // micrometer to m
   public String MicrometertoM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/1000000);
        return ans;   
    }
   // cm to micrometer
   public String CMtoMicrometer(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal*10000);
        return ans;   
    }
   // micro to cm
   public String MicrometertoCM(String x){
       cal = Double.parseDouble(x);
       ans = Double.toString(cal/10000);
        return ans;   
    }
   
    
   
   // Time conversions
   
   
  public String HourToMin(String s){
		cal = Double.parseDouble(s); 
		ans = Double.toString(cal * 60); 
		return ans;
	}
	public String HourToSec(String s){
		cal = Double.parseDouble(s);
		ans = Double.toString(cal * 3600);
		return ans;
	}
	public String MinTohour(String s){
		cal = Double.parseDouble(s);
		ans = Double.toString(cal / 60);
		return ans;
	}
	public String MinToSec(String s){
		cal = Double.parseDouble(s);
		ans = Double.toString(cal * 60);
		return ans;
	}
	public String SecToHour(String s){
		cal = Double.parseDouble(s);
		ans = Double.toString(cal / 3600);
		return ans;
	}
	public String SecToMin(String s){
		cal = Double.parseDouble(s);
		ans = Double.toString(cal / 60);
		return ans;
	}
	
	 
     // Mass Conversions 
        
        // kg  to gram  
    public String KgtoGram(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal*1000);
    return ans;

    }
    // kg to mg
    public String KgtoMiliGram(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal*1000000);
    return ans;
    }
    // kg to microgram
    public String KgtoMicroGram(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal*1000000000);
    return ans;
    }
    // gram to kg
    public String GramtoKg(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal/1000);
    return ans;

    }
    // mg to kg
    public String MiliGramtoKg(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal/1000000);
    return ans;

    }
    // microgram to kg
    public String MicrogramtoKg(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal/1000000000);
    return ans;
    }
    // gram to microgram
    public String GramtoMicroGram(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal*1000000);
    return ans;
    }
    // gram to mg 
    public String GramtoMiliGram(String x){
      cal = Double.parseDouble(x);
      ans = Double.toString(cal*1000);
      return ans;

    }
    // Mg to gram
    public String MiliGramtoGram(String x){
      cal = Double.parseDouble(x);
      ans = Double.toString(cal/1000);
      return ans;

    }
    public String MicroGramtoGram(String x){
     cal = Double.parseDouble(x);
     ans = Double.toString(cal/1000000);
     return ans;

    }
    public String MiliGramtoMicroGram(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal*1000);
    return ans;
    }
    public String MicrotoMiliGram(String x){
    cal = Double.parseDouble(x);
    ans = Double.toString(cal/1000);
    return ans;
    }
    
    
    
    // Temprature Conversions
    
    public String FarToCel(String s){
		cal = Double.parseDouble(s);
		cal = (5/9) * (cal - 32);
		ans = Double.toString(cal);
		return ans;
	}
	public String CelToFer(String s){
		cal = Double.parseDouble(s);
		cal = (9/5) * cal + 32;
		ans = Double.toString(cal);
		return ans;
	}
}