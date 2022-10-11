package view;

import controller.Controller;
import model.Apple;
import model.Book;
import model.Cake;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void execute() {
        var entity1 = new Apple("red");
        entity1.setWeight(500);
        controller.add(entity1);

        var entity2 = new Book(50, "Test123");
        entity2.setWeight(-100);
        controller.add(entity2);

        var entity3 = new Cake("mango");
        entity3.setWeight(2000);
        controller.add(entity3);

        var filteredEntities = controller.getAllWithWeightGreaterThan();
        System.out.println(filteredEntities);
    }
}
