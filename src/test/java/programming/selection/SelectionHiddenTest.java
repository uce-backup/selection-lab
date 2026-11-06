package programming.selection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas ocultas para calificar: valores límite y casos que las pruebas visibles no cubren.
 * Se copian en src/test/java del proyecto del estudiante.
 */
class SelectionHiddenTest {

    private static final double DELTA = 0.01;

    @Test
    @DisplayName("A1. Valor límite: 7 aprueba y 6.99 reprueba")
    void passOrFailLimit() {
        assertEquals("Aprobado", Selection.passOrFail(7));
        assertEquals("Reprobado", Selection.passOrFail(6.99));
    }

    @Test
    @DisplayName("A2. El mayor en cualquier posición, con repetidos y negativos")
    void maxOfThreePositions() {
        assertEquals(9, Selection.maxOfThree(9, 3, 4));
        assertEquals(9, Selection.maxOfThree(3, 4, 9));
        assertEquals(5, Selection.maxOfThree(5, 5, 5));
        assertEquals(-1, Selection.maxOfThree(-1, -7, -3));
        assertEquals(8, Selection.maxOfThree(8, 8, 2));
    }

    @Test
    @DisplayName("A3. El cero")
    void signZero() {
        assertEquals("cero", Selection.sign(0));
    }

    @Test
    @DisplayName("A4. Positivo y cero quedan igual")
    void absolutePositiveAndZero() {
        assertEquals(4.2, Selection.absolute(4.2), DELTA);
        assertEquals(0.0, Selection.absolute(0), DELTA);
    }

    @Test
    @DisplayName("B1. Valores límite de cada letra")
    void letterGradeLimits() {
        assertEquals('A', Selection.letterGrade(9));
        assertEquals('B', Selection.letterGrade(8.99));
        assertEquals('B', Selection.letterGrade(8));
        assertEquals('C', Selection.letterGrade(7));
        assertEquals('D', Selection.letterGrade(6.99));
        assertEquals('D', Selection.letterGrade(5));
        assertEquals('F', Selection.letterGrade(4.99));
    }

    @Test
    @DisplayName("B2. Todos los días y valores inválidos")
    void dayNameAll() {
        assertEquals("Martes", Selection.dayName(2));
        assertEquals("Miércoles", Selection.dayName(3));
        assertEquals("Jueves", Selection.dayName(4));
        assertEquals("Viernes", Selection.dayName(5));
        assertEquals("Sábado", Selection.dayName(6));
        assertEquals("Inválido", Selection.dayName(0));
        assertEquals("Inválido", Selection.dayName(8));
    }

    @Test
    @DisplayName("B3. Febrero en años bisiestos y no bisiestos; meses inválidos")
    void daysInMonthFebruary() {
        assertEquals(29, Selection.daysInMonth(2, 2024));
        assertEquals(28, Selection.daysInMonth(2, 2026));
        assertEquals(28, Selection.daysInMonth(2, 1900));
        assertEquals(29, Selection.daysInMonth(2, 2000));
        assertEquals(30, Selection.daysInMonth(11, 2026));
        assertEquals(31, Selection.daysInMonth(12, 2026));
        assertEquals(0, Selection.daysInMonth(0, 2026));
        assertEquals(0, Selection.daysInMonth(13, 2026));
    }

    @Test
    @DisplayName("B4. Límites del envío: 1 kg, 3 kg exactos y urgente")
    void shippingCostLimits() {
        assertEquals(3.00, Selection.shippingCost(1.0, false), DELTA);
        assertEquals(5.40, Selection.shippingCost(3.0, false), DELTA);
        assertEquals(6.60, Selection.shippingCost(3.1, false), DELTA);
        assertEquals(8.10, Selection.shippingCost(2.3, true), DELTA);
        assertEquals(4.50, Selection.shippingCost(0.5, true), DELTA);
    }

    @Test
    @DisplayName("B5. Límites de las categorías del IMC")
    void bmiCategoryLimits() {
        assertEquals("Bajo peso", Selection.bmiCategory(18.49));
        assertEquals("Normal", Selection.bmiCategory(18.5));
        assertEquals("Sobrepeso", Selection.bmiCategory(25));
        assertEquals("Sobrepeso", Selection.bmiCategory(29.99));
        assertEquals("Obesidad", Selection.bmiCategory(30));
    }

    @Test
    @DisplayName("C1. Isósceles en cualquier orden e inválidos")
    void triangleTypeMore() {
        assertEquals("Isósceles", Selection.triangleType(5, 5, 8));
        assertEquals("Isósceles", Selection.triangleType(5, 8, 5));
        assertEquals("Isósceles", Selection.triangleType(8, 5, 5));
        assertEquals("Inválido", Selection.triangleType(1, 2, 3));
        assertEquals("Inválido", Selection.triangleType(1, 10, 2));
        assertEquals("Inválido", Selection.triangleType(0, 0, 0));
        assertEquals("Inválido", Selection.triangleType(-3, 4, 5));
    }

    @Test
    @DisplayName("C2. Límites de los bloques de la planilla")
    void electricityBillLimits() {
        assertEquals(1.50, Selection.electricityBill(0), DELTA);
        assertEquals(8.70, Selection.electricityBill(80), DELTA);
        assertEquals(10.50, Selection.electricityBill(100), DELTA);
        assertEquals(10.61, Selection.electricityBill(101), DELTA);
        assertEquals(21.50, Selection.electricityBill(200), DELTA);
        assertEquals(28.50, Selection.electricityBill(250), DELTA);
        assertEquals(0.0, Selection.electricityBill(-5), DELTA);
    }

    @Test
    @DisplayName("C3. Ejes, origen y los cuadrantes II y IV")
    void quadrantMore() {
        assertEquals("II", Selection.quadrant(-2, 3));
        assertEquals("IV", Selection.quadrant(2, -3));
        assertEquals("Origen", Selection.quadrant(0, 0));
        assertEquals("Eje X", Selection.quadrant(5, 0));
        assertEquals("Eje Y", Selection.quadrant(0, -4));
    }
}
