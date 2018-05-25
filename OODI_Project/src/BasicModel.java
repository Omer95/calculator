
import java.util.Stack;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/**
 * 
 * @author Usama Hussain and Muneeb Khan Afridi
 *
 */
public class BasicModel implements Model{
    private boolean result = false;
    private String answer;
    


	@Override
	public String doOperation(String input) {
		// TODO Auto-generated method stub
		try {
			return basicCalculate(input);
		}
		catch(ScriptException e) {
			return "Syntax Error";
		}
	}
   
    public String basicCalculate(String s) throws ScriptException {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if(c == '[' || c == '(' || c == '{' ) {     
               stack.push(c);
           } else if(c == ']') {
               if(stack.isEmpty() || stack.pop() != '[') {
                   result = false;
               }
           } else if(c == ')') {
               if(stack.isEmpty() || stack.pop() != '(') {
                   result = false;
               }           
           } else if(c == '}') {
               if(stack.isEmpty() || stack.pop() != '{') {
                  result = false;
               }
           }

        }
        result = stack.isEmpty();
        
        if(result == true){
             //System.out.println(new ScriptEngineManager().getEngineByName("JavaScript").eval(s));
        	answer=(new ScriptEngineManager().getEngineByName("JavaScript").eval(s)).toString();
        	return answer;
        }
        else {
            //System.out.println("Syntax Error");
            return "Syntax error";
        }
                
           
        
    }


}
