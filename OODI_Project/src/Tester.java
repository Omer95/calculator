
/**
 *
 * @author Omer Farooq Ahmed 
 */
public class Tester {
    public static void main (String[] args) {
        BasicView theView= new BasicView("");
        theView.setVisible(true);
        BasicModel theModel= new BasicModel();
        BasicController theController= new BasicController(theView, theModel);
        
    }
}
