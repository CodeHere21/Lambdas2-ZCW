public class LambdaExpression {
    //private CheckPerson lambda =person ->person.getAge() >21 && person.getGender() == Person.Sex.FEMALE;
    public static CheckPerson tester;

    static { tester = (p)->p.getAge() > 4 && p.getGender()== Person.Sex.FEMALE;}

    public CheckPerson getLambda(){
        return tester;
    }

}
