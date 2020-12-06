package model;
import java.util.ArrayList;
import java.util.Arrays;
public class Team {
    private String name;
    private Coach[] coach_pri=new Coach[2] ;
    private Coach[] Sub_coachs=new Assistant[6];
    private Player[] player=new Player[50];
    private ArrayList<Coach> coach = new ArrayList<Coach>();
    private ArrayList<Player> Players = new ArrayList<Player>();
    private ArrayList<Alignment> alignment = new ArrayList<Alignment>();
    public int MAX_PLAYER_A=25;
    public int MAX_PLAYER_B=25;
    

    /**
     * name:Team
     * @param name 
     */
    public Team(String name) {
        this.name = name;
    }

    /**
     * name:getCoach_pri
     * @return 
     */
    public Coach[] getCoach_pri() {
        return coach_pri;
    }

    /**
     * name:setCoach_pri
     * @param coach_pri 
     */
    public void setCoach_pri(Coach[] coach_pri) {
        this.coach_pri = coach_pri;
    }

    /**
     * nama:getPlayer
     * @return 
     */
    public Player[] getPlayer() {
        return player;
    }

    /**
     * name:setPlayer
     * @param player 
     */
    public void setPlayer(Player[] player) {
        this.player = player;
    }

    /**
     * name:getCoach
     * @return 
     */
    public ArrayList<Coach> getCoach() {
        return coach;
    }

    /**
     * name:setCoach
     * @param coach 
     */
    public void setCoach(ArrayList<Coach> coach) {
        this.coach = coach;
    }

    /**
     * name:getPlayers
     * @return 
     */
    public ArrayList<Player> getPlayers() {
        return Players;
    }

    /**
     * name:setPlayers
     * @param Players 
     */
    public void setPlayers(ArrayList<Player> Players) {
        this.Players = Players;
    }
    
    /**
     * name:countPlayers
     * @return 
     */
    public int[] countPlayers(){
        int[] count=new int[2];
        for (int i = 0; i < player.length; i++) {
            if(player[i]!=null){
                if(player[i].getGroup()=='A'){
                    count[0]++;
                }else if(player[i].getGroup()=='B'){
                    count[1]++;
                }
            }
            
        }
        return count;
    }
    
    /**
     * name:countAssitant
     * @return 
     */
    public int[] countAssitant(){
        int[] count=new int[2];
        for (int i = 0; i < Sub_coachs.length; i++) {
            if(Sub_coachs[i]!=null){
                Assistant p=(Assistant)Sub_coachs[i];
                if(p.getGroup()=='A'){
                    count[0]++;
                }else if(p.getGroup()=='B'){
                    count[1]++;
                }
            }
        }
        return count;
    }
    
    /**
     * name:add_Player
     * @param playerr
     * @return 
     */
    public boolean add_Player(Player playerr){
        boolean add=false;
        int cantity=0;
        int[]cont=countPlayers();
        for (int i = 0; i < player.length && add==false; i++) {
            if(player[i]==null){
                if(playerr.getGroup()=='A'){
                    if(cont[0]<25){
                        player[i]=playerr;
                        add=true;
                    }
                }  
                if(playerr.getGroup()=='B'){
                    if(cont[1]<25){
                        player[i]=playerr;
                        add=true;
                    }
                }  
            }
        }
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
        for (int i = 0; i < player.length && add==false; i++) {
            if(player[i].getId().equals(Id)){
                Players.add(player[i]);
                add=true;
                player[i]=null;
            }
        }
        return add;
    }
    
    /**
     * name:add_Coachs
     * @param coach_princ
     * @return 
     */
    public boolean add_Coachs(Coach coach_princ){
        boolean add=false;
        Principal s=(Principal)coach_princ;
        for (int i = 0; i < coach_pri.length && add==false; i++) {
            if(player[i]==null){
                if(s.getGroup()=='A'){
                    coach_pri[i]=coach_princ;
                    add=true;   
                }  
                if(s.getGroup()=='B'){
                    coach_pri[i]=coach_princ;
                    add=true; 
                }  
            }
        }
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
        for (int i = 0; i < coach_pri.length && add==false; i++) {
            if(coach_pri[i].getId().equals(Id)){
                coach.add(coach_pri[i]);
                add=true;
                coach_pri[i]=null;
            }
        }
        return add;
    }
    
    /**
     * name:add_Assistant
     * @param coachs_sub
     * @return 
     */
    public boolean add_Assistant(Assistant coachs_sub){
        boolean add=false;
        int[]cont=countAssitant();
        for (int i = 0; i < Sub_coachs.length && add==false; i++) {
            if(Sub_coachs[i]==null){
                Assistant p=(Assistant)coachs_sub;
                if(p.getGroup()=='A'){
                    if(cont[0]<25){
                        Sub_coachs[i]=coachs_sub;
                        add=true;
                    }
                }  
                if(p.getGroup()=='B'){
                    if(cont[1]<25){
                        Sub_coachs[i]=coachs_sub;
                        add=true;
                    }
                }
            }
        }
        return add;
    }
    
    /**
     * name:inactive_Assistant
     * @param Id
     * @param active
     * @return 
     */
    public boolean inactive_Assistant( String Id, boolean active){
        boolean add=true;
        for (int i = 0; i < Sub_coachs.length && add==false; i++) {
            if(Sub_coachs[i].getId().equals(Id)){
                coach.add(Sub_coachs[i]);
                add=true;
                Sub_coachs[i]=null;
            }
        }
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
     * name:getSub_coachs
     * @return 
     */
    public Coach[] getSub_coachs() {
        return Sub_coachs;
    }

    /**
     * name:setSub_coachs
     * @param Sub_coachs 
     */
    public void setSub_coachs(Coach[] Sub_coachs) {
        this.Sub_coachs = Sub_coachs;
    }

    /**
     * name:getAlignment
     * @return 
     */
    public ArrayList<Alignment> getAlignment() {
        return alignment;
    }

    /**
     * name:setAlignment
     * @param alignment 
     */
    public void setAlignment(ArrayList<Alignment> alignment) {
        this.alignment = alignment;
    }

    /**
     * name:toString
     * @return 
     */
    @Override
    public String toString() {
        return "Team{" + "name=" + name + "\n, coach_pri=" + Arrays.toString(coach_pri)
                + "\n, Sub_coachs=" + Arrays.toString(Sub_coachs)
                + "\n, player=" + Arrays.toString(player)
                + "\n, coach=" + coach.toString()
                + "\n, Players=" + Players.toString()
                + "\n, alignment=" + alignment.toString() + '}';
    }
    
    
    
}
