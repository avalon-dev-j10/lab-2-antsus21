package ru.avalon.java.dev.j10.labs;


import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        
        for(int j=0; j<10; j++){
        int rand = (int) (Math.random()*3);
         
            switch(rand){
                case 0:
                shapes[j] = new Circle();
                break;
                case 1:
                shapes[j] = new Rectangle();
                break;                
                default:
                shapes[j] = new Triangle();
            }
        }
        
        
        Shape maxS = shapes[0];
        for (int j =1; j<10; j++) {
            System.out.println(shapes[j] + " Площадь = " + shapes[j].getArea());
            if (shapes[j].getArea() > maxS.getArea()) {
                maxS = shapes[j];
            }
        }
        
        System.out.println("______________________________________________________________________________________________________");
        System.out.println("Фигура с большей площадью -" + maxS + " Площадь: " + maxS.getArea());
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
}
