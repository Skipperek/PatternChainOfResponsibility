package pl.sda.chor;

import java.util.ArrayList;
import java.util.List;

public class InputHandlers implements InputHandler {
    List<InputHandler> inputHandlers = new ArrayList<InputHandler>();

 private UpInputHandler upInputHandler = new UpInputHandler();
 private DownInputHandler downInputHandler = new DownInputHandler();
 private LeftInputHandler leftInputHandler = new LeftInputHandler();
 private RightInputHandler rightInputHandler = new RightInputHandler();



    public Boolean isApplicable(String input) {
        for(InputHandler inputHandler : inputHandlers){
            if (inputHandler.isApplicable(input)) {
                return true;
            }
        }
        return false;
    }
    public void handleInput(String input) {
        for(InputHandler inputHandler : inputHandlers){
            if(inputHandler.isApplicable(input)){
                inputHandler.handleInput(input);
            }
        }

    }
}
