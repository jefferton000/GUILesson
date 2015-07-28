// Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame
{
  private JTextField textField; //used to display font changes
  private Font plainFont; //font for plain text
  private Font boldFont;
  private Font italicFont;
  private Font boldItalicFont;
  private JRadioButton plainJRadioButton; //selects plain text
  private JRadioButton boldJRadioButton; 
  private JRadioButton italicJRadioButton; 
  private JRadioButton boldItalicJRadioButton;
  private ButtonGroup radioGroup; //buttongroup to hold radio buttons
  
  // RadioButtonFrame constructor adds JRadioButtons to JFrame
  public RadioButtonFrame()
  {
    super("RadioButton Test");
    setLayout(new FlowLayout);
    
    textField = new JTextField("Watch the font style change", 25);
    add(textField);
    
    // create radio buttons
    plainJRadioButton = new JRadioButton("Plain", true);
    boldJRadioButton = new JRadioButton("Bold", true);
    italicJRadioButton = new JRadioButton("Italic", true);
    boldItalicJRadioButton = new JRadioButton("Bold/Italic", true);
    add(plainJRadioButton); //add plain button to JFrame
    add(boldJRadioButton);
    add(italicJRadioButton);
    add(boldItalicJRadioButton);
    
    // create logical relationship between JRadioButtons
    radioGroup = new ButtonGroup(); //create ButtonGroup
    radioGroup.add(plainJRadioButton); //add plain to group
    radioGroup.add(boldJRadioButton);
    radioGroup.add(italicJRadioButton);
    radioGroup.add(boldItalicJRadioButton);
    
    // create font objects
    
    
    
    
  }
}
