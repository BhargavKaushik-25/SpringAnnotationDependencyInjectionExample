package DependencyInjection1;

import org.springframework.stereotype.Component;

@Component
public class Java implements Subject{

    @Override
    public void getSubjectData() {
        System.out.println(" SUBJECT NAME:- JAVA");
        System.out.println(" J2EE");
        System.out.println(" SERVLET");
        System.out.println(" HIBERNATE");
        System.out.println(" SPRING");
    }
}
