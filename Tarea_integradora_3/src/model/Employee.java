
package model;

public class Employee {
    private String Name;
    private String Id;
    private double Salary;
    private boolean activity;

    /**
     * name:Employee
     * @param Name
     * @param Id
     * @param Salary
     * @param activity 
     */
    public Employee(String Name, String Id, double Salary, boolean activity) {
        this.Name = Name;
        this.Id = Id;
        this.Salary = Salary;
        this.activity = activity;
    }

    /**
     * name:getName
     * @return 
     */
    public String getName() {
        return Name;
    }

    /**
     * name:setName
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * name:getId
     * @return 
     */
    public String getId() {
        return Id;
    }

    /**
     * name:setId
     * @param Id 
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * name:getSalary
     * @return 
     */
    public double getSalary() {
        return Salary;
    }

    /**
     * name:setSalary
     * @param Salary 
     */
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    /**
     * name:isActivity
     * @return 
     */
    public boolean isActivity() {
        return activity;
    }

    /**
     * name:setActivity
     * @param activity 
     */
    public void setActivity(boolean activity) {
        this.activity = activity;
    }
    
    
}
