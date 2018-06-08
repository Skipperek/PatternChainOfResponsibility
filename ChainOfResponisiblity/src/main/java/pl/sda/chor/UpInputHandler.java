package pl.sda.chor;

public class UpInputHandler implements InputHandler {
    public Boolean isApplicable(String input) {
        return input.startsWith("W");
    }

    public void handleInput(String input) {
        System.out.println("Moving UP");

    }
}
