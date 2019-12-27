//extends-делает доступным для данного класса всю инфу из класса Person
public class Developer extends  Person {


    public Developer(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public void Develop(String task){

        System.out.println("I'm doing the task: "+task+" now");
    }
    @Override
    public void changeId(){
        System.out.println("Developer!");
        depId++;
    }
}
