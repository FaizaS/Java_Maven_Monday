import java.sql.SQLOutput;

public class TestVariables {


    public static void main(String[] args) {

        String name = "Faiza";
        int age = 37;

        int m = 1;
        double x = 0.5;
        int c = 15;
        double y = m * x + c;
        boolean isRaining = true;
        boolean happy = true;

        if (isRaining && happy)
        {
            System.out.println("It is raining and we're happy.");
        }
        else if (isRaining && !happy)
        {
            System.out.println("It is raining and we're not happy.");
        }
        else if (!isRaining || happy)
        {
            System.out.println("It is not raining and we're happy.");
        }
        else if (!isRaining || !happy){
            System.out.println("It is not raining and we're not happy.");
        }
        //System.out.println("Raining is "+ isRaining || happy =);

        System.out.println(isRaining && happy);
        System.out.println(isRaining && !happy);
        System.out.println(!isRaining && happy);
        System.out.println(!isRaining && !happy);

        System.out.println(m);
        System.out.println(x);
        System.out.println(c);
        System.out.println(y);

        System.out.println(name);
        System.out.println(age);
        System.out.println("The user's name is " + name + "." + " And their age is " + age + ".");
    }
}
