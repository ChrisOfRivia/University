package Test;

public class Main {
    public static void main(String[] args) {
        try{
            Person p = new Person(null);
            System.out.println(p.getName().equals("Joro"));
        } catch (PersonException e){
            e.printStackTrace();
        }


    }
}