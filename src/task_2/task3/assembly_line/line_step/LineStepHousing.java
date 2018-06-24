package task_2.task3.assembly_line.line_step;

import task_2.task3.tank.part.Housing;
import task_2.task3.tank.part.IProductPart;

public class LineStepHousing implements ILineStep {

    public LineStepHousing() {
        printInfo();
    }

    @Override
    public IProductPart buildProductPart() {
        IProductPart housing = new Housing();
        printInfoBuildProduct(housing);
        return housing;
    }

    private void printInfo(){
        System.out.println("Создан участок производства деталей - тип: \"Корпус\"");
    }

    private void printInfoBuildProduct(IProductPart iProductPart){
        System.out.println("Получаем деталь: " + iProductPart.getClass().getSimpleName());
    }
}
