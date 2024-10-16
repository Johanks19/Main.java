public class Charizart extends Pokemon implements Volador{

    public Charizart(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " usa bola de fuego.");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
}
