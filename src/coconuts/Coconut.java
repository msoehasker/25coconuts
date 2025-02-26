package coconuts;

import javafx.scene.image.Image;

// Represents the falling object that can kill crabs. If hit by a laser, the coconut disappears
public class Coconut extends HittableIslandObject {
    private static final int WIDTH = 50;
    private static final Image coconutImage = new Image("file:images/coco-1.png");

    public Coconut(Sky sky, int x) {
        super(sky, x, 0, WIDTH, coconutImage);
    }

    @Override
    public void step() {
        y += 5;
    }
}
