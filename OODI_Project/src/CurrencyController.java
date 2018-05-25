//The library below was taken from java trainer online and is publically available under the apache license
import java.awt.event.ActionEvent;

import com.javatraineronline.*;
public class CurrencyController {
	private CurrencyModelAdapter theModel;
	private CurrencyView theView;
	private static CurrencyController instance;
	
	private CurrencyController(CurrencyModelAdapter theModel, CurrencyView theView) {
		this.theModel=theModel;
		this.theView=theView;
		theView.addCurrencyListener(new CurrencyListener());
	}
	
	public static CurrencyController getCurrController(CurrencyModelAdapter theModel, CurrencyView theView) {
		if (instance==null) {
			instance= new CurrencyController(theModel, theView);
			return instance;
		}
		return null;
	}
	
	class CurrencyListener implements java.awt.event.ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			theView.setTextToField(theModel.doOperation(theView.getTextFromField()));
		}
		
	}
	
}
