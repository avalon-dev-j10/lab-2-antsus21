package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle  implements Ellipse{
    
    private float x;      // абсцисса
    private float y;      // ордината
    private float r;      // радиус
    private int rotation; // угол поворота
    
    
    public Circle(){                    
        x = (float)(Math.random()*100);
        y = (float)(Math.random()*100);
        r = (float)(Math.random()*100);  
//        rotation = (int) (Math.random()*360);
    }
    // метод, возвращающий х
    @Override
    public float getX(){return x;}
    
    // метод, возвращающий у
    @Override
    public float getY(){return y;}
    

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    // метод, возвращающий длину окружности
    @Override
    public float getLength() {
        return (float)(2*Math.PI * r);
    }
    
    // метод, возвращающий площадь
    @Override
    public float getArea() {
        return (float)(Math.PI*r*r);
    }
    
    // метод, возвращающий угол поворота
    @Override
    public int getRotation() {
        return 0;
    }
    
    // метод, преобразующий и возвращающий строку
    @Override
    public String toString(){
        return " Круг. Длина окружности равна " + getLength();}
}
