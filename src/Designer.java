// Новый класс Designer в систему сотрудников
class Designer extends Employee {
    public Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " создает дизайн");
    }
}
