package coconuts;

// the beach catches (hits) coconuts and increases the coconut score
public class Beach extends IslandObject {

    public Beach(Sky sky, int skyHeight, int islandWidth) {
        super(sky, 0, skyHeight, islandWidth, null);
        // System.out.println("Beach at y = " + this.y);
    }

    @Override
    public void step() { /* do nothing */ }
}
