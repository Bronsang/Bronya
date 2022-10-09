import java.util.ArrayList;

public class SchoolSystem implements ISignUp {
    public SchoolSystem(int big, int medium, int small) {
    }...
    public static void main(String[] args) throws Exception {
        IParams params = ISignUp.parse();//SchoolSystem.parse();
        SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params. getPlanSignUp ();
        for (int i = 0; i < plan.size(); i++) {
            sc. addStudent (plan.get(i));
        }
        sc.print();

    }