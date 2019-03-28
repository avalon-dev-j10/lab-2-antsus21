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
    
    private final float x;
    private final float y;
    private final float r;      //радиус
    private final int rotation;
    
        /*  TODO (Проверка№1 ЛР№2)
        - Добавить комментарии к полям и методам класса
        - Все переменные делать финализированными бесмысленно, данные параметры возможно
        понадобиться изменить при работе с ними. Например: координаты круга
        повотора, могут меняться, если мы будем перемещать фигуру по плоскости или поворачивать.
        - Значения random сделать в пределах до 100
    */
    
    public Circle(){
        x = (float)(Math.random());
        y = (float)(Math.random());
        r = (float)(Math.random());  
        rotation = (int) (Math.random()*360);
    }
    
    @Override
    public float getX(){return x;}
    
    
    @Override
    public float getY(){return y;}
    

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public float getLength() {
        return (float)(2*Math.PI * r);
    }

    @Override
    public float getArea() {
        return (float)(Math.PI*r*r);
    }

    @Override
    public int getRotation() {
        return rotation;
        
    /*  TODO (Проверка№1 ЛР№2)
        - У круга нет угла поворота
    */
    }
    
    @Override
    public String toString(){
        return " Круг. Длина окружности равна " + getLength();}
}
