# Laboratorio: estructuras de selección

En este laboratorio completas doce métodos que toman decisiones con `if`, `if-else`,
decisiones en escalera, el operador ternario y `switch`. Cada método recibe datos y devuelve
el resultado con `return`.

## Objetivos

- Traducir reglas con condiciones a sentencias de selección.
- Ordenar correctamente las condiciones de una escalera y cuidar los valores límite.
- Usar `switch` para seleccionar entre valores fijos.
- Comprobar cada método con pruebas automáticas.

## Qué contiene el proyecto

```text
selection-lab/
├── README.md     este enunciado
├── pom.xml       configuración de Maven
└── src/
    ├── main/java/programming/selection/Selection.java      los métodos que completas
    ├── main/java/programming/selection/SelectionApp.java   programa de consola con menú (ya está hecho)
    └── test/java/programming/selection/SelectionTest.java  pruebas visibles
```

Solo modificas `Selection.java`. No cambies las pruebas ni los nombres, los parámetros o el
tipo de retorno de los métodos: el docente califica con estas pruebas y con otras adicionales.

## Requisitos

- **JDK 25 o superior.** `SelectionApp` lee y escribe en la consola con la clase `java.lang.IO`
  (`IO.println`, `IO.readln`), que existe desde Java 25. Con un JDK anterior, Maven se detiene
  con un mensaje que lo indica. En el IDE, configura el SDK del proyecto con un JDK 25 o superior.
- Maven 3.9 o superior (o el que trae el IDE).
- Al ejecutar `SelectionApp`, escribe un valor por línea y usa punto como separador decimal
  (`2.5`, no `2,5`).

## Cómo trabajar

1. Abre el proyecto en tu IDE desde el `pom.xml` y ejecuta las pruebas: al inicio fallan todas.
2. Elige un método, lee su comentario y escribe en papel sus **casos de prueba**, incluidos los
   **valores límite** (por ejemplo, la nota 7 exacta).
3. Completa el método. Dentro de un método puedes tener varios `return`: el primero que se
   ejecuta termina el método.
4. Ejecuta las pruebas. Cuando las de ese método pasen a verde, sigue con el siguiente.
5. Al final, ejecuta `SelectionApp` y prueba las opciones del menú.

## Los métodos

### Parte A ★

| Método | Devuelve | Ejemplo |
|---|---|---|
| `passOrFail(grade)` | `"Aprobado"` desde 7; si no, `"Reprobado"` | 8 → `"Aprobado"` |
| `maxOfThree(first, second, third)` | el mayor de tres enteros (sin `Math.max`) | 3, 9, 4 → 9 |
| `sign(number)` | `"positivo"`, `"negativo"` o `"cero"` | -2 → `"negativo"` |
| `absolute(value)` | el valor absoluto (sin `Math.abs`) | -3.5 → 3.5 |

### Parte B ★★

| Método | Devuelve | Ejemplo |
|---|---|---|
| `letterGrade(grade)` | `'A'` desde 9, `'B'` desde 8, `'C'` desde 7, `'D'` desde 5; si no, `'F'` | 8.2 → `'B'` |
| `dayName(day)` | `"Lunes"` … `"Domingo"`; otro número, `"Inválido"` (con `switch`) | 7 → `"Domingo"` |
| `daysInMonth(month, year)` | 30, 31, 28 o 29 (febrero de un año bisiesto); mes inválido, 0 | 2, 2024 → 29 |
| `shippingCost(weightKg, urgent)` | hasta 1 kg $3.00; cada kg adicional o fracción $1.20; urgente +50 % | 2.3, `false` → 5.40 |
| `bmiCategory(bmi)` | `"Bajo peso"`, `"Normal"`, `"Sobrepeso"` u `"Obesidad"` | 22.9 → `"Normal"` |

### Parte C ★★★

| Método | Devuelve | Ejemplo |
|---|---|---|
| `triangleType(sideA, sideB, sideC)` | `"Inválido"`, `"Equilátero"`, `"Isósceles"` o `"Escaleno"` | 3, 4, 5 → `"Escaleno"` |
| `electricityBill(consumptionKwh)` | cargo fijo $1.50; bloques de $0.09, $0.11 y $0.14 | 150 → 16.00 |
| `quadrant(x, y)` | `"Origen"`, `"Eje X"`, `"Eje Y"`, `"I"`, `"II"`, `"III"` o `"IV"` | -2, -3 → `"III"` |

## Pistas

- Sin números mágicos: cada umbral, tarifa o porcentaje va en una constante `final` con nombre
  al inicio del método (`final double PASSING_GRADE = 7.0;`, `final double BASE_COST = 3.00;`).
  Los valores de los `case` (días y meses) pueden quedar como números.
- En una escalera, cada `else` ya sabe que las condiciones anteriores no se cumplieron: no
  repitas `grade >= 8 && grade < 9`.
- `daysInMonth`: la condición del año bisiesto es la del laboratorio de expresiones.
- `shippingCost`: `(int) extraWeightKg` descarta los decimales; si sobra una fracción de kilo, se
  cobra un kilo más. `Math.ceil(extraWeightKg)` también sirve.
- `triangleType`: primero descarta los inválidos; luego, del caso más particular al más general.
- `electricityBill`: cada bloque cobra solo los kWh que caen en él; 250 kWh pagan 28.50.

## Entrega

Entrega el archivo `Selection.java` (o el proyecto completo, sin la carpeta `target/`) según
indique tu docente. Antes de entregar, comprueba que el proyecto compila y ejecuta `mvn test`.
