// Базовый класс Employee - шаблон для всех сотрудников
class Employee {
    // protected - доступно в этом классе и во всех классах-наследниках
    // String - тип данных "строка" для хранения текста
    // name - переменная для хранения имени сотрудника
    protected String name;

    // protected - доступно в этом классе и наследниках
    // double - тип данных "дробное число" для хранения зарплаты
    // salary - переменная для хранения зарплаты сотрудника
    protected double salary;

    // Конструктор класса Employee - специальный метод для создания объектов
    // public - доступен из любого места программы
    // Employee - название совпадает с классом (это конструктор)
    // (String name, double salary) - параметры: имя и зарплата при создании объекта
    public Employee(String name, double salary) {
        // this.name - обращение к полю name ЭТОГО объекта (класса Employee)
        // = name - присваиваем значение из параметра name
        // this отличает поле класса от параметра метода с одинаковым названием
        this.name = name;

        // this.salary - поле salary ЭТОГО объекта
        // = salary - присваиваем значение из параметра salary
        this.salary = salary;
    }

    // Метод work() - описывает работу сотрудника
    // public - доступен из любого места
    // void - метод не возвращает никакого значения
    // work() - название метода без параметров
    public void work() {
        // System.out.println() - вывод текста в консоль
        // name + " выполняет общие задачи" - склеивание (конкатенация) строк:
        // берем значение name и добавляем текст " выполняет общие задачи"
        System.out.println(name + " выполняет общие задачи");
    }
}

// Подкласс Manager - наследует все от Employee и добавляет/изменяет поведение
// extends Employee - означает, что Manager является расширением класса Employee
// Manager получает все поля (name, salary) и методы (work) от Employee
class Manager extends Employee {
    // Конструктор класса Manager - для создания объектов типа Manager
    // public - доступен из любого места
    // Manager - название конструктора
    // (String name, double salary) - те же параметры, что и у родителя
    public Manager(String name, double salary) {
        // super() - вызов конструктора РОДИТЕЛЬСКОГО класса (Employee)
        // super(name, salary) - передаем параметры в конструктор Employee
        // ДОЛЖЕН быть первой строкой в конструкторе потомка
        super(name, salary);
    }

    // @Override - аннотация, указывающая что мы ПЕРЕОПРЕДЕЛЯЕМ метод родителя
    // Компилятор проверяет, что в родительском классе действительно есть такой метод
    @Override
    // Переопределенный метод work() - заменяет реализацию из класса Employee
    // public void work() - такая же сигнатура как у родителя
    public void work() {
        // Специфичная для Manager реализация метода work()
        // name - унаследованное поле от Employee (доступно благодаря protected)
        // " управляет командой" - действие, характерное для менеджера
        System.out.println(name + " управляет командой");
    }
}

// Подкласс Developer - также наследует от Employee
// extends Employee - Developer получает все от Employee
class Developer extends Employee {
    // Конструктор класса Developer
    // public Developer - конструктор для создания разработчиков
    // (String name, double salary) - параметры как у родителя
    public Developer(String name, double salary) {
        // super() - вызов конструктора родительского класса Employee
        // Передаем name и salary чтобы инициализировать унаследованные поля
        super(name, salary);
    }

    // @Override - указываем что переопределяем метод родителя
    @Override
    // Переопределенный метод work() - своя реализация для разработчика
    public void work() {
        // Специфичная для Developer реализация
        // name - унаследованное поле
        // " пишет код" - действие, характерное для разработчика
        System.out.println(name + " пишет код");
    }
}