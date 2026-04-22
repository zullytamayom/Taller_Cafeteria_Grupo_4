# EQUIPO 4
### Luis Salgado
### David Rodriguez
### Zully Tamayo

## Pregunta 1:
¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le asignas 3.50?
## Respuesta:
Porque los precios necesitan precisión  en este caso con int no logramos
tenerla. 
Sale un error ya que intenta guardar un número con decimales en una variable que solo acepta números enteros.


## Pregunta 2:
  Pregunta: ¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese operador? dame el testo de la respuesta
## Respuesta :
  Usé el operador relacional > para comparar si el subtotal era mayor a 30.000. Ese operador devuelve un valor de tipo boolean, es decir, true o false
## Pregunta 3:
## Respuesta :


## Pregunta 4: 
¿Qué ocurre si la condición del while nunca se vuelve falsa? ¿Cómo lo prevendrías en este caso?

## Respuesta:
Si la condición del bucle while nunca se vuelve falsa, se produce un bucle infinito.
Con una instrucción de actualización que modifique las variables de la condición.
## Pregunta 5:
Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en el orden de ejecución.
## Respuesta:
Es mas apropiado porque porque necesitamos evaluar por lo menos el primer valor que entra al bucle. Evalua primer el valor erroneo,
en el condicional if dentro del do, y alli mismo forzamos y simulamos que el cajero mete otro valor que si es valido.
