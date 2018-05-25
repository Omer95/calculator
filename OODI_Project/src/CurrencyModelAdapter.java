import com.google.gson.*;
import com.javatraineronline.*;
public class CurrencyModelAdapter implements Model{
	private Finilization model= new Finilization();
	private String inputCurr;
	private String outputCurr;
	
	
	
	@Override
	public String doOperation(String input) {
		// TODO Auto-generated method stub
		inputCurr=CurrencyView.jComboBox1.getSelectedItem().toString();
		outputCurr=CurrencyView.jComboBox2.getSelectedItem().toString();
		return model.FinalResult(inputCurr, outputCurr, input);
	}
	
	public void getCurrData() {
		//inputCurr=CurrencyView.jComboBox1.getSelectedItem().toString();
		//outputCurr=CurrencyView.jComboBox2.getSelectedItem().toString();
	}
	
	
}
