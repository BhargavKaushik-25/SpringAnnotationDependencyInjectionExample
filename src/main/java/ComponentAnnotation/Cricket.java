package ComponentAnnotation;

import org.springframework.stereotype.Component;

//we are providing this tag because spring will search only for this tag to create object of the class implicitly
//if we provide the name of the class then we have to use same name in the getBean()method otherwise if name not provided
//then we have to follow camelCase Character and provide the class name in getBean()method
@Component("cricket")
public class Cricket implements Game{
    @Override
    public void getGameInformation() {
        System.out.println("GAME NAME IS :- CRICKET");
        System.out.println("AT LEAST 22 PLAYER NEEDED ");
        System.out.println("----------------------------");
    }

    @Override
    public void getGameType() {
        System.out.println("GAME TYPE:- OUTDOOR");
    }
}
