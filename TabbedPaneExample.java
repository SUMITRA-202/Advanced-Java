//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan,
//Magenta and Yellow and display the concerned color whenever the specific 
//tab is selected in the Pan
package swings;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneExample {

    JFrame f;

    TabbedPaneExample() {

        f = new JFrame();

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set required colors
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Create TabbedPane
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 300, 200);

        // Add tabs
        tp.add("Cyan", p1);
        tp.add("Magenta", p2);
        tp.add("Yellow", p3);

        // Add to frame
        f.add(tp);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

	public static void main(String[] args) {
		 new TabbedPaneExample();
    }
}
