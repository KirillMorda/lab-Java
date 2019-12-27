public class Employ {
    String FirstName;
    String LastName;
    //конструктор с параматерами
    Employ(String FirstName, String LastName){
    this.FirstName = FirstName;
    this.LastName = LastName;

    }
    public String getInfo(){

        String result="My name is "+FirstName+" "+LastName;
        return result;
    }
    public void work(int hour){
        System.out.println("I'm gonna work "+ hour+" hours!!!");

    }
    public void work(int hours, long mseconds){


    }

}
