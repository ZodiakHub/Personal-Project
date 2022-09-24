package hw16;

public class Account {
    private final String name;
    private Date date;
    private final String zodiac;

     public void printInfo() {
         System.out.println(this);

    }


    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getZodiac() {
        return zodiac;
    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", zodiac='" + zodiac + '\'' +
                '}';
    }

    public Account(String name, Date date, String zodiac) {
        this.name = name;
        this.date = date;
        this.zodiac = zodiac;


    }
}
