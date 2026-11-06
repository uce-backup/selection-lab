package programming.selection;

/**
 * Laboratorio de estructuras de selección. Completa el cuerpo de cada método con if, if-else,
 * decisiones en escalera, el operador ternario o switch, y devuelve el resultado con return.
 * <p>
 * Cada método tiene pruebas en src/test/java. Ejecútalas con "mvn test" o desde el IDE.
 * Mientras un método no esté completo, sus pruebas fallan: es lo esperado.
 */
public class Selection {

    // ---------------------------------------------------------------- Parte A ★

    /**
     * A1. "Aprobado" si la nota es 7 o más; si no, "Reprobado".
     */
    public static String passOrFail(double grade) {
        final double PASSING_GRADE = 7.0;
        return grade >= PASSING_GRADE ? "Aprobado" : "Reprobado";
    }

    /**
     * A2. El mayor de tres enteros, sin usar Math.max.
     */
    public static int maxOfThree(int first, int second, int third) {
        int largest = first;
        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }
        return largest;
    }

    /**
     * A3. "positivo", "negativo" o "cero".
     */
    public static String sign(int number) {
        if (number > 0) {
            return "positivo";
        } else if (number < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }

    /**
     * A4. El valor absoluto de un número, sin usar Math.abs.
     */
    public static double absolute(double value) {
        return 0; // TODO
    }

    // ---------------------------------------------------------------- Parte B ★★

    /**
     * B1. 'A' desde 9, 'B' desde 8, 'C' desde 7, 'D' desde 5; si no, 'F'.
     */
    public static char letterGrade(double grade) {
        return ' '; // TODO
    }

    /**
     * B2. "Lunes" para 1, …, "Domingo" para 7; cualquier otro número, "Inválido". Usa switch.
     */
    public static String dayName(int day) {
        return ""; // TODO
    }

    /**
     * B3. Días del mes (1 a 12) en el año dado: abril, junio, septiembre y noviembre tienen 30;
     * febrero, 29 si el año es bisiesto y 28 si no; los demás, 31. Un mes inválido devuelve 0.
     */
    public static int daysInMonth(int month, int year) {
        return 0; // TODO
    }

    /**
     * B4. Costo de un envío: hasta 1 kg, $3.00; cada kg adicional o fracción, $1.20.
     * Si es urgente, el costo sube 50 %. Ejemplo: 2.3 kg normal → 3.00 + 2 × 1.20 = 5.40.
     */
    public static double shippingCost(double weightKg, boolean urgent) {
        return 0; // TODO
    }

    /**
     * B5. Categoría del IMC: menos de 18.5 "Bajo peso"; menos de 25 "Normal"; menos de 30 "Sobrepeso"; si no, "Obesidad".
     */
    public static String bmiCategory(double bmi) {
        return ""; // TODO
    }

    // ---------------------------------------------------------------- Parte C ★★★

    /**
     * C1. Tipo de triángulo: "Inválido" si algún lado no es positivo o los lados no forman un
     * triángulo; si no, "Equilátero" (tres lados iguales), "Isósceles" (dos) o "Escaleno" (ninguno).
     */
    public static String triangleType(double sideA, double sideB, double sideC) {
        return ""; // TODO
    }

    /**
     * C2. Planilla de luz: cargo fijo $1.50; los primeros 100 kWh a $0.09, del 101 al 200 a $0.11 y
     * desde el 201 a $0.14 (cada bloque cobra solo los kWh que caen en él). Consumo negativo: 0.
     */
    public static double electricityBill(int consumptionKwh) {
        return 0; // TODO
    }

    /**
     * C3. Ubicación del punto (x, y): "Origen", "Eje X" (sobre el eje x), "Eje Y" (sobre el eje y),
     * o el cuadrante "I", "II", "III" o "IV".
     */
    public static String quadrant(double x, double y) {
        return ""; // TODO
    }
}
