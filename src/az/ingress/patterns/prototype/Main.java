package az.ingress.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mahammad","Niyazli",23);
        Employee employeeClone = employee.clone();

        System.err.println(employee);
        System.err.println(employeeClone);
    }
}
