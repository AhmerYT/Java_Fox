//Must Read Comments

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MenuBar {

    public static void main(String[] args) {
        
        //Creating Frame
        JFrame frm = new JFrame("Sample");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creating Menu Bar
        JMenuBar bar = new JMenuBar();
        
        //Creating Menu
        JMenu menu = new JMenu("File");
        
        //Creating Menu Items
        // .add(new JSeparator()); For Separate Items
        JMenuItem item1 = new JMenuItem("New    ");

        JMenuItem item2 = new JMenuItem("Open   ");
        item2.add(new JSeparator());
        
        JMenuItem item3 = new JMenuItem("Save   ");
        item3.add(new JSeparator());
        
        JMenuItem item4 = new JMenuItem("Save As");
        item4.add(new JSeparator());
        
        JMenuItem item5 = new JMenuItem("Exit   ");
        item5.add(new JSeparator());
        
        //Adding Menu On Bar
        bar.add(menu);
        
        //adding MenuItems in Menu
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);
        
        //Adding Bar on Frame
        frm.add(bar, BorderLayout.NORTH);
        
        //Setting Frame
        frm.setSize(500,500);
        frm.setVisible(true);
        
        
        
        
    }
    
}
