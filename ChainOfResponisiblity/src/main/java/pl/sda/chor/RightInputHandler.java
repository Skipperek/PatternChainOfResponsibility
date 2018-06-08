package pl.sda.chor;

public class RightInputHandler implements InputHandler{
    public Boolean isApplicable(String input) {
        return input.startsWith("D");
    }

    public void handleInput(String input) {
        System.out.println("Moving RIGHT");

    }
}
