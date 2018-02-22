package colorchooser;

import java.awt.*;
import javax.swing.*;

public class ColorChooser {

    public static void main(String[] args) {
        
        //Creating Frame;
        JFrame frm =  new JFrame("Color Chooser");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creating Lable & Lable Font
        final JLabel lbl = new JLabel("By Ahmer Tahir", JLabel.CENTER);
        lbl.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 48));
        
        //Creating Color Chooser
        final JColorChooser clr = new JColorChooser(lbl.getBackground());
        
        //Adding Stuff in frame
        frm.add(lbl, BorderLayout.SOUTH);
        frm.add(clr, BorderLayout.CENTER);
        frm.pack();
        frm.setVisible(true);
    }
    
}
