package ComponentAnnotation;

import org.springframework.stereotype.Component;

//we are providing this tag because spring will search only for this tag to create object of the class implicitly
//if we provide the name of the class then we have to use same name in the getBean()method otherwise if name not provided
//then we have to follow camelCase Character and provide the class name in getBean()method
@Component
public class VideoGame implements Game{
    @Override
    public void getGameInformation() {
        System.out.println("GAME NAME :- PUBG");
        System.out.println("SINGLE PLAYER CAN ALSO PLAY");
        System.out.println("---------------------------");
    }

    @Override
    public void getGameType() {
        System.out.println("GAME TYPE:- INDOOR");
    }
}
