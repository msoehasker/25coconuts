package coconuts;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class BeachController {

    /**
     * Time between calls to step() (ms)
     */
    private static final double MILLISECONDS_PER_STEP = 1000.0 / 30;
    private Timeline coconutTimeline;
    private boolean started = false;

    @FXML
    private Pane skyPane;
    @FXML
    private Pane theBeach;
    private Sky theSky;

    @FXML
    public void initialize() {
        theSky = new Sky((int) (skyPane.getPrefHeight() - theBeach.getPrefHeight()),
                (int) (skyPane.getPrefWidth()), skyPane);

        skyPane.setFocusTraversable(true);

        coconutTimeline = new Timeline(new KeyFrame(Duration.millis(MILLISECONDS_PER_STEP), (e) -> {
            theSky.tryDropCoconut();
            theSky.advanceOneTick();
            if (theSky.done())
                coconutTimeline.pause();
        }));
        coconutTimeline.setCycleCount(Timeline.INDEFINITE);
    }

    @FXML
    public void onKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.RIGHT && !theSky.done()) {
            theSky.getCrab().crawl(10);
        } else if (keyEvent.getCode() == KeyCode.LEFT && !theSky.done()) {
            theSky.getCrab().crawl(-10);
        } else if (keyEvent.getCode() == KeyCode.SPACE) {
            if (!started) {
                coconutTimeline.play();
                started = true;
            }
        }
    }
}
