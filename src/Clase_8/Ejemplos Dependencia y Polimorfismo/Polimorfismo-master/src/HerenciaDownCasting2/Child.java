package HerenciaDownCasting2;



public class Child<Persons> extends Parent {
    int age;

    // Performing overriding
    @Override
    void showMessage()
    {
        System.out.println("Child method is called");
    }


}
