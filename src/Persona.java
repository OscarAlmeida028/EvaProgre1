public class Persona {
    private int id;
    private String Nombre;
    private int edad;

    private int prioridad;
    private int amigos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getAmigos() {
        return amigos;
    }

    public void setAmigos(int amigos) {
        this.amigos = amigos;
    }

    public Persona(int id, String nombre, int edad, int prioridad, int amigos) {
        this.id = id;
        Nombre = nombre;
        this.edad = edad;
        this.prioridad = prioridad;
        this.amigos = amigos;
    }

    public String toString() {
        return (id + ", " + Nombre + ", " +
                edad+", " + prioridad + ", " + prioridad + "\n");
    }
}
