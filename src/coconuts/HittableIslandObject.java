package coconuts;

import javafx.scene.image.Image;

// Represents island objects which can be hit
public abstract class HittableIslandObject extends IslandObject {
    public HittableIslandObject(Sky sky, int x, int y, int width, Image image) {
        super(sky, x, y, width, image);
    }

    public boolean isHittable() {
        return true;
    }
}
