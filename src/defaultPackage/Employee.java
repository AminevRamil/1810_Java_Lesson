package defaultPackage;

abstract class Employee {
    private String name = "N/A";
    private String post = "N/A";
    private String office = "N/A";
    private int salary = 0;

    String getName(){
        return name;
    }

    String getPost(){
        return post;
    }

    String getOffice(){
        return office;
    }

    int getSalary(){
        return salary;
    }

    abstract void dismission();

    abstract void doWork();


}
