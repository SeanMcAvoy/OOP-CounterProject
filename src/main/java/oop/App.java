package oop;

/**
 * 'Click' Counter
 *  Starter code for demonstrating a simple class.
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("\n*** Counter App ***");

        Counter myCounter = new Counter(10);
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.click();

        //Done - add call to reset() that you implement in Counter class
        System.out.println();
        myCounter.reset();

        //Done - add call to undo() that you implement in Counter class
        System.out.println();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.undo();
        //Done
        // Add a JUnit test method to test undo()

        //Done
        // Create a second Counter object, then
        // click() it once, undo() twice, click(), then display()
        // What count do you expect?

        System.out.println("\n====Counter2====");
        Counter myCounter2 = new Counter(10);
        myCounter2.click();
        myCounter2.undo();
        myCounter2.undo();
        myCounter2.click();
        myCounter2.display();//1

        //Testing if goes above limit
        myCounter2.reset();
        for (int i = 0; i < 13; i++)
        {
            myCounter2.click();
        }
        myCounter2.display();

    }

}
