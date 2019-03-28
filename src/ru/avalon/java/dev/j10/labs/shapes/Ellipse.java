package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Абстрактное представление об эллипсе.
 * <p>
 * Э́ллипс — замкнутая кривая на плоскости, которая может
 * быть получена как пересечение плоскости и кругового
 * цилиндра или как ортогональная проекция окружности на
 * плоскость.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%AD%D0%BB%D0%BB%D0%B8%D0%BF%D1%81">Эллипс</a>
 */
public interface Ellipse extends Shape {

    /*
     * TODO: Закончить определение интерфейса 'Ellipse'
     *
     * 1. Включите интерфейс в общую систему типов.
     *
     * 2. При необходимости, дополните структуру интерфеса.
     */

    /**
     * Возвращает длину эллипса.
     *
     * @return длина эллипса
     */
    float getLength();
}
