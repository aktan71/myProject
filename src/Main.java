import OOP.Computer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Computer comp = new Computer();
        Computer compOne = new Computer();

        comp.setName("intel");
        comp.setHdd(444);
        compOne.setHdd(322);
        System.out.println(comp.getHdd());
        comp.on();
        comp.load();
        comp.off();
      
    }

        }

