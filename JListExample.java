//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, 
//Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a 
//JList and display the capital of the countries on console whenever the countries are 
//selected on the list.

package swings;

import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class JListExample extends JFrame {

    private JList<String> countryList;

    public JListExample() {

        // Create model and add elements
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");

        // Create HashMap for capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        countryList = new JList<>(listModel);

        // Event handling
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {

                    String selectedCountry = countryList.getSelectedValue();

                    if (selectedCountry != null) {
                        System.out.println("Capital of " + selectedCountry +
                                " is: " + capitals.get(selectedCountry));
                    }
                }
            }
        });

        add(new JScrollPane(countryList));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JList Example");
        setSize(250, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }


	public static void main(String[] args) {
		 new JListExample();
	}

}
