package cl.praxis.model;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===============================================");
        System.out.println("\n>=============<MIRANDO EL PASADO>=============<");
        System.out.println("\n===============================================");
        System.out.println("\n");
        System.out.println("\n\t---------Ejercicio N°1: Marcas----------\n\t");
        verMarca();
        System.out.println("\n==================================================");
        System.out.println("\n\t---------Ejercicio N°2: Invitados----------\n\t");
        verInvitados();
        System.out.println("\n===============================================");
        System.out.println("\n\t---------Ejercicio N°3: Dulces----------\n\t");
        verPreciosDulces();
        System.out.println("\n===============================================");
        System.out.println("\n\t---------Ejercicio N°4: Juegos----------\n\t");
        verJuegos();




    }

    private static void verMarca() {
        //Se agregan Arraylist y se muestran las marcas agregadas.
        ArrayList marcas = new ArrayList<>();
        ArrayList posiblesMarcas = new ArrayList<>();
        marcas.add("Salo");
        marcas.add("Esso");
        marcas.add("Hucke");
        marcas.add("Burger Inn");
        marcas.add("Ekono");
        marcas.add("Feria del Disco");
        marcas.add("Kodak");
        marcas.add("Otto Kraus");
        marcas.add("Metropolis");
        marcas.add("Cocilamp");

        System.out.println(marcas);
        // Se agrega las opciones de amiga.
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        System.out.println(marcas);
        // Se corrige la marca "Blokbaster"
        marcas.set(10, "Blockbuster");
        System.out.println(marcas);

        // Se elimina la marca "Carrefour"
        marcas.remove(11);
        System.out.println(marcas);

        // Marcas que podrían estar fuera del mercado
        posiblesMarcas.add("Huawei");
        posiblesMarcas.add("Djon");
        posiblesMarcas.add("Panasonic");
        marcas.addAll(posiblesMarcas);

        //Número de elementos que posee la lista final
        System.out.println("\nLista final: \n" + marcas);
        System.out.printf("\nLa lista actual posee %s marcas", marcas.size());
    }

    private static void verInvitados() {
        // Se agrega metodo TreeSet y listado solicitado.
        Set<String> invitados = new TreeSet<>();
        Set<String> posiblesInvitados = new TreeSet<>();
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        //Listado de Amigos solicitado.
        System.out.println(invitados);

        //Compañeros que no cain bien a amiga en listado aparte.
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);
        System.out.println(invitados);

        // Se excluye a Jorge por ser el Ex de la amiga terminaron en mala.
        invitados.remove("Jorge");
        System.out.println(invitados);
    }

    private static void verPreciosDulces() {
        // Se agregas metodo TreeMap y listado solicitado.
        Map<String, Integer> golosinas = new TreeMap<>();
        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-Miti", 30);
        golosinas.put("Traga-Traga", 150);
        golosinas.put("Tabletón", 5);

        // Se filtran golosinas que cuestan menos de $100 para RRSS de amiga.
        Map<String, Integer> filtrarGolosinas = new TreeMap<>();
        System.out.println("Golosinas que costaban menos de $100: \n");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
                System.out.println(entry.getKey() + " $"+ entry.getValue() + ".");
            }
        }
    }

    private static void verJuegos(){
        // Se usa metodo LinkedList para encolar y se agregan los items.
        Queue<String> juegos = new LinkedList<>();

        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        //Se imprime la cantidad de juegos y se imprimen los items aparte.
        System.out.printf("La cantidad de juegos corresponden a %s en total.\n", juegos.size());
        System.out.println("\nEl listado de juegos es el siguiente: \n" + juegos);

    }



}
