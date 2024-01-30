package Abstraction;

class StudentB extends Marks{
    private double mark4;
    public StudentB(double mark1, double mark2, double mark3, double mark4){
        super(mark1, mark2, mark3);
        this.mark4 = mark4;
    }
    public double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4.0;
    }
}
