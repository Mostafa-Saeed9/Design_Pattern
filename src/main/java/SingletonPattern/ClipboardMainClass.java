
package SingletonPattern;
public class ClipboardMainClass {
    public static void main(String[] args) {

        /*
         Clipboard clipboard1 = new Clipboard();
        Clipboard clipboard2 = new Clipboard();

        clipboard1.copy("Java");
        clipboard2.copy("Design patterns");

        System.out.println(clipboard1.paste()); // output: Java
        System.out.println(clipboard2.paste()); // output: Design patterns
        */

        // Getting the singleton instances
        Clipboard clipboard1 = Clipboard.getInstance();
        Clipboard clipboard2 = Clipboard.getInstance();

        clipboard1.copy("Java");
        clipboard2.copy("Design patterns");

        System.out.println(clipboard1.paste());
        System.out.println(clipboard2.paste());
    }
}
