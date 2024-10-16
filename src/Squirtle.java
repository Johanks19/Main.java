public class Squirtle extends Pokemon implements Nadador{

    public Squirtle(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " usa Pistola Agua.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}
