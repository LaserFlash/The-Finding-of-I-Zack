package TheFindingOfIZack.Entities;

import TheFindingOfIZack.FileIO.Util.Savable;
import TheFindingOfIZack.Util.ImageLoader;

import java.awt.*;

/**
 * Created by allanbenj1 on 29/09/17.
 */
public class Rock extends Entity implements Savable {

    /**
     * Fields to store health, image, and if it is destroyed
     */

    private static Image rocksImage;

    private boolean destroyed = false;

    int health = 1000;

    /**
     * Constructor for Rock
     * @param location  the location of the rock
     */
    public Rock(Point location) {
        super(location);
        this.rocksImage = ImageLoader.loadImage("/rocks.png").getScaledInstance(Entity.width,Entity.width,Image.SCALE_DEFAULT);
    }

    /**
     * Damages the rock
     * @param damage    the amount of damage dealt to the rock
     */
    public void damage(int damage) {
        this.health -= damage;
        if (health < 0) {
            health = 0;
            destroyed = true;
        }
    }

    /**
     * Draws the rock
     * @param g graphics object to draw on
     */
    @Override
    public void draw(Graphics g) {
        g.drawImage(rocksImage, (int) location.getX(), (int) location.getY(), null);
    }

    /**
     * Returns whether the rock is destroyed or not
     * @return  destroyed
     */
    public boolean isDestroyed() {
        return destroyed;
    }

}
