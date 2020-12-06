package model;
import java.util.*;

public class Club {
    private String name;
    private String NIT;
    private String creation_date;
    private ArrayList<Employee> employee = new ArrayList<Employee>();
    private Team team;
    private int [][] locker_room1 =new int[7][7];
    private int [][] locker_room2= new int[7][6];
    private Player [][] locker_Room1 =new Player[7][7];
    private Player [][] locker_Room2= new Player[7][6];
    private Coach[][] coach=new Coach[6][6];
    private int[][] coacH=new int[6][6];

    /**
     * name:Club
     * @param name
     * @param NIT
     * @param creation_date 
     */
    public Club(String name, String NIT, String creation_date) {
        this.name = name;
        this.NIT = NIT;
        this.creation_date = creation_date;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                locker_room1[i][j]=0;
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                locker_room2[i][j]=0;
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                coacH[i][j]=0;
            }
        }
    }
    
    /**
     * name:add_ofice
     * @param Id
     * @return 
     */
    public boolean add_ofice(String Id){
        boolean add=false;
        Coach[] coachh=new Coach[8];
        for (int i = 0; i < 6; i++) {
            coachh[i]=team.getSub_coachs()[i];
        }
        for (int i = 5; i < 8; i++) {
            coachh[i]=team.getCoach_pri()[i];
        }
        for (int i = 0; i < 6; i+=2) {
            for (int j = 0; j < 6; j+=2) {
                if(coacH[i][j]==0){
                    for (int x = 0; x < coach.length; x++) {
                        if(coachh[x].getId().equals(Id)){
                            coacH[i][j]=1;
                            coach[i][j]=coachh[x];
                        }
                    }
                }
            }
        }
        return add;
    }
    /**
     * name:cleanCoachsTo_locker
     * @return 
     */
    public boolean cleanCoachsTo_locker(){
        boolean clean=false;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                coacH[i][j]=0;
                coach[i][j]=null;
                clean=true;
            }
        }
        return clean;
    }
    
    /**
     * name:clean_one_CoachsTo_locker
     * @param Id
     * @return 
     */
    public boolean clean_one_CoachsTo_locker(String Id){
        boolean clean=false;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(coach[i][j].getId().equals(Id)){
                    coacH[i][j]=0;
                    coach[i][j]=null;
                    clean=true;
                }
            }
        }
        return clean;
    }
    
    /**
     * name:add_playerTo_locker1
     * @param number_shirt
     * @param group
     * @return 
     */
    public boolean add_playerTo_locker1(int number_shirt,char group){
        boolean add=false;
        Player[] player=team.getPlayer();
        
        for (int i = 0; i < 7; i+=2) {
            for (int j = 0; j < 7; j+=2) {
                if(locker_room1[i][j]==0){
                    for (int x = 0; x < player.length; x++) {
                        if(player[x].getNumber_shirt()==number_shirt&&player[x].getGroup()==group){
                            for (int p = 0; p < 7; p++) {
                                for (int e = 0; e < 7; e++) {
                                    if(player[x].getGroup()!=locker_Room1[p][e].getGroup()){
                                        add=true;
                                    }
                                }
                            }
                            if(add==false){
                                locker_Room1[i][j]=player[x];
                                locker_room1[i][j]=number_shirt;
                            }
                        }
                    }
                }
            }
        }
        return add;
    }
    
    /**
     * name:add_playerTo_locker2
     * @param number_shirt
     * @param group
     * @return 
     */
    public boolean add_playerTo_locker2(int number_shirt,char group){
        boolean add=false;
        Player[] player=team.getPlayer();
        
        for (int i = 0; i < 7; i+=2) {
            for (int j = 0; j < 6; j+=2) {
                if(locker_room2[i][j]==0){
                    for (int x = 0; x < player.length; x++) {
                        if(player[x].getNumber_shirt()==number_shirt&&player[x].getGroup()==group){
                            for (int p = 0; p < 7; p++) {
                                for (int e = 0; e < 6; e++) {
                                    if(player[x].getGroup()!=locker_Room2[p][e].getGroup()){
                                        add=true;
                                    }
                                }
                            }
                            if(add==false){
                                locker_Room2[i][j]=player[x];
                                locker_room2[i][j]=number_shirt;
                            }
                        }
                    }
                }
            }
        }
        return add;
    }
    
    /**
     * name:cleanPlayerTo_locker
     * @param type_locker
     * @return 
     */
    public boolean cleanPlayerTo_locker(int type_locker){
        boolean clean=false;
        switch(type_locker){
            case 1:
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        locker_room1[i][j]=0;
                        locker_Room1[i][j]=null;
                        clean=true;
                    }
                }
            break;
            case 2:
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 6; j++) {
                        locker_room2[i][j]=0;
                        locker_Room2[i][j]=null;
                        clean=true;
                    }
                }
            break;
        }
        return clean;
    }
    
    /**
     * name:clean_one_PlayerTo_locker
     * @param type_locker
     * @param number_shirt
     * @return 
     */
    public boolean clean_one_PlayerTo_locker(int type_locker,int number_shirt){
        boolean clean=false;
        switch(type_locker){
            case 1:
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if(locker_Room1[i][j].getNumber_shirt()==number_shirt){
                            locker_room1[i][j]=0;
                            locker_Room1[i][j]=null;
                            clean=true;
                        }
                    }
                }
            break;
            case 2:
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 6; j++) {
                        if(locker_Room1[i][j].getNumber_shirt()==number_shirt){
                            locker_room2[i][j]=0;
                            locker_Room2[i][j]=null;
                            clean=true;
                        }
                        
                    }
                }
            break;
        }
        return clean;
    }
    
    public String toShow_Coach(){
        String toshow="";
        toshow=Arrays.toString(coacH);
        return toshow;
    }
    
    /**
     * name:toShow_player
     * @param type_locker
     * @return 
     */
    public String toShow_player(int type_locker){
        String toshow="";
        switch(type_locker){
            case 1:
                toshow=Arrays.toString(locker_room1);
            break;
            case 2:
                 toshow=Arrays.toString(locker_room2);
            break;
        }
        return toshow;
    }
    
    /**
     * name:into_theEmployee
     * @return 
     */
    public String into_theEmployee(){
        String into="";
        for (int i = 0; i < employee.size(); i++) {
            if(employee.get(i) instanceof Player){
                Player pl=(Player)employee.get(i);
                into+=" player"+ pl.toString()+"\n";
            }
            if(employee.get(i) instanceof Principal){
                Principal pri=(Principal)employee.get(i);
                into+=" coachs principal"+ pri.toString()+"\n";
            }
            if(employee.get(i) instanceof Assistant){
                Assistant assi=(Assistant)employee.get(i);
                into+=" coachs Assistant"+ assi.toString()+"\n";
            }
        }
        return into;
    }
    
    /**
     * name:into_theEmployee_active
     * @return 
     */
    public String into_theEmployee_active(){
        String into="";
        for (int i = 0; i < employee.size(); i++) {
            if(employee.get(i).isActivity()==true){
                if(employee.get(i) instanceof Player){
                    Player pl=(Player)employee.get(i);
                    into+=" player"+ pl.toString()+"\n";
                }
                if(employee.get(i) instanceof Principal){
                    Principal pri=(Principal)employee.get(i);
                    into+=" coachs principal"+ pri.toString()+"\n";
                }
                if(employee.get(i) instanceof Assistant){
                    Assistant assi=(Assistant)employee.get(i);
                    into+=" coachs Assistant"+ assi.toString()+"\n";
                }
            }
        }
        return into;
    }
    
    public boolean actualice_data(double salary, String Id){
        boolean act=false;
        for (int i = 0; i < employee.size(); i++) {
            if(employee.get(i).isActivity()==true&&employee.get(i).getId().equals(Id)){
                if(employee.get(i) instanceof Assistant){
                    Assistant assi=(Assistant)employee.get(i);
                    assi.setSalary(salary);
                }
            }
        }
        return act;
    }
    
    /**
     * name:actualice_data
     * @param Id
     * @param salary
     * @param champions
     * @return 
     */
    public boolean actualice_data( String Id,double salary,String champions){
        boolean act=false;
        for (int i = 0; i < employee.size(); i++) {
            if(employee.get(i).isActivity()==true&&employee.get(i).getId().equals(Id)){
                if(employee.get(i) instanceof Principal){
                    Principal prin=(Principal)employee.get(i);
                    prin.setSalary(salary);
                    ArrayList<String> championships_won=prin.getChampionships_won();
                    championships_won.add(champions);
                    prin.setChampionships_won(championships_won);
                    act=true;
                }
            }
        }
        return act;
    }
    
    /**
     * name:actualice_data
     * @param Id
     * @param salary
     * @param number_goals
     * @return 
     */
    public boolean actualice_data( String Id,double salary,int number_goals){
        boolean act=false;
        for (int i = 0; i < employee.size(); i++) {
            if(employee.get(i).isActivity()==true&&employee.get(i).getId().equals(Id)){
                if(employee.get(i) instanceof Player){
                    Player player=(Player)employee.get(i);
                    player.setSalary(salary);
                    player.setNumber_goals(number_goals);
                }
            }
        }
        return act;
    }
    
    /**
     * name:into_theEmployee_active_player
     * @return 
     */
    public String into_theEmployee_active_player(){
        String into="";
        for (int i = 0; i < employee.size(); i++) {
            if(employee.get(i).isActivity()==true){
                if(employee.get(i) instanceof Player){
                    Player pl=(Player)employee.get(i);
                    into+=" player"+ pl.toString()+"\n";
                }
            }
        }
        return into;
    }
    
    /**
     * name:into_theEmployee_active_prin
     * @return 
     */
    public String into_theEmployee_active_prin(){
        String into="";
        for (int i = 0; i < employee.size(); i++) {
            if(employee.get(i).isActivity()==true){
                if(employee.get(i) instanceof Principal){
                    Principal pri=(Principal)employee.get(i);
                    into+=" coachs principal"+ pri.toString()+"\n";
                }
            }
        }
        return into;
    }
    
    /**
     * name:into_theEmployee_active_assist
     * @return 
     */
    public String into_theEmployee_active_assist(){
        String into="";
        for (int i = 0; i < employee.size(); i++) {
            if(employee.get(i).isActivity()==true){
                
                if(employee.get(i) instanceof Assistant){
                    Assistant assi=(Assistant)employee.get(i);
                    into+=" coachs Assistant"+ assi.toString()+"\n";
                }
            }
        }
        return into;
    }
    
    /**
     * name:add_Player
     * @param number_shirt
     * @param number_goals
     * @param average_mark
     * @param tip_player
     * @param Name
     * @param Id
     * @param Salary
     * @param activity
     * @param group
     * @return 
     */
    public boolean add_Player(int number_shirt, int number_goals, int average_mark, int tip_player, String Name, String Id, double Salary, boolean activity,char group){
        boolean add=false;
        Player player=new Player(number_shirt, number_goals, average_mark, tip_player, Name, Id, Salary, activity, group);
        add=team.add_Player(player);
        employee.add(player);
        return add;
    }
    
    /**
     * name:inactive_Player
     * @param Id
     * @param active
     * @return 
     */
    public boolean inactive_Player( String Id, boolean active){
        boolean add=true;
        add=team.inactive_Player(Id, active);
        return add;
    }
    
    /**
     * name:add_Coachs
     * @param number_of_teams
     * @param years_experience
     * @param Name
     * @param Id
     * @param Salary
     * @param activity
     * @param group
     * @return 
     */
    public boolean add_Coachs(int number_of_teams, int years_experience, String Name, String Id, double Salary, boolean activity,char group){
        boolean add=false;
        Coach coach_pri;
        coach_pri=new Principal(number_of_teams, years_experience, Name, Id, Salary, activity, group);
        add=team.add_Coachs(coach_pri);
        employee.add(coach_pri);
        return add;
    }
    
    /**
     * name:inactive_Coachs
     * @param Id
     * @param active
     * @return 
     */
    public boolean inactive_Coachs( String Id, boolean active){
        boolean add=true;
        add=team.inactive_Coachs(Id, active);
        return add;
    }
    
    /**
     * name:add_Assistant
     * @param player_professional
     * @param experticia
     * @param years_experience
     * @param Name
     * @param Id
     * @param Salary
     * @param activity
     * @param group
     * @return 
     */
    public boolean add_Assistant(boolean player_professional, int experticia, int years_experience, String Name, String Id, double Salary, boolean activity,char group){
        boolean add=false;
        Coach Sub_coachs;
        Sub_coachs=new Assistant(player_professional, experticia, years_experience, Name, Id, Salary, activity,group);
        employee.add(Sub_coachs);
        return add;
    }
    
    /**
     * name:add_Assistant
     * @param Id
     * @param active
     * @return 
     */
    public boolean inactive_Assistant( String Id, boolean active){
        boolean add=true;
        add=team.inactive_Assistant(Id, active);
        return add;
    }

    /**
     * name:getName
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * name:setName
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * name:getNIT
     * @return 
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * name:setNIT
     * @param NIT 
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * name:getCreation_date
     * @return 
     */
    public String getCreation_date() {
        return creation_date;
    }

    /**
     * name:setCreation_date
     * @param creation_date 
     */
    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    /**
     * name:getEmployee
     * @return 
     */
    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    /**
     * name:setEmployee
     * @param employee 
     */
    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    /**
     * name:getLocker_room1
     * @return 
     */
    public int[][] getLocker_room1() {
        return locker_room1;
    }

    /**
     * name:setLocker_room1
     * @param locker_room1 
     */
    public void setLocker_room1(int[][] locker_room1) {
        this.locker_room1 = locker_room1;
    }

    /**
     * name:getLocker_room2
     * @return 
     */
    public int[][] getLocker_room2() {
        return locker_room2;
    }

    /**
     * namw:setLocker_room2
     * @param locker_room2 
     */
    public void setLocker_room2(int[][] locker_room2) {
        this.locker_room2 = locker_room2;
    }

    /**
     * name:getLocker_Room1
     * @return 
     */
    public Player[][] getLocker_Room1() {
        return locker_Room1;
    }

    /**
     * name:setLocker_Room1
     * @param locker_Room1 
     */
    public void setLocker_Room1(Player[][] locker_Room1) {
        this.locker_Room1 = locker_Room1;
    }

    /**
     * name:getLocker_Room2
     * @return 
     */
    public Player[][] getLocker_Room2() {
        return locker_Room2;
    }

    /**
     * name:setLocker_Room2
     * @param locker_Room2 
     */
    public void setLocker_Room2(Player[][] locker_Room2) {
        this.locker_Room2 = locker_Room2;
    }

    /**
     * name:getCoach
     * @return 
     */
    public Coach[][] getCoach() {
        return coach;
    }

    /**
     * name:setCoach
     * @param coach 
     */
    public void setCoach(Coach[][] coach) {
        this.coach = coach;
    }

    /**
     * name:getCoacH
     * @return 
     */
    public int[][] getCoacH() {
        return coacH;
    }

    /**
     * name:setCoacH
     * @param coacH 
     */
    public void setCoacH(int[][] coacH) {
        this.coacH = coacH;
    }

    /**
     * name:toString
     * @return 
     */
    @Override
    public String toString() {
        return "Club{" + "name=" + name + "\n, NIT=" + NIT + "\n, creation_date=" + creation_date +
                "\n, employee=" + employee + "\n, team=" + team.toString()
                + "\n, locker_room1=" + Arrays.toString(locker_room1)
                + "\n, locker_room2=" + Arrays.toString(locker_room2)
                + "\n, locker_Room1=" + Arrays.toString(locker_Room1)
                + "\n, locker_Room2=" + Arrays.toString(locker_Room2)
                + "\n, coach=" + Arrays.toString(coach)
                + "\n, coacH=" + Arrays.toString(coacH) + '}';
    }
    
    
    
}
