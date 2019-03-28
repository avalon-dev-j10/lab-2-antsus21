package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    
    
    private float a;        // стороны
    private float b;        //
    private float c;        //треугольника
    private float x;        // абсцисса
    private float y;        // ордината
    private int rotation;   // угол поворота
    
    public Triangle(){
        a = (float) (40+Math.random()*60);
        b = (float) (40+Math.random()*60);
        c = (float) (40+Math.random()*60);
        x = (float) (40+Math.random()*60);
        y = (float) (40+Math.random()*60);
        rotation = (int) (360*Math.random());
    }
    
    // метод, возвращающий периметр
    @Override
    public float getPerimeter() {
        return a+b+c;
    }
    
    // метод, возвращающий площадь
    @Override
    public float getArea() {
        
        float p = (float) (0.5*(a+b+c)); // полупериметр треугольника
        return (float)(Math.sqrt(p*(p-a)*(p-b)*(p-c))); // Вычисление площади по формуле Герона
    }
    
    // метод, возвращающий поворот
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
        return " Треугольник. Периметр треугольника равен " + getPerimeter();}

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
