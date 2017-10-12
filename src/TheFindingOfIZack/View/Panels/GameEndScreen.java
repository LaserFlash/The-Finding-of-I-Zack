package TheFindingOfIZack.View.Panels;

import TheFindingOfIZack.Util.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Panel that represents the end game screen
 * Indicates to player if they won or lost
 */
public class GameEndScreen  extends ScreenPanel{

    private JButton returnButton;
    private List<JLabel> textLabels;

    /* Images used to customise buttons */
    private static final Icon normalButton;
    private static final Icon disabledButton;
    private static final Icon hoverButton;

    static {
        normalButton = ImageLoader.loadIcon("/normalButton.jpg");
        disabledButton = ImageLoader.loadIcon("/disabledButton.jpg");
        hoverButton = ImageLoader.loadIcon("/hoverButton.jpg");
    }

    public GameEndScreen(String[] message){
        super();
        textLabels = new ArrayList<>();
        this.setBackground(Color.darkGray);
        this.setForeground(Color.red);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        JLabel textLabel = new JLabel(message[0]);
        setLabelFontSize(textLabel);

        textLabels.add(textLabel);
        this.add(textLabel);

        returnButton = new JButton("Return to Menu",normalButton);
        returnButton.setHorizontalTextPosition(JButton.CENTER);
        returnButton.setVerticalTextPosition(JButton.CENTER);
        returnButton.setDisabledIcon(disabledButton);
        returnButton.setRolloverIcon(hoverButton);
        returnButton.setForeground(Color.lightGray);
        returnButton.setBorderPainted(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setActionCommand("returnMenu");
        returnButton.setAlignmentX(CENTER_ALIGNMENT);
        this.add(Box.createRigidArea(new Dimension(5,50)));
        this.add(returnButton);

    }

    private void setLabelFontSize(JLabel label){
        Font labelFont = label.getFont();
        label.setForeground(Color.red);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setAlignmentX(CENTER_ALIGNMENT);
        // Set the label's font size to the newly determined size.
        label.setFont(new Font(labelFont.getName(), Font.BOLD, 45));
    }

    @Override
    public void changeText(String[] text){
        textLabels.forEach(l -> this.remove(l));
        textLabels.clear();
        this.remove(returnButton);
        for (String s: text){
            JLabel tmp = new JLabel(s);
            setLabelFontSize(tmp);
            textLabels.add(tmp);
        }
        textLabels.forEach( l -> {
            this.add(l);
        });
        this.add(Box.createRigidArea(new Dimension(5,50)));
        this.add(returnButton);
    }

    @Override
    public void addControllerForButtons(ActionListener controller) {
        returnButton.addActionListener(controller);
    }

    @Override
    public void enableOtherButtons() {

    }

    @Override
    public void disableOtherButtons() {

    }

    @Override
    public void repaint(){
        super.repaint();
    }
}