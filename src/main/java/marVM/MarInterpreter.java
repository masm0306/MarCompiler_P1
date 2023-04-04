package marVM;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Stack;

public class MarInterpreter {

    Stack<Double> stack = new Stack<>();
    String path = "input/input.marbc";
    boolean debug = false;
    DataInputStream dataInputStream;
    byte[] data;
    int current = 0;

    public void readFile(){
        try {
            dataInputStream =
                    new DataInputStream(
                            new FileInputStream(path));

            data = readBytes();
            if(debug) {
                for (byte b : data) {
                    System.out.print(b + " ");
                }
                System.out.println("\n");
            }
            interpret();
            dataInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    private byte[] readBytes() throws IOException {
        Path p = Paths.get(path);
        return Files.readAllBytes(p);
    }

    public void interpret(){
        while(current < data.length){
            nextByte();
            if(debug)
                println("                          stack: " + stack.toString());
        }
    }

    private void nextByte(){
        byte b = data[current];
        switch (b){
            case 1 -> dconst();
            case 2 -> add();
            case 3 -> sub();
            case 4 -> mult();
            case 5 -> div();
            case 6 -> neg();
            case 7 -> print();
            case 8 -> System.exit(1);
        }
        current++;
    }

    private void print(){
        if(debug)
            System.out.print("PRINT: ");
        System.out.println(stack.pop());
    }

    private void dconst(){
        byte[] number = new byte[8];
        for (int i = 0; i < 8; i++){
            number[i] = data[++current];
        }
        stack.push(ByteBuffer.wrap(number).getDouble());
        if(debug){
            println("DCONST " + ByteBuffer.wrap(number).getDouble());
        }
    }

    private void add(){
        Double right = stack.pop();
        Double left = stack.pop();
        stack.push(left + right);
        if(debug){
            println("ADD");
        }
    }

    private void sub(){
        Double right = stack.pop();
        Double left = stack.pop();
        if(false) {
            stack.push(left + right);
            if(debug) {
                println("SUB");
            }
        }
        else {
            stack.push(left - right);
            if(debug){
                println("SUB");
            }
        }

    }

    private void mult(){
        Double right = stack.pop();
        Double left = stack.pop();
        stack.push(left * right);
        if(debug){
            println("MULT");
        }
    }

    private void div(){
        Double right = stack.pop();
        Double left = stack.pop();
        stack.push(left / right);
        if(debug){
            println("DIV");
        }
    }

    private void neg(){
        Double value = stack.pop();
        stack.push(value = -value);
        if(debug){
            println("NEG");
        }
    }

    ////////////////////////////////////////////////////////////////
    //            For text file instead of byte file              //
    ////////////////////////////////////////////////////////////////

    public void readFileString(){
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("input.mar"));
            String line = reader.readLine();

            while (line != null) {
                nextInstruction(line);
                if(debug)
                    println(stack.toString());
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void nextInstruction(String line){
        String[] is = line.split(": ");
        switch (is[0]){
            case "DCONST" -> pushToStack(is[1]);
            case "ADD"    -> add();
            case "SUB"    -> sub();
            case "MULT"   -> mult();
            case "DIV"    -> div();
            case "UMINUS" -> neg();
            case "PRINT"  -> System.out.println(stack.pop());
            case "HALT"   -> System.exit(1);
        }
    }

    private void pushToStack(String num){
        stack.push(Double.parseDouble(num));
    }

    private void println(String s){
        System.out.print(s+"\n");
    }
}
