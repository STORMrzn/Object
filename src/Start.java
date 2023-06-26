import java.util.SortedMap;

public class Start {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1= new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(1,2);
        Point p4 = new Point(1,1);
        System.out.println("Переопределите метод сравнения объектов по состоянию таким образом, " +
                "чтобы две точки считались одинаковыми тогда, " +
                "когда они расположены в одинаковых координатах.");
        System.out.println(p1.equals(p4));

        System.out.println("Переопределите метод клонирования, унаследованный от класса Object, " +
                "таким образом, чтобы при его вызове возвращался новый объект Точки, " +
                "значения полей которого будут копиями оригинальной Точки.");
        System.out.println(p2.clone()==p2);
        System.out.println(p2.clone().equals(p2));
        System.out.println(p2.clone().toString());

        System.out.println("Задание 3. Сравнение линий");
        System.out.println("Переопределите метод сравнения объектов по состоянию таким образом, " +
                "чтобы две линии считались одинаковыми в том случае, " +
                "если их начало и конец расположены в одинаковых точках.");
        Line l1=new Line(p1,p2);
        Line l2=new Line(p2,p3);
        Line l3=new Line(p4,p1);
        Line l4=new Line(p1,p2);
        Line l5=new Line(p1,p4);
        System.out.println(l1.equals(l4));
        //System.out.println(l1.equals(l5));координаты одни, но точки разные (объекты)

        System.out.println("Переопределите метод клонирования, унаследованный от класса Object, таким образом, " +
                "чтобы при его вызове возвращался новый объект Линии, " +
                "значения полей которого будут копиями оригинальной Линии " +
                "(т.е. необходимо выполнить глубокое копирование).");
        System.out.println(l2.clone()==l2);
        System.out.println(l2.clone().equals(l2));

        System.out.println("Задание 4. Сравнение ломаных линий");
        System.out.println("Переопределите метод сравнения объектов по состоянию таким образом, " +
                "чтобы две ломанные считались одинаковыми тогда, " +
                "когда все их точки совпадают.");

        PolyLine pl1= new PolyLine(p1,p2,p3);
        PolyLine pl2=new PolyLine(p1,p3,p4);
        PolyLine pl3= new PolyLine(p1,p2,p3);
        System.out.println(pl1.equals(pl3));
    }
}
