
package model;

public class Coach extends Employee{
    private int years_experience;

    /**
     * name:Coach
     * @param years_experience
     * @param Name
     * @param Id
     * @param Salary
     * @param activity 
     */
    public Coach(int years_experience, String Name, String Id, double Salary, boolean activity) {
        super(Name, Id, Salary, activity);
        this.years_experience = years_experience;
    }

    /**
     * name:getYears_experience
     * @return 
     */
    public int getYears_experience() {
        return years_experience;
    }

    /**
     * name:setYears_experience
     * @param years_experience 
     */
    public void setYears_experience(int years_experience) {
        this.years_experience = years_experience;
    }
    
    
    
    
    
}
