package pl.sda.chor;

public interface InputHandler {
    Boolean isApplicable(String input);
    void handleInput(String input);
}
