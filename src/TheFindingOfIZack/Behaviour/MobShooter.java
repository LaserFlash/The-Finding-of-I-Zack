package TheFindingOfIZack.Behaviour;


import TheFindingOfIZack.Entities.Point;


import java.util.ArrayList;

/**
 * Created by gordontheo on 29/09/17.
 */
public class MobShooter extends Mob{
    private int stopDistance = 200;
    private transient ArrayList<MobProjectile> projectiles;

    public MobShooter(){
        this.viewRange = 600;
        this.speed = 4.5;
        this.health = 50;
        this.damage = 0;
    }

    @Override
    /**
     * Shifts the mob's location but stops before getting to player and shoots
     * @param location point containing the mobs location
     * @param player point containing the players location
     * @return new mob Point
     */
    public Point step(Point location, Point player){
        double range = distanceBetween(location,player);
        if (range < viewRange && range > stopDistance+60 || range < stopDistance) {
            double changeX = (player.getX() - location.getX());
            double changeY = (player.getY() - location.getY());

            double h = Math.hypot(changeX, changeY);
            double a = h / speed;
            double newX = changeX / a;
            double newY = changeY / a;

            if(range < stopDistance){
                newX = -newX;
                newY = -newY;
            }

            location.setLocation((newX + location.getX()), (newY + location.getY()));
            //projectiles.add(new MobProjectile(location, player));
            }
        return location;
    }

    @Override
    public String toString() {
        String string = "A shooting mob Damage = " + this.damage + " health = " + this.health + " speed = " + this.speed;
        return string;
    }

    public  ArrayList<MobProjectile> getProjectile(){
        return projectiles;
    }

    public void popProjectiles() {
        ArrayList<MobProjectile> temp = new ArrayList<MobProjectile>();
        for (MobProjectile p : projectiles) {
            if (p.getPopped()) {temp.add(p);}
        }

        for (MobProjectile p : temp) {
            projectiles.remove(p);
        }
    }
}
