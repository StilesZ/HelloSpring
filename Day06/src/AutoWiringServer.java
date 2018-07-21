public class AutoWiringServer {

    private AutoWiringDAO autoWiring;

    public AutoWiringServer(AutoWiringDAO autoWiring) {
        System.out.println("auto");
        this.autoWiring = autoWiring;
    }

    public void setAutoWiringDAO(AutoWiringDAO autoWiring) {
        System.out.println("set");
        this.autoWiring = autoWiring;
    }

    public void say(String word){
       this.autoWiring.say(word);
    }
}
