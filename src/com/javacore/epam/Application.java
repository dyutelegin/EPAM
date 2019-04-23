package com.javacore.epam;

import com.javacore.epam.command.ACommand;
import com.javacore.epam.command.CommandRegistry;
import com.javacore.epam.common.ConsoleCanvas;
import com.javacore.epam.db.DataBase;
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
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

//    "SELECT id, firstName, lastName FROM Criminals";

    public static final String OP_GROUP = "^(SELECT|DELETE)";
    public static final String FLD_GROUP = "([*a-z-A-Z, ]+)";
    public static final String SPACE = "([\\s]+)";
    public static final String FROM_GROUP = "(FROM)";
    public static final String TBL_GROUP = "([a-zA-Z]+)$";

    public static final String ALLOWED_DOMAIN_NAMES = "^([a-zA-Z0-9]+\\.)+(com|de|ru)$";

    static public final String APP_NAME = "Steve";
    static public final String AUTHOR = "Telegin Dmitrii";
    static public final String VERSION = "0.0.0";
    static ApplicationState currentState;
    public static void main(String[] args) throws IOException {

 /*       String quaery = "SELECT *, id, firstName, lastName, numberofCrimes FROM Criminals";

        Pattern p = Pattern.compile(OP_GROUP + SPACE + FLD_GROUP + SPACE + FROM_GROUP + SPACE + TBL_GROUP);
        Matcher matcher = p.matcher(quaery);
        if (matcher.find()){
            System.out.println("Number of group: " + matcher.groupCount());
            for(int i=0, len = matcher.groupCount(); i<=len; i++){
                System.out.println("Group " + i + " : " + matcher.group(i));
            }
        }
   //    Регулярные выражения
  /*      List<String> list = new ArrayList<>();
        list.add("developer.apple.com");
        list.add("google.com");
        list.add("wrong.");
        list.add(".another");
        list.add("this is wrong domain name");
        list.add("facebook.com");
        list.add("nasa.gov");
        list.add("mail.ru");
        list.add("yandex.ru");
        list.add("hans.de");

        printList(list, ALLOWED_DOMAIN_NAMES);

 /*       List<String[]> records = DataBase.readDataFile("c:/1/criminal_data.tbl");

        Table table = new Table("Criminals", Arrays.asList(new String[]{"id", "name", "deceased"}));
        Record record = new Record(table);
        record.setValues(new String[]{"100", "Anthony Soprano", "false"});
        try {
            System.out.println(record.getInt("id"));
            System.out.println(record.getBoolean("deceased"));
        } catch (Record.FieldNotFoundExeption ex) {
            ex.printStackTrace();
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        System.out.println("All is ok, all exceptions have been caught!"); */

  /*      DataBase db = new DataBase();
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(1000);
                    db.select();
                }
                catch (InterruptedException e){
                }
            }
        };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                db.update();
            }
        };
        thread1.start();
        new Thread(runnable).start(); */
 /*       List<String> columns = new ArrayList<>();
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
        criminalTable.select("1"); */

 /*       List<String> result = criminalTable.selectField("id");
        for (String s: result){
            System.out.println(s);
        }*/

 /*       changeState(new StateIdle(), "Idle");
        String commandName = "test command";
        currentState.onCommand(commandName);
        for(int i = 0; i < 10; i++){
            currentState.onCommand(commandName + i);*/

/*        ProfileController controller = new ProfileController();
        controller.showProfile(1); */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String commandName = reader.readLine();
            ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
            for(String listCommand: args)
            if (!commandName.isEmpty()) {
                if(commandName.equals(args[0])){
                    command.execute();
                }
                if (commandName.equals(args[1]) || commandName.equals(args[2]) || commandName.equals(args[3])) {
                    command.execute();
                }
                if (commandName.equals(args[5])) {
                    command.execute();
                }
                if (commandName.equals(args[6])) {
                    command.execute();
                }
            }
            else break;
        }
    }
    public static void testStatic(){
        System.out.println("Executing test static...");
    }

    public static void printList(List<String> list){
        for (String s:list){
            System.out.println(s);
        }
    }

    public static void printList(List<String> list, String filter){
        for (String s: list){
            if(s.matches(filter)){
            System.out.println(s);
            }
    }
}

    public static void foreachCleanup(List<String> list, String filter){
        for (String s:list){
            if(!s.matches(filter)){
                list.remove(s);
            }
        }
    }


    public static void changeState(ApplicationState newState, String commandName){
        if(currentState != null){
            currentState.exit();
        }
        currentState = newState;
        currentState.enter(commandName);
    }
}
