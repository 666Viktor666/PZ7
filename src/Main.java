public class Main {
    public static void main(String[] args) {
        // Тестируем сотрудников
        Employee emp1 = new Manager("Анна",7000);
        Employee emp2 = new Developer("Иван", 4000);
        Employee emp3 = new Designer("Мария", 3500);

        emp1.work();  // Анна управляет командой
        emp2.work();  // Иван пишет код
        emp3.work();  // Мария рисует в Фигме

        // Тестируем фигуры
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();  // Рисуется круг
        shape2.draw();  // Рисуется прямоугольник

        // ↓↓↓ ДОБАВЬ ЗДЕСЬ ↓↓↓
        System.out.println("Новая фича из main ветки!");
        // ↑↑↑ ДОБАВЬ ЗДЕСЬ ↑↑↑
    }
}