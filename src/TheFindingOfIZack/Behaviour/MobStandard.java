package TheFindingOfIZack.Behaviour;

/**
 * Created by gordontheo on 19/09/17.
 * The staple enemy, will remain still until the player enters its field of view.
 * After this it will follow the player at slow speed and cause damage if it touches
 */
public class MobStandard extends Mob {
    MobStandard(){
        this.viewRange = 50;
        this.speed = 2;
        this.health = 50;
    }
}
