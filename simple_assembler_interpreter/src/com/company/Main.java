package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        //String[] program = {"mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a"};
        String[] program = {"mov c 12","mov b 0","mov a 200","dec a","inc b","jnz a -2","dec c","mov a b","jnz c -5","jnz 0 1","mov c a"};
        SimpleAssemblerInterpret sai = new SimpleAssemblerInterpret(program);
        sai.interpret();
    }
}

class SimpleAssemblerInterpret {
    String[] program;
    Map<String, Integer> variable = new HashMap<String, Integer>();
    Map<String, Integer> tempVariable = new HashMap<String, Integer>();

    SimpleAssemblerInterpret(String... program) {
        this.program = program;
    }

    public void interpret() {
        runInstruction();
        System.out.println(variable);
    }


    public void movParseInstruction(String commandLine) {
        int variableValue;
        String variableName;

        Pattern variableNamePattern = Pattern.compile("mov\\s(\\w*)\\s(-?[a-z0-9]*)");
        Matcher matcher = variableNamePattern.matcher(commandLine);

        if (matcher.find()) {
            try {
                variableValue = Integer.parseInt(matcher.group(2).trim());
            } catch (NumberFormatException e) {
                String variableSecondName = matcher.group(2).trim();
                variableValue = variable.get(variableSecondName);
            }

            variableName = matcher.group(1).trim();
            variable.put(variableName, variableValue);
        }
    }

    public void incParseInstruction(String commandLine) {
        Pattern incPattern = Pattern.compile("inc\\s([a-z]*)");
        Matcher incMatcher = incPattern.matcher(commandLine);

        if (incMatcher.find()) {
            try {
                String variableName = incMatcher.group(1).trim();
                int value = variable.get(variableName);
                variable.put(variableName, value + 1);
            } catch (NumberFormatException e) {
                System.out.println("Format error in increment instruction");
            }
        }
    }

    public void decParseInstruction(String commandLine) {
        Pattern decPattern = Pattern.compile("dec\\s([a-z]*)");
        Matcher decMatcher = decPattern.matcher(commandLine);

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

    public void runInstruction() {
        for (int i = 0; i < program.length; i++) {
            String commandLine = program[i];
            // String commandLine = "mov a 100";

            movParseInstruction(commandLine);
            incParseInstruction(commandLine);
            decParseInstruction(commandLine);

            Pattern jnzPattern = Pattern.compile("jnz\\s([0-9a-z]?)\\s(-?[0-9a-z]*)");
            Matcher jnzMatcher = jnzPattern.matcher(commandLine);

            if (jnzMatcher.find()) {
                int variableValue = 0;
                int variableTempValue = 0;

                try {
                    variableTempValue = Integer.parseInt(jnzMatcher.group(1).trim());
                    if (tempVariable.containsKey("generated_name_" + i)) {
                        variableTempValue = tempVariable.get("generated_name_" + i);
                        if (variableTempValue > 0) {
                            tempVariable.put("generated_name_" + i, variableTempValue - 1);
                        }
                    } else {
                        if (variableTempValue > 0) {
                            tempVariable.put("generated_name_" + i, variableTempValue - 1);
                        } else {
                            tempVariable.put("generated_name_" + i, variableTempValue);
                        }
                    }

                    variableValue = variableTempValue;
                } catch (NumberFormatException e) {
                    String variableName = jnzMatcher.group(1).trim();
                    variableValue = variable.get(variableName);
                }

                int steps = Integer.parseInt(jnzMatcher.group(2));
                if (variableValue == 0) {
                    System.out.println("jnz goes 0 to the next instruction --->");
                } else if (steps < 0) {
                    System.out.println("jnz goes backward --->");
                    i = i - (Math.abs(steps) + 1);
                } else if (steps > 0) {
                    System.out.println("jnz goes forward --->");
                    i = i + (Math.abs(steps) - 1);
                }
            }





        }


    }
}