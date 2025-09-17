import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Por favor introduce el nombre del fichero que quieres editar?: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        iniciarEditor(nombre);
    }
    public static void iniciarEditor(String nombre) {
        try {
            ProcessBuilder pBloc = new ProcessBuilder("gnome-text-editor",nombre);
            Process p = pBloc.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}