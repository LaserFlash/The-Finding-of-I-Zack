package TheFindingOfIZack.Behaviour;

import TheFindingOfIZack.Entities.Entity;
import TheFindingOfIZack.FileIO.Util.Savable;
import TheFindingOfIZack.Util.ImageLoader;

import java.awt.*;

/**
 * Created by gordontheo on 19/09/17.
 * The staple enemy, will remain still until the player enters its field of view.
 * After this it will follow the player at slow speed and cause damage if it touches
 */
public class MobStandard extends Mob implements Savable {

    static {
        image = ImageLoader.loadImage("/bothersomeBrittleStar.png").getScaledInstance(Entity.width,Entity.width, Image.SCALE_DEFAULT);
    }
    MobStandard(){
        this.viewRange = 50;
        this.speed = 3;
        this.health = 50;
        this.damage = 10;
    }

    @Override
    public String toString() {
        String string = "A standard mob Damage = " + this.damage + " health = " + this.health + " speed = " + this.speed;
        return string;
    }
}
