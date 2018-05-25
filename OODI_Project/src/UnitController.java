import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitController {
	private UnitConverterModel theModel;
	private UnitView theView;
	private static UnitController instance;
	
	private UnitController (UnitConverterModel theModel, UnitView theView) {
		this.theModel=theModel;
		this.theView=theView;
		theView.AddConverterListener(new ConverterListener());
	}
	
	public static UnitController getInstance(UnitConverterModel theModel, UnitView theView) {
		if (instance==null) {
			instance= new UnitController(theModel, theView);
			return instance;
		}
		return instance;
	}
	
	public class ConverterListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String input= theView.getInput();
			
			if (theView.jComboBox1.getSelectedItem().equals("m")) {
				theView.jTextArea1.setText(theModel.MtoCM(input)+" CM\n"+theModel.MtoKM(input)+" KM\n"+theModel.MtoMM(input)+" MM\n"+theModel.MtoMicrometer(input)+" Micrometer");
			}
			if (theView.jComboBox1.getSelectedItem().equals("mm")) {
				theView.jTextArea1.setText(theModel.MMtoCM(input)+" CM\n"+theModel.MMtoKM(input)+" KM\n"+theModel.MMtoM(input)+" M\n"+theModel.MMtoMicroMeter(input)+" Micrometer");
			}
			if (theView.jComboBox1.getSelectedItem().equals("km")) {
				theView.jTextArea1.setText(theModel.KMtoCM(input)+" CM\n"+theModel.KMtoM(input)+" M\n"+theModel.KMtoMM(input)+" MM\n"+theModel.KMtoMicrometer(input)+" Micrometer");
			}
			if (theView.jComboBox1.getSelectedItem().equals("cm")) {
				theView.jTextArea1.setText(theModel.CMtoM(input)+" M\n"+theModel.CMtoKM(input)+" KM\n"+theModel.CMtoMM(input)+" MM\n"+theModel.CMtoMicrometer(input)+" Micrometer");
			}
			if (theView.jComboBox1.getSelectedItem().equals("micro meter")) {
				theView.jTextArea1.setText(theModel.MicrometertoCM(input)+" CM\n"+theModel.MicrometertoKM(input)+" KM\n"+theModel.MicrotoMM(input)+" MM\n"+theModel.MicrometertoM(input)+" M");
			}
			
			if (theView.jComboBox1.getSelectedItem().equals("kg")) {
				theView.jTextArea1.setText(theModel.KgtoGram(input)+" gram\n"+theModel.KgtoMicroGram(input)+" MicroGram\n"+theModel.KgtoMiliGram(input)+" MG\n");
			}
			if (theView.jComboBox1.getSelectedItem().equals("g")) {
				theView.jTextArea1.setText(theModel.GramtoKg(input)+" KG\n"+theModel.GramtoMicroGram(input)+" MicroGram\n"+theModel.GramtoMiliGram(input)+" MG\n");
			}
			if (theView.jComboBox1.getSelectedItem().equals("mg")) {
				theView.jTextArea1.setText(theModel.MiliGramtoGram(input)+" gram\n"+theModel.MiliGramtoMicroGram(input)+" MicroGram\n"+theModel.MiliGramtoKg(input)+" KG\n");
			}
			if (theView.jComboBox1.getSelectedItem().equals("micro gram")) {
				theView.jTextArea1.setText(theModel.MicroGramtoGram(input)+" gram\n"+theModel.MicrogramtoKg(input)+" KG\n"+theModel.MicrotoMiliGram(input)+" MG\n");
			}
			
			if (theView.jComboBox1.getSelectedItem().equals("Farenheit")) {
				theView.jTextArea1.setText((5.0/9.0)*(Double.parseDouble(input)-32)+" celcius\n");
			}
			if (theView.jComboBox1.getSelectedItem().equals("Celcius")) {
				theView.jTextArea1.setText(theModel.CelToFer(input)+" farenheit\n");
			}
			if (theView.jComboBox1.getSelectedItem().equals("hr")) {
				theView.jTextArea1.setText(theModel.HourToMin(input)+" minutes\n"+theModel.HourToSec(input)+" seconds\n");
			}
			if (theView.jComboBox1.getSelectedItem().equals("min")) {
				theView.jTextArea1.setText(theModel.MinTohour(input)+" hours\n"+theModel.MinToSec(input)+" seconds\n");
			}
			if (theView.jComboBox1.getSelectedItem().equals("sec")) {
				theView.jTextArea1.setText(theModel.SecToHour(input)+" hour\n"+theModel.SecToMin(input)+" minutes\n");
			}

	}
}
}

