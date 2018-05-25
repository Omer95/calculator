import com.google.gson.*;
import com.javatraineronline.*;
public class ControllerFacade {

	private UnitController unit;
	private CurrencyController currency;
	private ScientificController scientific;
	
	   
	
	public void unitOperation(UnitConverterModel theModel, UnitView theView){
		UnitController.getInstance(theModel, theView);
	}
	public void currencyOperation(CurrencyModelAdapter theModel, CurrencyView theView){
		CurrencyController.getCurrController(theModel, theView);
	}
	public void ScientificOperation(ScientificView1 theView, ScientificModel theModel){
		ScientificController.getInstance(theView, theModel);
	}
}
