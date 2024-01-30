package Abstraction;

class StudentA extends Marks{
    public StudentA(double mark1, double mark2, double mark3){
        super(mark1, mark2, mark3);
    }

    @Override
    public double getPercentage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}
