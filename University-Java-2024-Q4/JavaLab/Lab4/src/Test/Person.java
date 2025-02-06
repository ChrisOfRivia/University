package Test;

public class Person {
    private String name;

    Person(String name) throws PersonException {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) throws PersonException {
        if(name == null){
            throw new PersonException("Name cannot be null");
        }
        this.name = name;
    }

}
