package coconuts;

import javafx.scene.image.Image;

// Represents the beam of light moving from the crab to a coconut; can hit only falling objects
public class LaserBeam extends IslandObject {
    private static final int WIDTH = 2; // must be updated with image
    private static final Image laserImage = new Image("file:images/laser-1.png");

    public LaserBeam(Sky sky, int eyeHeight, int crabCenterX) {
        super(sky, crabCenterX, eyeHeight, WIDTH, laserImage);
    }

    public int hittable_height() {
        return y + WIDTH;
    }

    @Override
    public void step() {
        y -= 3;
    }
}
