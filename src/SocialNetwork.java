import javax.swing.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class SocialNetwork{
    Queue<Persona> queue = new LinkedList() ; //alamacenar pacientes en espera de ser activados
    PriorityQueue<Persona> priorityQueue = new PriorityQueue<>(); //para alamacenar participantes segun su prioridad y segun su nivel de actividad
    Stack<Persona> pila = new Stack<>(); //para almacenar participantes eliminados recientemente

    Interfaz x = new Interfaz();

    public void DatosPredefinidos(){
        queue.add(new Persona(01,"Oscar", 19, 20, 5));
        queue.add(new Persona(01,"Jorge", 21, 10, 4));
        queue.add(new Persona(01,"Nico", 20, 18, 6));
        queue.add(new Persona(01,"David", 18, 11, 7));
        queue.add(new Persona(01,"Andres", 17, 13, 8));
        queue.add(new Persona(01,"Gabo", 22, 21, 9));
    }
    public void AgregarPersonaEspera(Persona p){
        queue.add(p);
    }

    public void AgregarPersonaActiva(){
        priorityQueue.add(queue.poll());
    }




    public void



    public void AgregarPaicente() {
        queue.add(x.CrearPaciente());
    }




}
