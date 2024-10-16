//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Charizart charizard = new Charizart("Charizart", 50);
        charizard.mostrarInfo();
        charizard.atacar();
        charizard.volar();

        System.out.println();

        Squirtle squirtle = new Squirtle("Squirtle", 25);
        squirtle.mostrarInfo();
        squirtle.atacar();
        squirtle.nadar();

    }
}