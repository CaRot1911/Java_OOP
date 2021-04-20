class Date{
    private int day;
    private int month;
    private int years;
    public Date(int day,int month,int years){
        this.day =day;
        this.month = month;
        this.years = years;
    }
    public void setDate(int day,int month,int years){
        this.day=day;
        this.month=month;
        this.years =years;
    }
    public void setDay(int day){
           this.day = day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYears(int years){
        this.years = years;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYears(){
        return years;
    }
    public void display(){
        String day = this.day+"";
        String month = this.month+"";
        String years=this.years+"";
        if(day.length()==1){
            day = "0"+day;
        }
        if (month.length()==1){
            month = "0"+month;
        }
        System.out.println(day+"/"+month+"/"+years);
    }
}
public class B16 {
    public static void main(String[] args) {
        Date d = new Date(10,9,2019);
        d.display();
    }
}
