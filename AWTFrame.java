import java.awt.*;
import java.awt.event.*;

public class AWTFrame
{
  public static void main (String args[]) throws Exception
  {
    Frame  frame = new Frame("AWT Demo");
    Label  label = new Label ("AWT Version");
    Button button = new Button ("Click to close");
    button.addActionListener( new ActionListener() {
      public void actionPerformed(ActionEvent evt)
      {
        System.exit(0);
      }
    });

    // Set layout manager
    frame.setLayout( new FlowLayout() );

    // Add to frame
    frame.add( label  );
    frame.add( button );
    frame.pack();

    // Center the frame
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    // Get the current screen size
    Dimension scrnsize = toolkit.getScreenSize();

    // Get the frame size
    Dimension framesize= frame.getSize();

    // Set X,Y location
    frame.setLocation ( (int) (scrnsize.getWidth()
                         - frame.getWidth() ) / 2 ,
                        (int) (scrnsize.getHeight()
                         - frame.getHeight()) / 2);

    frame.setVisible(true);
  }
}
