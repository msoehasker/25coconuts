package coconuts;

import javafx.scene.image.Image;

// Represents island objects which can be hits; this class will
// implement the subject side of the pattern
public abstract class HittableIslandObject extends IslandObject {
    public HittableIslandObject(Sky sky, int x, int y, int width, Image image) {
        super(sky, x, y, width, image);
    }

    public boolean isHittable() {
        return true;
    }
}
