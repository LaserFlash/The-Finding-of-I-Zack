package TheFindingOfIZack.Entities;

import java.awt.*;

/**
 * Created by allanbenj1 on 29/09/17.
 */
public class Urn extends WorldItem{

    public Urn(int health, Point location) {
        super(health, location);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);

        Polygon top = new Polygon();

        top.addPoint((int) location.getX(), (int) location.getY());
        top.addPoint((int) location.getX()+width, (int) location.getY());
        top.addPoint((int) location.getX()+width/2, (int) location.getY()+width);

        Polygon btm = new Polygon();

        btm.addPoint((int) location.getX(), (int) location.getY()+width);
        btm.addPoint((int) location.getX()+width, (int) location.getY()+width);
        btm.addPoint((int) location.getX()+width/2, (int) location.getY());

        g.fillPolygon(top);
        g.fillPolygon(btm);

        g.setColor(Color.black);

        g.drawPolygon(top);
        g.drawPolygon(btm);

    }

}