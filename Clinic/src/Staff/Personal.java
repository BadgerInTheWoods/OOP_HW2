package Staff;

public abstract class Personal {

    protected String nameSurname;
    protected int age;
    public Personal(String nameSurname, int age){
        this.nameSurname = nameSurname;
        this.age = age;
    }

//    public Personal(){
//        this ("newstaffmember", 20);
//    }

    public void getinfo(){
        System.out.println(toString() + ", position = " + getType());
    }



    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name and surname = %s, age = %s", this.nameSurname, this.age);
    }
}
