// JLabels with text and icons.
import java.awt.FlowLayout;   // specifies how components are arranged
import java.swing.JFrame;     // provides basic window features
import java.swing.JLabel;     // display text and images
import java.swing.SwingConstants; // common constants used with Swing
import java.swing.Icon;       // interface used to manipulate images
import java.swing.ImageIcon;  // loads images

public class LabelFrame extends JFrame
{
  private final JLabel label1;  // JLabel with just text
  private final JLabel label2;  // JLabel constructed with text and icon
  private final JLabel label3;  // JLabel with added text and icon
  
  // LabelFrame constructor add JLabels to JFrame
  public LabelFrame()
  {
    super("Testing JLabel");
    setLayout(new FlowLayout());  // set frame layout
    
    // JLabel constructor with a string argument
    label1 = new JLabel("Label with text");
  }
}
