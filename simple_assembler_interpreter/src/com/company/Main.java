package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        String[] program = {"mov a 10","mov b a","dec a","dec a","jnz a -1","inc b", "inc b"};
        SimpleAssemblerInterpret sai = new SimpleAssemblerInterpret(program);
        sai.interpret();
    }
}

class SimpleAssemblerInterpret {
    String[] program;
    Map<String, Integer> variable = new HashMap<String, Integer>();

    SimpleAssemblerInterpret(String... program) {
        this.program = program;
    }

    public void interpret() {
        parseVariable();
        runInstruction();
        System.out.println(variable);
    }

    public void parseVariable() {

        for (int i = 0; i < program.length; i++) {
            String commandLine = program[i];

            int variableValue;
            String variableName;

            Pattern variableNamePattern = Pattern.compile("mov\\s(\\w*)\\s(-?[a-z0-9]*)");
            Matcher matcher = variableNamePattern.matcher(commandLine);

            if (matcher.find()) {
                // System.out.println(matcher.group(0));
                // System.out.println(matcher.group(1));
                // System.out.println(matcher.group(2));

                try {
                    variableValue = Integer.parseInt(matcher.group(2).trim());
                } catch(NumberFormatException e) {
                    String variableSecondName = matcher.group(2).trim();
                    variableValue = variable.get(variableSecondName);
                }

                variableName = matcher.group(1).trim();
                variable.put(variableName, variableValue);
            }
        }

    }

    public void runInstruction() {
        // String code = "inc 20";
        for (int i = 0; i < program.length; i++) {
            String commandLine = program[i];

            Pattern incPattern = Pattern.compile("inc\\s([a-z]*)");
            Pattern decPattern = Pattern.compile("dec\\s([a-z]*)");
            Matcher incMatcher = incPattern.matcher(commandLine);
            Matcher decMatcher = decPattern.matcher(commandLine);

            // Increment
            if (incMatcher.find()) {
                try {
                    String variableName = incMatcher.group(1).trim();
                    int value = variable.get(variableName);
                    variable.put(variableName, value + 1);
                } catch (NumberFormatException e) {
                    System.out.println("Format error in increment instruction");
                }
            }

            // Decrement
            if (decMatcher.find()) {
                try {
                    String variableName = decMatcher.group(1).trim();
                    int value = variable.get(variableName);
                    variable.put(variableName, value - 1);
                } catch (NumberFormatException e) {
                    System.out.println("Format error in decrement instruction");
                }
            }

        }


    }
}