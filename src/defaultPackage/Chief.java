package defaultPackage;

class Chief extends Employee{

    Chief(String name){
        super(name);
    }

    @Override
    void doWork() {

    }

    @Override
    void dismission() {

    }

    void givingOrdersTo(Employee emp){
        emp.doWork();
    }

    void setSalaryToEmployee(Employee emp, Salary sal){
        emp.setSalary(sal);
    }
}
