// JTextFields and JPasswordFields
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{
  private final JTextField textField1;  // text field with set size
  private final JTextField textField2;  // text field with text
  private final JTextField textField3;  // text field with text and size
  private final JPasswordField passwordField; // password field with text
  
  // TextFieldFrame constructor adds JTextFields to JFrame
  public TextFieldFrame()
  {
    super("Testing JTextField and JPasswordField");
    setLayout(new FlowLayour());
