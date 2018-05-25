import java.awt.event.*;
public class ScientificController {
	private ScientificView1 theView;
	private ScientificModel theModel;
	private static ScientificController instance;
	
	private ScientificController(ScientificView1 theView, ScientificModel theModel) {
		this.theModel=theModel;
		this.theView=theView;
		theView.addScientificListener(new ScientificListener());
	}
	
	public static ScientificController getInstance(ScientificView1 theView, ScientificModel theModel) {
		if (instance==null) {
			instance= new ScientificController(theView, theModel);
			return instance;
		}
		return null;
	}
	
	class ScientificListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			theView.setTextToField(theModel.doOperation(theView.getTextFromField()));
		}
		
	}
	
}
