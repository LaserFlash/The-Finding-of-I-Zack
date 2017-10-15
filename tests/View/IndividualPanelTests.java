package View;

import Mocks.MockModel;
import TheFindingOfIZack.View.Panels.GameArea;
import TheFindingOfIZack.View.Panels.GameEndScreen;
import TheFindingOfIZack.View.Panels.InventoryPanel;

import org.junit.Test;

import javax.swing.*;

public class IndividualPanelTests {

    @Test
    public void endScreenDefaultText() throws InterruptedException {
        JFrame f = new JFrame();
        f.add(new GameEndScreen(new String[]{"Game Over"}));
        displayTestWindow(f);
    }

    @Test
    public void endScreenLongText() throws InterruptedException {
        JFrame f = new JFrame();
        f.add(new GameEndScreen(new String[]{"This is a long one line String, which needs to be made longer and longer and longer"}));
        displayTestWindow(f);
    }

    @Test
    public void endScreenMultipleLineText() throws InterruptedException {
        JFrame f = new JFrame();
        f.add(new GameEndScreen(new String[]{"This is a multiple line display","With each line in a different","index of the parsed array"}));
        displayTestWindow(f);
    }


    @Test
    public void drawGameArea() throws InterruptedException {
        GameArea a = new GameArea(new MockModel());
        JFrame f = new JFrame();
        f.add(a);
        displayTestWindow(f);
    }

    @Test
    public void drawInventoryPanel() throws InterruptedException {
        InventoryPanel i = new InventoryPanel(new MockModel());
        JFrame f = new JFrame();
        f.add(i);
        displayTestWindow(f);
    }

    private void displayTestWindow(JFrame f) throws InterruptedException {

        f.pack();
        SwingUtilities.invokeLater(()->{
            f.setVisible(true);
            new Timer(2000, e-> f.dispose()).start();
        });

        Thread.sleep((3000));
    }
}
