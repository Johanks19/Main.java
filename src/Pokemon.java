abstract class Pokemon {
    protected String nombre;
    protected int nivel;

    public Pokemon(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public abstract void atacar();

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel);
    }
}
