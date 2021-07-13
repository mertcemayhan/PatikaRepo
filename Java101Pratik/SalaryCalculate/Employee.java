package Java101Pratik.SalaryCalculate;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double tax = 0;
    double bonus = 0;
    double raiseSalary = 0;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        }
        return tax;
    }

    double bonus() {
        if (workHours > 40) {
            this.bonus = 30 * (this.workHours - 40);
        }
        return this.bonus;
    }

    void raiseSalary() {
        if (2021 - this.hireYear < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            this.raiseSalary = this.salary * 0.1;
        } else if (2021 - this.hireYear > 19) {
            this.raiseSalary = this.salary * 0.15;
        }
    }

    void toString_() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam Maaş : " + (this.salary + this.bonus + this.raiseSalary - this.tax));
    }

}
