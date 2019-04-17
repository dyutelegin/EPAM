package com.javacore.epam;

import com.javacore.epam.command.ACommand;
import com.javacore.epam.command.CommandRegistry;
import com.javacore.epam.common.ConsoleCanvas;
import com.javacore.epam.db.Record;
import com.javacore.epam.db.Table;
import com.javacore.epam.profile.ProfileController;
import com.javacore.epam.profile.ProfileModel;
import com.javacore.epam.profile.ProfileView;
import com.javacore.epam.state.ApplicationState;
import com.javacore.epam.state.StateIdle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application {
    static public final String APP_NAME = "Steve";
    static public final String AUTHOR = "Telegin Dmitrii";
    static public final String VERSION = "0.0.0";
    static ApplicationState currentState;
    public static void main(String[] args) {

        List<String> columns = new ArrayList<>();
        List<String> values = new ArrayList<>();
        List<String> values2 = new ArrayList<>();
        columns.add("id");
        columns.add("firstName");
        columns.add("lastName");
        Table criminalTable = new Table("Criminals", columns);
        values.add("1");
        values.add("Vladimir");
        values.add("Tramp");
        values2.add("2");
        values2.add("Donald");
        values2.add("Timoshenko");
        criminalTable.insert(new Record(values));
        criminalTable.insert(new Record(values2));
        criminalTable.select("1");

 /*       List<String> result = criminalTable.selectField("id");
        for (String s: result){
            System.out.println(s);
        }*/


/*        ConsoleCanvas consoleCanvas = new ConsoleCanvas(15,15);
        consoleCanvas.drawSquareAt(5,5, 1);
        consoleCanvas.draw(); */

 /*       changeState(new StateIdle(), "Idle");
        String commandName = "test command";
        currentState.onCommand(commandName);
        for(int i = 0; i < 10; i++){
            currentState.onCommand(commandName + i);*/

/*        ProfileController controller = new ProfileController();
        controller.showProfile(1); */

/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String commandName = reader.readLine();
            if (!commandName.isEmpty()) {
                if(commandName.equals(args[0])){
                    ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
                    command.execute();
                }
                if (commandName.equals(args[1]) || commandName.equals(args[2]) || commandName.equals(args[3])) {
                    ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
                    command.execute();
                }
                if (commandName.equals(args[5])) {
                    ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
                    command.execute();
                }
            }
            else break;
        }*/
    }
    public static void testStatic(){
        System.out.println("Executing test static...");
    }

    public static void changeState(ApplicationState newState, String commandName){
        if(currentState != null){
            currentState.exit();
        }
        currentState = newState;
        currentState.enter(commandName);
    }
}
