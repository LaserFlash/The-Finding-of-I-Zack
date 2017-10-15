package View;

import Mocks.MockModel;
import TheFindingOfIZack.Entities.Player;
import TheFindingOfIZack.Entities.Point;
import TheFindingOfIZack.View.ViewManager;
import TheFindingOfIZack.World.Model;
import TheFindingOfIZack.World.Rooms.Room;
import TheFindingOfIZack.World.Rooms.bossRoom;
import TheFindingOfIZack.World.Rooms.standardRoom;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.swing.*;
import javax.xml.stream.Location;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ViewManagerTest {


    /**
     * Check that the view correctly displays the start screen menu
     */
    @Test
    public void testMenuDisplay() throws InterruptedException {

        MockModel m = new MockModel();
        killIn3Sec(m);
    }

    /**
     * Check the game game be displayed and then returned to the start menu screen
     */
    @Test
    public void testGameDisplayToggle() throws InterruptedException {
        MockModel m = new MockModel();
        SwingUtilities.invokeLater(()->{
            ViewManager v = new ViewManager(m);
            v.showGUI();
            new Timer(1000,e-> v.goToGameView()).start();
            new Timer(2000,e-> v.goToMenuView()).start();
            new Timer(3000,e-> v.dispose()).start();
        });
        Thread.sleep(4000);
    }

    /**
     * Check that the initial disabled buttons become enabled
     * Disabled buttons are:
     *      Save
     *      Resume
     */
    @Test
    public void testActivateOtherButtons() throws InterruptedException {
        MockModel m = new MockModel();
        SwingUtilities.invokeLater(()->{
            ViewManager v = new ViewManager(m);
            v.showGUI();
            new Timer(2000, e-> v.enableOtherButtons()).start();
        });
        Thread.sleep((3000));
    }

    /**
     * check if  the objects in the room such as rocks and urns are drawn correctly
     * @throws InterruptedException
     */
    @Test
    public void testDrawEntities() throws InterruptedException {
        MockModel m = new MockModel();
        standardRoom r = new standardRoom();
        Player p = new Player(new Point(100,100));
        r.addPlayer(p);
        r.populateRoom(p);
        SwingUtilities.invokeLater(()->{

            ViewManager v = new ViewManager(m);
            v.showGUI();

            new Timer(2000,e-> r.draw(v.getGraphics())).start();



        });
        Thread.sleep((3000));
    }

    /**
     * checks that the boss is drawn correctly
     * @throws InterruptedException
     */
    @Test
    public void testDrawBoss() throws InterruptedException {
        MockModel m = new MockModel();
        bossRoom r = new bossRoom();
        Player p = new Player(new Point(100,100));
        r.addPlayer(p);
        r.populateRoom(p);
        SwingUtilities.invokeLater(()->{

            ViewManager v = new ViewManager(m);
            v.showGUI();

            new Timer(2000,e-> r.draw(v.getGraphics())).start();



        });
        Thread.sleep((3000));
    }

    /**
     * Check end screen panel with default text
     * @throws InterruptedException
     */
    @Test
    public void testEndScreenDisplay() throws InterruptedException {
        MockModel m = new MockModel();
        SwingUtilities.invokeLater(()->{
            ViewManager v = new ViewManager(m);
            v.showGUI();
            new Timer(1000, e-> v.goToEndView()).start();
            new Timer(2000,e-> v.dispose()).start();
        });

        Thread.sleep((3000));
    }


    /**
     * Restrict the window to being displayed for 3 second period
     * @param mock
     * @throws InterruptedException
     */
    private void killIn3Sec(Model mock) throws InterruptedException {
        SwingUtilities.invokeLater(()->{
            ViewManager v = new ViewManager(mock);
            v.showGUI();
            new Timer(3000,e-> v.dispose()).start();
        });
        Thread.sleep(3000);
    }
}