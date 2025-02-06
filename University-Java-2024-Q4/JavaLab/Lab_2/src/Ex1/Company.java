package Ex1;

public class Company {
    String name;
    String date_of_company;
    String bulstat;

    public Company(String name, String date, String bulstat){
        this.name = name;
        this.date_of_company = date;
        this.bulstat = bulstat;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

    public String getDate_of_company(){
        return this.date_of_company;
    }

    public void setDate_of_company(String new_date){
        this.date_of_company = new_date;
    }

    public String getBulstat(){
        return this.bulstat;
    }

    public void setBulstat(String new_bulstat){
        if(bulstat.length() == 10){
            System.out.println("Bulstat set to: "+bulstat);
            this.bulstat = new_bulstat;
        }
        else {
            System.out.println("Bulstat must be 10 characters long!");
        }
    }
}


