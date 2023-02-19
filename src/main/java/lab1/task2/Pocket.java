package lab1.task2;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Pocket {
    private final int x;
    private final int y;
    private int radius;

    public Pocket(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.MAGENTA);
        g2.fill(new Ellipse2D.Double(x, y, radius*2, radius*2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Pocket{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
