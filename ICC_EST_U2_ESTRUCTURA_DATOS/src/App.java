import Controllers.Stack;
import Controllers.StackG;
import Controllers.QueueG;
import Models.Persona;

public class App {
    public static void main(String[] args) {
        System.out.println("===== PILA ENTEROS  =====");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tamaño inicial: " + stack.size());
        System.out.print("Contenido: ");
        stack.printStack();
        stack.pop();
        System.out.println("Tamaño luego de pop: " + stack.size());
        System.out.print("Contenido: ");
        stack.printStack();

        System.out.println("\n===== PILA GENÉRICA =====");
        StackG<Integer> pilaG = new StackG<>();
        pilaG.push(10);
        pilaG.push(0);
        pilaG.push(-1);
        pilaG.push(5);
        System.out.println("Tamaño inicial: " + pilaG.size());
        System.out.print("Contenido: ");
        pilaG.printStack();
        pilaG.pop();
        System.out.println("Tamaño luego de pop: " + pilaG.size());
        System.out.print("Contenido: ");
        pilaG.printStack();

        System.out.println("\n===== COLA DE PERSONAS =====");
        QueueG<Persona> colaPersonas = new QueueG<>();
        colaPersonas.enqueue(new Persona("Juan"));
        colaPersonas.enqueue(new Persona("Maria"));
        colaPersonas.enqueue(new Persona("Pedro"));
        colaPersonas.enqueue(new Persona("David"));

        System.out.println("\n>> Persona atendida -> " + colaPersonas.dequeue());
        System.out.print(">> Cola actual: ");
        colaPersonas.printCola();

        Persona pB = colaPersonas.findByName("Juan");
        System.out.println(">> Persona encontrada -> " + (pB != null ? pB : "ninguna"));

        Persona pE = colaPersonas.deleteByName("Pedro");
        System.out.println(">> Persona eliminada -> " + (pE != null ? pE : "ninguna"));

        System.out.print(">> Cola final: ");
        colaPersonas.printCola();

        System.out.println("\n===== FIN DE LA EJECUCIÓN =====");
    }
}
