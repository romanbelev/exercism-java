package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        //String[] program = {"mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a"};
        String[] program = {"mov a -10", "mov b a", "inc a", "dec b", "jnz a -2"};
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
            Pattern jnzPattern = Pattern.compile("jnz\\s([a-z]?)\\s(-?[0-9]*)");
            Matcher incMatcher = incPattern.matcher(commandLine);
            Matcher decMatcher = decPattern.matcher(commandLine);
            // String command = "jnz a -1";
            Matcher jnzMatcher = jnzPattern.matcher(commandLine);

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

            // Jnz jnz a -1
            if (jnzMatcher.find()) {
                String variableName = jnzMatcher.group(1).trim();
                int variableValue = variable.get(variableName);
                int steps = Integer.parseInt(jnzMatcher.group(2));
                // System.out.println(variableValue);

                if (variableValue == 0) {
                    System.out.println("jnz goes 0 to the next instruction --->");
                } else if (steps < 0) {
                    System.out.println("jnz goes backward --->");
                    i = i - (Math.abs(steps) + 1);
                } else if (steps > 0) {
                    System.out.println("jnz goes forward --->");
                    i = i + (Math.abs(steps) - 1);
                }

                // System.out.println(jnzMatcher.group(2));
            }



        }


    }
}