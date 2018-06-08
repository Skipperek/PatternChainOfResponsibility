package pl.sda.chor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        InputHandler inputHandler = new InputHandlers();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext(".")) {
            String input  = scanner.next(".");
            if( inputHandler.isApplicable(input)){
                inputHandler.handleInput(input);
        }
        }
    }
}
