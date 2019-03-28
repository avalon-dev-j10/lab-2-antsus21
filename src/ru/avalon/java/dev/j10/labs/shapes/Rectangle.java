package ru.avalon.java.dev.j10.labs.shapes;
import java.lang.Math;
/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    
    private float a;        // длина
    private float b;        // ширина
    private float x;        // абсцисса
    private float y;        // ордината
    private int rotation;   // угол поворота
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    public Rectangle() {
        a = (float)(Math.random()*100); 
        b = (float)(Math.random()*100);
        x = (float)(Math.random()*100);
        y = (float)(Math.random()*100);
        rotation = (int)(360*Math.random());
    }
    
    // метод, возвращающий периметр
    @Override
    public float getPerimeter() {
        return (float)(2*(a+b));
    }
    // метод, возвращающий площадь
    @Override
    public float getArea() {
        return (float)(a*b);
    }
    // метод, возвращающий угол поворота
    @Override
    public int getRotation() {
        return rotation;
    }
    // метод, возвращающий х
    @Override
    public float getX() {
        return x;
    }
    // метод, возвращающий у
    @Override
    public float getY() {
        return y;
    }
    // метод, преобразующий и возвращающий строку
    @Override
    public String toString(){
        return " Прямоугольник. Периметр прямоугольника равен " + getPerimeter();
    }
    
}
