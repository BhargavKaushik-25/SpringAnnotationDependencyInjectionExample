package DependencyInjection1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("UI")
public class FrontEndDevelopment implements Development{

    private JavaScript javaScript;

    // we are providing Autowired for automatic dependency injection
    @Autowired
    public FrontEndDevelopment(JavaScript javaScript) {
        this.javaScript = javaScript;
    }




    @Override
    public void getCourseData() {
        System.out.println(" COURSE TYPE:- FRONTEND DEVELOPMENT");
        System.out.println(" COURSE DURATION: - 3 MONTHS");
        System.out.println("----------------------------------");
    }

    @Override
    public void getSubjectInformation() {
        javaScript.getSubjectData();
    }
}
