package defaultPackage;

abstract class Employee {
    private final String name;
    private String post;
    private String office;
    private Salary salary;

    Employee(String name){
        this.name = name;
        post = "N/A";
        office = "N/A";
        salary = new Salary();
    }

    abstract void dismission();

    abstract void doWork();

    String getName(){
        return name;
    }

    String getPost(){
        return post;
    }

    String getOffice(){
        return office;
    }

    Salary getSalary(){
        return salary;
    }

    void setPost(String post){
        this.post = post;
    }

    void setOffice(String office){
        this.office = office;
    }

    void setSalary(Salary salary){
        this.salary = salary;
    }




}
