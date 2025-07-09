package A14June.Facade;

public class Projector {

    private boolean isOn = false;
    private boolean isPlaying = false;

    public void on() {
        isOn = true;
        System.out.println("Projector is ON.");
    }

    public void off() {
        isOn = false;
        isPlaying = false;
        System.out.println("Projector is OFF.");
    }

    public void play() {
        if (isOn) {
            isPlaying = true;
            System.out.println("Projector is now playing.");
        } else {
            System.out.println("Projector is OFF. Turn it on first.");
        }
    }

    public void pause() {
        if (isPlaying) {
            System.out.println("Projector playback is paused.");
            isPlaying = false;
        } else {
            System.out.println("Projector is not currently playing.");
        }
    }

    public void resume() {
        if (isOn && !isPlaying) {
            System.out.println("Resuming projector playback.");
            isPlaying = true;
        } else if (!isOn) {
            System.out.println("Cannot resume. Projector is OFF.");
        } else {
            System.out.println("Projector is already playing.");
        }
    }

    public void stop() {
        if (isPlaying) {
            System.out.println("Stopping projector playback.");
            isPlaying = false;
        } else {
            System.out.println("Projector is not currently playing.");
        }
    }

    public void suspend() {
        System.out.println("Projector is suspended.");
    }

    public void diminish() {
        System.out.println("Projector brightness is diminished.");
    }

    public void adjustFocus() {
        System.out.println("Projector is adjusting focus.");
    }

    public void set() {
        System.out.println("Projector settings initialized.");
    }

    public void up() {
        System.out.println("Projector is raising.");
    }

    public void down() {
        System.out.println("Projector is lowering.");
    }

    public void move(String direction) {
        System.out.println("Projector is moving: " + direction);
    }

    public void moveUp() {
        move("up");
    }

    public void moveDown() {
        move("down");
    }

    public void moveLeft() {
        move("left");
    }

    public void moveRight() {
        move("right");
    }

    public void moveForward() {
        move("forward");
    }

    public void moveBack() {
        move("back");
    }

    public void moveUpLeft() {
        move("up-left");
    }

    public void moveUpRight() {
        move("up-right");
    }

    public void moveDownLeft() {
        move("down-left");
    }

    public void moveDownRight() {
        move("down-right");
    }

    public void moveBackLeftRight() {
        move("back-left-right");
    }

    public void moveForwardLeftRight() {
        move("forward-left-right");
    }

    public void moveLeftRight() {
        move("left-right");
    }
}
