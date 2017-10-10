package TheFindingOfIZack.View.Panels;

import TheFindingOfIZack.Util.GameSize;
import TheFindingOfIZack.World.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Abstract representation of the main panel to form the game GUI
 * Can have it's own panels to form a more complex layout
 */
public abstract class ScreenPanel extends JPanel {

    /**
     * Constructor setting default background colour for all ScreenPanels
     */
    public ScreenPanel(){
        super();
        this.setBackground(Color.BLACK);
    }

    /**
     * Allow for Button interactions to be delegated to a ActionListener elsewhere
     * @param controller ActionListener to associate any button interactions with
     */
    public abstract void addControllerForButtons(ActionListener controller);

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(GameSize.WINDOW_WIDTH, GameSize.WINDOW_HEIGHT);
    }

    public abstract void enableOtherButtons();
}
