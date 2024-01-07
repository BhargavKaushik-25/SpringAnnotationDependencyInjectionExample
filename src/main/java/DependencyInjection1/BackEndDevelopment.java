package DependencyInjection1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("JAVA")
public class BackEndDevelopment implements Development{
    // we are performing constructor injection
    private Java java;

    // we are providing Autowired for automatic dependency injection or to create object automatically
    @Autowired // virtual keyword which provide additional information related to your method or class
    public BackEndDevelopment(Java java) {
        this.java = java;
    }

    @Override
    public void getCourseData() {
        System.out.println(" COURSE TYPE:-BACKEND DEVELOPMENT");
        System.out.println(" COURSE DURATION:- 6 MONTHS");
        System.out.println(" --------------------------------- ");
    }

    @Override
    public void getSubjectInformation() {
        java.getSubjectData();
    }
}
