/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase para generar todos los números primos de 1 hasta un número máximo
 * especificado por el usuario. Como algoritmo se utiliza la criba de Eratóstenes.
 
 * El algoritmo es bastante simple: Dado un vector de enteros empezando en 2, 
 * se tachan todos los múltiplos de 2. A continuación, se encuentra el siguiente 
 * entero no tachado y se tachan todos sus múltiplos. El proceso se repite hasta
 * que se pasa de la raíz cuadrada del valor máximo. Todos los números que queden 
 * sin tachar son números primos.
 *
 */
package jmsa.NumPrimos;

/**
 *
 * @author jmsa
 */

/*
Primeras mejoras
Parece evidente que nuestro método criba realiza tres funciones diferentes, 
por lo que de criba extraemos tres métodos diferentes. 
Además, buscamos un nombre más adecuado para la clase y eliminamos todos los 
comentarios innecesarios.
*/

/*
Un segundo intento.

 El código ha mejorado pero aún es algo más enrevesado de la cuenta: 
eliminamos la variable dim (nos vale esPrimo.length ), elegimos
identificadores más adecuados para los métodos y reorganizamos el
interior del método inicializar Candidatos (el antiguo inicializarCandidatos )
*/

/*
El bucle anidado de eliminarMultiplos podía eliminarse si usamos
un método auxiliar para eliminar los múltiplos de un número concreto.
Por otro lado, la raíz cuadrada que aparece en eliminarMultiplos
no queda muy claro de dónde proviene (en realidad, es el valor
máximo que puede tener el menor factor de un número no primo
menor o igual que N). Además, el +1 resulta innecesario.
*/


public class GeneraPrimos
{

    private static int dim;
    private static boolean esPrimo[];
    private static int primos[];

    public static int[] criba(int max)
    {
        if (max < 2)
        {
            return new int[0];  // Vector vacío
        } else
        {
            inicializarCandidatos(max);
            eliminarMultiplos();
            obtenerCandidatosNoEliminados();
            return primos;
        }
    }

    private static void inicializarCandidatos(int max)
    {
        int i;
        esPrimo = new boolean[max + 1];
        esPrimo[0] = esPrimo[1] = false;
        for (i = 2; i < esPrimo.length; i++)
        {
            esPrimo[i] = true;
        }
    }

    private static void eliminarMultiplos()
    {
        int i;
        for (i = 2; i < maxFactor(); i++)
        {
            if (esPrimo[i])
            {
                eliminarMultiplosDe(i);
            }
        }

    }
    
    private static int maxFactor()
    {
        return (int) Math.sqrt(esPrimo.length) + 1;
    }

    private static void eliminarMultiplosDe(int i)
    {
        int multiplo;
        for (multiplo = 2 * i; multiplo < esPrimo.length; multiplo += i)
        {
            esPrimo[multiplo] = false;
        }
    }

    private static void obtenerCandidatosNoEliminados()
    {
        int i, j, cuenta;
// Contar primos
        cuenta = 0;
        for (i = 0; i < dim; i++)
        {
            if (esPrimo[i])
            {
                cuenta++;
            }
        }
        // Rellenar el vector de números primos
        primos = new int[cuenta];
        for (i = 0, j = 0; i < dim; i++)
        {
            if (esPrimo[i])
            {
                primos[j++] = i;
            }
        }
    }
}