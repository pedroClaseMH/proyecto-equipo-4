\# Pruebas del programa "Bucle".



\## 1. Pruebas de Caja Negra



Primera prueba:



El programa muestra correctamente números entre 0 y 10 con 5 decimales, para que puedan coincidir con el numero dado. 

Podemos observar al iniciar el programa que empieza a generar números como los siguientes ejemplos: 

Numero actual:8.41284

Numero actual:6.71477

Numero actual:7.01284

Numero actual:2.92962



Segunda prueba:



El programa correctamente hace que si el numero es distinto al numero dado debe de seguir generando números hasta coincidir e ir aumentando el contador.



Tercera prueba:



En el caso que el programa detecte que el numero dado coincide, este debe de mostrar el mensaje: "Salió el numero X en X intentos :D" y posteriormente finalizar su ejecución. 

Por ejemplo, en el caso del numero "3.14159", antes de finalizar el programa se muestra por pantalla en siguiente mensaje: "Salió el numero 3.14159 en 1028035 intentos :D".



\## 2. Pruebas de Caja Blanca



El programa tiene:



1 método main.

1 bucle while(true).

1 estructura if-else.

1 condición de salida (return).



El programa tiene dos posibles rutas:



Camino 1: (num != SALIDA)

1 Entra al while

2 Genera número

3 No coincide

4 Incrementa contador

5 Vuelve al while

6 Este camino se repite indefinidamente.



Camino 2: (num == SALIDA)

1 Entra al while

2 Genera número

3 Coincide con SALIDA

4 Muestra mensaje

5 Ejecuta return

6 Termina el programa



Complejidad Ciclomática: (M = Numero de dicisiones + 1)

M = 1 + 1 = 2





\## 3. Problemas detectados

Si la probabilidad de que salga exactamente el numero dado es extremadamente baja el programa podría tardar muchísimo o no terminar nunca.

