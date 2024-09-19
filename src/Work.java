public class Work {
    int WorkNumber;
    double WorkHours;
    {
        WorkNumber= 123;
        WorkHours= 2.5;
        System.out.println("This is the instance variable with unique data type from IIB:" + WorkNumber);
        System.out.println("This is the instance variable with any data type from IIB:" + WorkHours);
    }

    public Work(int WNumber,double WHours){
        this.WorkNumber=WNumber;
        this.WorkHours=WHours;

        System.out.println("This is the instance variable with unique data type from a constructor:" + WorkNumber);
        System.out.println("This is the instance variable with any data type from a constructor:" + WorkHours);

    }
    public int getWorkNumber(){
        return WorkNumber;
    }
    public double getWorkHours(){
        return WorkHours;
    }
}
