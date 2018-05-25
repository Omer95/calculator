/*
 * exp4k library is used in this example. It is freely available under the apache license
 */
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class ScientificModel implements Model{
    private double  d;
    private String f;
    private double N;
    private double R;
    private double Q;
    private String q;
    private String c;
    private String y;
    private String z;
    private String g;
    private String h;
    

	@Override
	public String doOperation(String input) {
		// TODO Auto-generated method stub
		return calculateExp(input);
	}
    
    //the only model function needed here 
    public String calculateExp(String str) {
    	Expression exp= new ExpressionBuilder(str).build();
    	return Double.toString(exp.evaluate());
    }
    
    // cos
    public String CosineFunction(String a , boolean degree){

            d = Double.parseDouble(a);

            if(degree == true){
               f =Double.toString(Math.cos(d));
               return f;
             }
            else {
             f =   Double.toString(Math.cos(Math.toRadians(d)));
             return f;
            }
        }
    //sin
    public String SineFunction(String a , boolean degree){

            d = Double.parseDouble(a);

            if(degree == true){
               f =Double.toString(Math.sin(d));
               return f;
             }
            else {
             f =   Double.toString(Math.sin(Math.toRadians(d)));
             return f;
            }
        }  
            // tan
     public String TanFunction(String a , boolean degree){

            d = Double.parseDouble(a);

            if(degree == true){
               f =Double.toString(Math.tan(d));
               return f;
             }
            else {
             f =   Double.toString(Math.tan(Math.toRadians(d)));
             return f;
            }
            
        }
     
     //Logarithmic
         public String LogFunction(String a){

            d = Double.parseDouble(a);
             f =Double.toString(Math.log10(d));
               return f;
             }  
       // Ln
         public String LnFunction(String a){

            d = Double.parseDouble(a);
             f =Double.toString(Math.log(d));
               return f;
             }  
         
         //Exponentialfucntion
         public String ExponentialFunction(String a){
            d = Double.parseDouble(a);
             f =Double.toString(Math.exp(d));
               return f;
               
             }
         // absolute Fuction
         public String AbsoluteFunction(String a){
            d = Double.parseDouble(a);
             f =Double.toString(Math.abs(d));
               return f;
           }
         
         //Factorial Function
         public String FactorialFunction(String n){
             double fact=1;
             d = Double.parseDouble(n);
             for (int i = 1; i <= d; i++) {
                 fact = fact*i;
             }
             f =Double.toString(fact);
                  return f;
             
         }
         // PermutationFunction
         public String PermutationFunction(String n ,String r){
             
                    
             N = Double.parseDouble(n);
             R = Double.parseDouble(r);
             Q = N-R;
             
            if(N>=R){
             q =Double.toString(R);
             y =Double.toString(Q);
             
             g =FactorialFunction(n);
             c =FactorialFunction(q);
             z =FactorialFunction(y);
             
             N = Double.parseDouble(g);
             R = Double.parseDouble(c);
             Q = Double.parseDouble(z);
             
             d = (N/Q);
             f = Double.toString(d);
            return f;
            }
            else{
                return "Math Error";
          
            }
             
         }
         // Combination Function
         public String CombinationFunction(String n ,String r){
             
                    
             N = Double.parseDouble(n);
             R = Double.parseDouble(r);
             Q = N-R;
             
            if(N>=R){
             q =Double.toString(R);
             y =Double.toString(Q);
             
             g =FactorialFunction(n);
             c =FactorialFunction(q);
             z =FactorialFunction(y);
             
             N = Double.parseDouble(g);
             R = Double.parseDouble(c);
             Q = Double.parseDouble(z);
             
             d = (N/(Q*R));
             f = Double.toString(d);
             return f;
            }
            else {
                return "Math Error";
            }
         }

         
            
}