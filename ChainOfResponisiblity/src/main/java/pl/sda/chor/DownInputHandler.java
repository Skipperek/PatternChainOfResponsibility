package pl.sda.chor;

public class DownInputHandler implements InputHandler {
    public Boolean isApplicable(String input) {
        return input.startsWith("S");
    }

    public void handleInput(String input) {
        System.out.println("Moving DOWN");

    }
}
