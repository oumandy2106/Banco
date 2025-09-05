public class Main {
    public static void main(String[] args) {
        Banco persona1 = new Banco(0.0); // una sola vez
        Menu menu = new Menu();
        menu.mostrarMenu(persona1);
    }
}