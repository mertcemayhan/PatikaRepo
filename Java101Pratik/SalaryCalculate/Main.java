package Java101Pratik.SalaryCalculate;

public class Main {
    public static void main(String[] args) {
        Employee kemal = new Employee("kemal",2000,45,1985);
        kemal.tax();
        kemal.bonus();
        kemal.raiseSalary();
        kemal.toString_();

    }
}
