package TheFindingOfIZack.World;

import TheFindingOfIZack.Entities.Player;

public interface Model {
    void beginNewGame();
    Player getPlayer();
    void resumeGame();
    void pauseGame();

    void trueRight();
    void trueLeft();
    void trueUp();
    void trueDown();
    void falseRight();
    void falseLeft();
    void falseUp();
    void falseDown();

    void shootLeft();
    void shootRight();
    void shootUp();
    void shootDown();
}
