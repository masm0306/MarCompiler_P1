package marVM;

public class MarVM {
    public static void main(String[] args) {
        MarInterpreter i = new MarInterpreter();
        if(args.length > 1){
            if(args[1].equals("-debug"))
                i.debug = true;
        }
        i.readFile();
    }
}