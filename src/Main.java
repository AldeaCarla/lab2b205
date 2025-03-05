//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        System.out.println("Lista simplu inlantuita:");
        simpleList.listNodes();
        System.out.println("Suma valorilor: " + simpleList.sumNodes());
        System.out.println("Este sortata? " + simpleList.isSorted());
    }
}