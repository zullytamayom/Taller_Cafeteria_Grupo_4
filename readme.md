# ☕ Taller: Sistema de Cafetería
## 👥 Equipo 4

- Luis Salgado
- David Rodriguez
- Zully Tamayo

---

## 🧩 Parte 1 — Preguntas y Respuestas

### ❓ Pregunta 1
**¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le asignas 3.50?**

**✅ Respuesta:**  
Se utiliza `double` porque los precios pueden tener valores decimales y se requiere precisión.  
Si se usa `int`, no es posible almacenar decimales. Al intentar asignar `3.50` a un `int`, se genera un error de compilación porque el tipo de dato no coincide.

---

### ❓ Pregunta 2
**¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese operador?**

**✅ Respuesta:**  
Se utilizó el operador relacional `>` para verificar si el subtotal es mayor a 30.000.  
Este operador devuelve un valor de tipo `boolean`, es decir, `true` o `false`.

---

### ❓ Pregunta 3
**¿En qué situación preferirías usar switch en lugar de una cadena de if-else? ¿Hay algún caso en este ejercicio donde el switch no sería la mejor opción?**

**✅ Respuesta:**  
El `switch` es más conveniente cuando todas las decisiones dependen de una sola variable y se comparan valores específicos.  
No sería la mejor opción si las condiciones son complejas o dependen de múltiples variables.

---

### ❓ Pregunta 4
**¿Qué ocurre si la condición del while nunca se vuelve falsa? ¿Cómo lo prevendrías en este caso?**

**✅ Respuesta:**  
Si la condición del `while` nunca se vuelve falsa, se genera un bucle infinito.  
Para prevenirlo, se debe asegurar que dentro del ciclo exista una actualización de variables que eventualmente haga que la condición deje de cumplirse.

---

### ❓ Pregunta 5
**¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en el orden de ejecución.**

**✅ Respuesta:**  
El `do-while` es más apropiado porque garantiza que el bloque de código se ejecute al menos una vez, incluso si la condición inicial es inválida.

La diferencia es que:
- `while` evalúa la condición antes de ejecutar el bloque.
- `do-while` ejecuta primero el bloque y luego evalúa la condición.

---

### ❓ Pregunta 6
**¿Por qué usas for aquí y no while? ¿Qué tiene el for que lo hace más conveniente cuando conoces el número de elementos?**

**✅ Respuesta:**  
Se usa `for` porque se conoce previamente la cantidad de elementos del arreglo.  
El `for` permite controlar de forma más clara el inicio, la condición y el incremento en una sola línea, lo que lo hace más ordenado y fácil de leer en estos casos.

---

### ❓ Pregunta 7
**¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error lógico? ¿Cómo los distingues?**

**✅ Respuesta:**

Se identificaron al menos 3 errores:

1 y 2 ❌ **Error de compilación:** el "5" se declara con int pero se usa comillas como string. Falta un ; .
3 ❌ **Error logico:** se usa un solo = en lugar de dos para comparar.
