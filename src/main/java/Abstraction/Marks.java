/*
We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
*/

package Abstraction;

public abstract class Marks {
    protected double mark1;
    protected double mark2;
    protected double mark3;

    abstract double getPercentage();

    public Marks(double mark1, double mark2, double mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
}
