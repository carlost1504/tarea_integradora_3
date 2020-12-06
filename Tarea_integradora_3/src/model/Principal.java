
package model;
import java.util.ArrayList ;
public class Principal extends Coach implements Price{
    private int number_of_teams;
    private ArrayList<String> championships_won = new ArrayList<String>();
    private double salary;
    private char group;
    private int years_Experience;

    /**
     * name:Principal
     * @param number_of_teams
     * @param years_experience
     * @param Name
     * @param Id
     * @param Salary
     * @param activity
     * @param group 
     */
    public Principal(int number_of_teams, int years_experience, String Name, String Id, double Salary, boolean activity,char group) {
        super(years_experience, Name, Id, Salary, activity);
        this.number_of_teams = number_of_teams;
        this.group=group;
        years_Experience= years_experience;
    }
    /**
     * name:getGroup
     * @return 
     */
    public char getGroup() {
        return group;
    }

    /**
     * name:setGroup
     * @param group 
     */
    public void setGroup(char group) {
        this.group = group;
    }

    /**
     * name:getNumber_of_teams
     * @return 
     */
    public int getNumber_of_teams() {
        return number_of_teams;
    }

    /**
     * name:setNumber_of_teams
     * @param number_of_teams 
     */
    public void setNumber_of_teams(int number_of_teams) {
        this.number_of_teams = number_of_teams;
    }

    /**
     * name:getChampionships_won
     * @return 
     */
    public ArrayList<String> getChampionships_won() {
        return championships_won;
    }

    /**
     * name:setChampionships_won
     * @param championships_won 
     */
    public void setChampionships_won(ArrayList<String> championships_won) {
        this.championships_won = championships_won;
    }

    /**
     * name:getSalary
     * @return 
     */
    @Override
    public double getSalary() {
        return salary;
    }

    /**
     * name:setSalary
     * @param salary 
     */
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * name:getYears_Experience
     * @return 
     */
    public int getYears_Experience() {
        return years_Experience;
    }

    /**
     * name:setYears_Experience
     * @param years_Experience 
     */
    public void setYears_Experience(int years_Experience) {
        this.years_Experience = years_Experience;
    }

    /**
     * name:rentPrice
     * @return 
     */
    @Override
    public double rentPrice() {
        double price=0;
        price=(salary*10)+(years_Experience*100)+(championships_won.size()*50);
        return price;
    }
    
    /**
     * name:player_level
     * @return 
     */
    public double player_level(){
        double level=0;
        level=5+(championships_won.size()/10);
        return level;
    }

    /**
     * name:toString
     * @return 
     */
    @Override
    public String toString() {
        return "Principal{" + "number_of_teams=" + number_of_teams
                + "\n, championships_won=" + championships_won
                + "\n, salary=" + salary
                + "\n, group=" + group
                + "\n, years_Experience = "  + years_Experience 
                + "\n price in marcke = "+rentPrice()
                +"\n level the coachs = "+player_level() ;
    }
    
    
}
