package Tests.Mocks;

import TheFindingOfIZack.Entities.Player;
import TheFindingOfIZack.World.Model;
import TheFindingOfIZack.World.Rooms.Door;
import TheFindingOfIZack.World.Rooms.Room;
import TheFindingOfIZack.World.Rooms.standardRoom;

import java.awt.*;

public class MockModel implements Model {
    private Player p = new Player(new Point(20,20));

    public MockModel(){
        p.setRoom(new Room() {
            @Override
            public void populateRoom(Player p) {

            }

            @Override
            public void update() {

            }
        });
    }

    @Override
    public void beginNewGame() {

    }

    @Override
    public Player getPlayer() {
        return p;
    }

    @Override
    public void resumeGame() {

    }

    @Override
    public void pauseGame() {

    }

    @Override
    public void trueRight() {

    }

    @Override
    public void trueLeft() {

    }

    @Override
    public void trueUp() {

    }

    @Override
    public void trueDown() {

    }

    @Override
    public void falseRight() {

    }

    @Override
    public void falseLeft() {

    }

    @Override
    public void falseUp() {

    }

    @Override
    public void falseDown() {

    }

    @Override
    public void shootLeftTrue() {

    }

    @Override
    public void shootLeftFalse() {

    }

    @Override
    public void shootUpTrue() {

    }

    @Override
    public void shootUpFalse() {

    }

    @Override
    public void shootRightTrue() {

    }

    @Override
    public void shootRightFalse() {

    }

    @Override
    public void shootDownTrue() {

    }

    @Override
    public void shootDownFalse() {

    }

    @Override
    public void shootLeft() {

    }

    @Override
    public void shootRight() {

    }

    @Override
    public void shootUp() {

    }

    @Override
    public void shootDown() {

    }
}
