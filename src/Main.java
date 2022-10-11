import controller.Controller;
import repository.Repository;
import view.View;

public class Main {
    public static void main(String[] args) {
        var repository = new Repository();
        var controller = new Controller(repository);
        var view = new View(controller);

        view.execute();
    }
}