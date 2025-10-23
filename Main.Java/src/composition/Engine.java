package composition;
public class Engine {
    private String type;

    Engine(String type){
        this.type = type;
        System.out.println(type + " engine created");
    }
    void start(){
        System.out.println(" the engine is started ");
    }
    void stop(){
        System.out.println(" the engine is stopped ");
    }

}

class car{
    private String model;
    private Engine engine;

    car(String model, String engineType){
        this.model = model;
        this.engine = new Engine(engineType);

    }

    void startcar(){
        System.out.println(model + "  car starting  ");
        engine.start();
    }
    void stopcar(){
        System.out.println(model + "  car stoping  ");
        engine.stop();
    }
}

