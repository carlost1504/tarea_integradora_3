
package model;


public class Player extends Employee implements Price{
    private int number_shirt;
    private int number_goals;
    private int average_mark;
    private int tip_player;
    private Alignment tipPlayer;
    private double salary;
    private char group;
    
    /**
     * name:Player
     * @param number_shirt
     * @param number_goals
     * @param average_mark
     * @param tip_player
     * @param Name
     * @param Id
     * @param Salary
     * @param activity
     * @param group 
     */
    public Player(int number_shirt, int number_goals, int average_mark, int tip_player, String Name, String Id, double Salary, boolean activity,char group) {
        super(Name, Id, Salary, activity);
        this.number_shirt = number_shirt;
        this.number_goals = number_goals;
        this.average_mark = average_mark;
        this.tip_player = tip_player;
        this.group=group;
        salary = Salary;
        if(tip_player==1){
            tipPlayer=Alignment.goalkeeper;
        }
        if(tip_player==2){
            tipPlayer=Alignment.defender;
        }
        if(tip_player==3){
            tipPlayer=Alignment.midfielder;
        }
        if(tip_player==4){
            tipPlayer=Alignment.forward;
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
     * name:getNumber_shirt
     * @return 
     */
    public int getNumber_shirt() {
        return number_shirt;
    }

    /**
     * name:setNumber_shirt
     * @param number_shirt 
     */
    public void setNumber_shirt(int number_shirt) {
        this.number_shirt = number_shirt;
    }

    /**
     * name:getNumber_goals
     * @return 
     */
    public int getNumber_goals() {
        return number_goals;
    }

    /**
     * name:setNumber_goals
     * @param number_goals 
     */
    public void setNumber_goals(int number_goals) {
        this.number_goals = number_goals;
    }

    /**
     * name:getAverage_mark
     * @return 
     */
    public int getAverage_mark() {
        return average_mark;
    }

    /**
     * name:setAverage_mark
     * @param average_mark 
     */
    public void setAverage_mark(int average_mark) {
        this.average_mark = average_mark;
    }

    /**
     * name:getTip_player
     * @return 
     */
    public int getTip_player() {
        return tip_player;
    }

    /**
     * name:setTip_player
     * @param tip_player 
     */
    public void setTip_player(int tip_player) {
        this.tip_player = tip_player;
    }

    /**
     * name:getTipPlayer
     * @return 
     */
    public Alignment getTipPlayer() {
        return tipPlayer;
    }

    /**
     * name:setTipPlayer
     * @param tipPlayer 
     */
    public void setTipPlayer(Alignment tipPlayer) {
        this.tipPlayer = tipPlayer;
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
     * name:rentPrice
     * @return 
     */
    @Override
    public double rentPrice() {
        double price=0;
        if(tipPlayer==Alignment.goalkeeper){
            price=(salary*12)+(average_mark*150);
        }
        if(tipPlayer==Alignment.defender){
            price=(salary*13)+(average_mark*125)+(number_goals*100);
        }
        if(tipPlayer==Alignment.midfielder){
            price=(salary*14)+(average_mark*135)+(number_goals*125);
        }
        if(tipPlayer==Alignment.forward){
            price=(salary*15)+(average_mark*145)+(number_goals*150);
        }
        return price;
    }
    
    /**
     * name:player_level
     * @return 
     */
    public double player_level(){
        double level=0;
        if(tipPlayer==Alignment.goalkeeper){
            level=(average_mark*0.9);
        }
        if(tipPlayer==Alignment.defender){
            level=(average_mark*0.9)+(number_goals/100);
        }
        if(tipPlayer==Alignment.midfielder){
            level=(average_mark*0.9)+(number_goals/90);
        }
        if(tipPlayer==Alignment.forward){
            level=(average_mark*0.9)+(number_goals/80);
        }
        return level;
    }

    /**
     * name:toString
     * @return 
     */
    @Override
    public String toString() {
        return "Player{" + "number_shirt=" + number_shirt
                + "\n, number_goals=" + number_goals
                + "\n, average_mark=" + average_mark
                + "\n, tip_player=" + tip_player
                + "\n, tipPlayer=" + tipPlayer
                + "\n, salary=" + salary
                + "\n, group=" + group
                + "\n price in market the player is ="+ rentPrice()
                +"\n level the player ="+ player_level() +'}';
    }
    

    
    
    
}
