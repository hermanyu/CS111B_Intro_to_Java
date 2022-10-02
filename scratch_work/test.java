import customClasses.oneClass;
import customClasses.twoClass;

class myProgram{
    public static void main(String[] args){
        System.out.println("This is myProgram's main method. I will call in the other classes and their methods now!");
        oneClass.execute();
        twoClass.execute();
    }
}