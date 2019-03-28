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
    
    private final float a;        // длина
    private final float b;        // ширина
    private final float x;
    private final float y;
    private final int rotation;
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    public Rectangle() {
        a = (float)(2*Math.random()); 
        b = (float)(2*Math.random());
        x = (float)(2*Math.random());
        y = (float)(2*Math.random());
        rotation = (int)(360*Math.random());
    }
    
    @Override
    public float getPerimeter() {
        return (float)(2*(a+b));
    }

    @Override
    public float getArea() {
        return (float)(a*b);
    }

    @Override
    public int getRotation() {
        return rotation;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
    @Override
    public String toString(){
        return " Прямоугольник. Периметр прямоугольника равен " + getPerimeter();
    }
    
}
