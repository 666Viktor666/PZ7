public class Main {
    public static void main(String[] args) {
        // Тестируем сотрудников
        Employee emp1 = new Manager("Анна", 5000);
        Employee emp2 = new Developer("Иван", 3000);

        emp1.work();  // Анна управляет командой
        emp2.work();  // Иван пишет код

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