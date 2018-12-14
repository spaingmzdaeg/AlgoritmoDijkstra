/*

 * Sitio web: https://masfernandez.com/2013/04/16/algoritmo-bellman-ford-java/
 */
public class Prueba {
	public static void main(String[] args) {
		AlgoritmoDijkstra algDij = new AlgoritmoDijkstra("abcdef");
        algDij.agregarRuta('a','b', 3);
        algDij.agregarRuta('a','e', 6);
        algDij.agregarRuta('a','f',10);
        algDij.agregarRuta('b','c', 5);
        algDij.agregarRuta('b','e', 2);
        algDij.agregarRuta('c','d', 8);
        algDij.agregarRuta('c','e', 9);
        algDij.agregarRuta('c','f', 7);
        algDij.agregarRuta('d','f', 4);
        algDij.agregarRuta('e','f', 4);
        char inicio = 'a';
        char fin    = 'd';
        String respuesta = algDij.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta);
}
}
