package application;

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2074");
        c.processDoc("My new history of my life.");
        c.print("Roadmap of java");
        System.out.println("Scan result: " + c.scan());

    }
}