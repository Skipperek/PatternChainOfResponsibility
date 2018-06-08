package pl.sda.chor;

public class LeftInputHandler implements InputHandler {
    public Boolean isApplicable(String input) {
        return input.startsWith("A");
    }

    public void handleInput(String input) {
        System.out.println("Moving LEFT");
    }
}
