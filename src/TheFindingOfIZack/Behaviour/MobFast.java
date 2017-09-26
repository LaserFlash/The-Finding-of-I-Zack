package Behaviour;

import java.awt.*;

/**
 * Created by gordontheo on 19/09/17.
 */
public class MobFast extends MobEnemy {
    public MobFast(String type) {
        super(type);
    }

    @Override
    public Point step(Point location, Point player){
        //performs Mod specific step
        int newX = 0;//temp value
        int newY = 0;//temp value
        return location;
    }
}
