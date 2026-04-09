//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Pessoa> banco = new ArrayList<>();
        banco.add(new Pessoa(1,"Alice", 19));
        banco.add(new Pessoa(2,"Camilly", 19));
        banco.add(new Pessoa(3,"João", 39));
        banco.add(new Pessoa(4,"Lucas", 20));
        banco.add(new Pessoa(5,"Rafa", 21));


        List<Pessoa> cache = new ArrayList<>();

        cache.add(new Pessoa());
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID");
        int id = sc.nextInt();
        boolean encontrada = false;


        while (true) {
            for (Pessoa pessoa : cache) {
                if (id == pessoa.getId()) {
                    System.out.println("Pessoa encontrada no cache: " + pessoa);
                    encontrada = true;

                }
        }
            if (!encontrada) {
                for (Pessoa pessoa : banco) {
                    if (id == pessoa.getId()) {
                        System.out.println("Pessoa buscada no banco e adicionada ao cache" + pessoa);
                        cache.add(pessoa);
                    }
                }
            }
            System.out.println("Digite outro ID");
            id = sc.nextInt();
        }
    }}