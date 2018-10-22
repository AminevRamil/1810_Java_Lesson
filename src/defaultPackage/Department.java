package defaultPackage;

import java.util.List;

public class Department {

    private String name;
    private Chief bigBoss;
    private List<Employee> staff;

    String getName(){
        return name;
    }

    Chief getBigBoss(){
        return bigBoss;
    }

    void setBigBoss(Chief newOne){
        bigBoss.dismission();
        bigBoss = newOne;
    }

}
