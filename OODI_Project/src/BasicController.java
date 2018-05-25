
import java.awt.event.*;
import javax.script.ScriptException;
/**
 * 
 * @author Omer Farooq Ahmed 
 * This is the controller class of the MVC Calculator I am
 * building for my OODI project with Muneeb Khan Afridi
 * and Usama Hussain
 * Date: 3/11/2017
 *
 */
public class BasicController {
	//PROPERTIES
	private BasicView basicView;
	private BasicModel basicModel;
	//CONSTRUCTOR
	public BasicController(BasicView basicView, BasicModel basicModel) {
		this.basicModel=basicModel;
		this.basicView=basicView;
		//ADDS ACTIONLISTENER TO THE EQUALS BUTTON IN THE VIEW
		this.basicView.addCalculateListener(new CalculateListener());
	}
	//CLASS FOR ACTION LISTENER ADDED TO VIEW
	class CalculateListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String textFromField=basicView.getTextFromField();
			/*
			try {
				basicView.setTextToField(basicModel.basicCalculate(textFromField));
			}
			catch (ScriptException ex) {
                               System.out.println("Syntax error");
                               basicView.setTextToField("Syntax Error");
			}
			*/
			basicView.setTextToField(basicModel.doOperation(textFromField));
		}
	}


	
}
