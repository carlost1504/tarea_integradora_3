
package model;

public class Assistant extends Coach{
    private boolean player_professional;
    private int experticia;
    private Experticia experticia_enum;
    private double salary;
    private char group;

    /**
     * name:Assistant
     * @param player_professional
     * @param experticia
     * @param years_experience
     * @param Name
     * @param Id
     * @param Salary
     * @param activity
     * @param group 
     */
    public Assistant(boolean player_professional, int experticia, int years_experience, String Name, String Id, double Salary, boolean activity, char group) {
        super(years_experience, Name, Id, Salary, activity);
        this.player_professional = player_professional;
        this.experticia = experticia;
         this.group=group;
        salary = Salary;
        if(experticia==1){
            experticia_enum=Experticia.defensive;
        }
        if(experticia==2){
            experticia_enum=Experticia.lab_plays;
        }
        if(experticia==3){
            experticia_enum=Experticia.offensive;
        }
        if(experticia==4){
            experticia_enum=Experticia.possession;
        }
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
     * namw:isPlayer_professional
     * @return 
     */
    public boolean isPlayer_professional() {
        return player_professional;
    }

    /**
     * name:setPlayer_professional
     * @param player_professional 
     */
    public void setPlayer_professional(boolean player_professional) {
        this.player_professional = player_professional;
    }

    /**
     * nama:getExperticia
     * @return 
     */
    public int getExperticia() {
        return experticia;
    }

    /**
     * name:setExperticia
     * @param experticia 
     */
    public void setExperticia(int experticia) {
        this.experticia = experticia;
    }

    /**
     * name:getExperticia_enum
     * @return 
     */
    public Experticia getExperticia_enum() {
        return experticia_enum;
    }

    /**
     * name:setExperticia_enum
     * @param experticia_enum 
     */
    public void setExperticia_enum(Experticia experticia_enum) {
        this.experticia_enum = experticia_enum;
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
     * name:toString
     * @return 
     */
    @Override
    public String toString() {
        return "Assistant{" + "player_professional=" + player_professional
                + "\n, experticia=" + experticia
                + "\n, experticia_enum=" + experticia_enum
                + "\n, salary=" + salary
                + "\n, group=" + group + '}';
    }

    

    
    
    
}
