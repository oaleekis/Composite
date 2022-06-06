
public class Principal {

    public static void main(String[] args) {
        EmployeeComposite CEO = new EmployeeComposite("Rich", "CEO");

        EmployeeComposite managerSales = new EmployeeComposite("João", "Head Sales");
        EmployeeComposite managerMarketing = new EmployeeComposite("Maria", "Head Marketing");
        CEO.add(managerSales);
        CEO.add(managerMarketing);

        EmployeeLeaf emp1 = new EmployeeLeaf("José", "Sales");
        EmployeeLeaf emp2 = new EmployeeLeaf("Pedro", "Sales");
        managerSales.add(emp1);
        managerSales.add(emp2);

        EmployeeLeaf emp3 = new EmployeeLeaf("Huguinho", "Marketing");
        EmployeeLeaf emp4 = new EmployeeLeaf("Zezinho", "Marketing");
        managerMarketing.add(emp3);
        managerMarketing.add(emp4);

        CEO.showDetails();
        System.out.println("Count subordinantes: " + CEO.getSubordinateCount());
        System.out.println("Count employees: " + CEO.getEmployeeCount());
    }
}
