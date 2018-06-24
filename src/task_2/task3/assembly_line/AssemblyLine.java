package task_2.task3.assembly_line;

import task_2.task3.assembly_line.line_step.ILineStep;
import task_2.task3.tank.IProduct;

public class AssemblyLine implements IAssemblyLine {

    private ILineStep lineStepFirst;
    private ILineStep lineStepSecond;
    private ILineStep lineStepThird;

    public AssemblyLine(ILineStep lineStepFirst, ILineStep lineStepSecond, ILineStep lineStepThird) {
        this.lineStepFirst = lineStepFirst;
        this.lineStepSecond = lineStepSecond;
        this.lineStepThird = lineStepThird;

        printInfo();
    }

    @Override
    public IProduct assembleProduct(IProduct iProduct) {
        printInfoStarted(iProduct);

        iProduct.instalFirstPart(lineStepFirst.buildProductPart());
        iProduct.instalSecondPart(lineStepSecond.buildProductPart());
        iProduct.instalThirdPart(lineStepThird.buildProductPart());

        printInfoFinished(iProduct);
        return iProduct;
    }

    private void printInfo(){
        System.out.println("Саздана сборочная линия");
    }

    private void printInfoStarted(IProduct iProduct){
        System.out.println("Сборка продукта \"" + iProduct.getClass().getSimpleName() + "\" начата");
    }

    private void printInfoFinished(IProduct iProduct){
        System.out.println("Сборка продукта \"" + iProduct.getClass().getSimpleName() + "\" завершена");
    }
}
