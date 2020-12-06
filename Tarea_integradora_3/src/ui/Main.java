package ui;
import java.util.*;
import model.*;


public class Main {
    public Scanner sn=new Scanner(System.in);
    public Club club;
    
    public static void main(String[] args) {
        Main p=new Main();
        p.main();
    }
    /**
     * name:main
     * action:main principal 
     */
    public void main(){
        System.out.println("enter the name club");
        String name=sn.nextLine();
        System.out.println("enter the NIT");
        String NIT=sn.nextLine();
        System.out.println("enter the date creation");
        String creation_date=sn.nextLine();
        club=new Club(name, NIT, creation_date);
        boolean exitt=false;
        do {            
            System.out.println("belcome the sport club");
            System.out.println("what is the accion");
            System.out.println("1. add the player \n"
                + "2. add the coach principal \n"
                + "3. add the coach assistant \n"
                + "4. inactive player,coachs principal,coachs assistant \n"
                + "5. add player to locker  \n"
                + "6. add the coachs a office \n  "
                + "7. clean lockers\n"
                + "8. clean player the locker \n"
                + "9. total info the employee \n  "
                + "10. total info the employee active \n  "
                + "11. into the player\n"
                + "12.  into the coachs principal\n"
                + "13.  into the coachs assistant \n "
                + "14.  actualice the into player\n"
                + "15.  actualice the into coachs principal\n"
                + "16.  actualice the into coachs Assistant");
        
            int action=sn.nextInt();
            sn.nextLine();
            switch(action){
                case 1:
                    addPLayer();
                break;
                case 2:
                    addCoachsPrincipal();
                break;
                case 3:
                    addCoachsAsistant();
                break;
                case 4:
                    inactive();
                break;
                case 5:
                    add_playerTo_lockerA();
                break;
                case 6:
                    add_ofice();
                break;
                case 7:
                    cleanPlayerTo_locker();
                break;
                case 8:
                    clean_one_PlayerTo_locker();
                break;
                case 9:
                    System.out.println("into the total employee \n"+ club.into_theEmployee());
                break;
                case 10:
                    System.out.println("into the total employee active \n"+ club.into_theEmployee_active());
                break;
                case 11:
                    System.out.println(club.into_theEmployee_active_player());
                break;
                case 12:
                    System.out.println(club.into_theEmployee_active_prin());
                break;
                case 13:
                    System.out.println(club.into_theEmployee_active_assist());
                break;
                case 14:
                    actualiceData_player();
                break;
                case 15:
                    actualiceData_Principal();
                break;
                case 16:
                    actualiceData_Assist();
                break;
            }
            System.out.println("exit yes or no");
            String exit=sn.nextLine();
            if(exit.equalsIgnoreCase("yes")){
                exitt=true;
            }
        } while (exitt==false);
        
        
        
    }
    
    /**
     * name:addPLayer
     * action:enter the into for player
     */
    public void addPLayer(){
        System.out.println("enter the number shirt");
        int number_shirt=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the number goals");
        int number_goals=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the average mark");
        int average_mark=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the tip player 1.goalkeeper 2.defender 3.midfielder 4.forward");
        int tip_player=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the name");
        String Name=sn.nextLine();
        System.out.println("enter the Id Player");
        String Id=sn.nextLine();
        System.out.println("enter the salary");
        double Salary=sn.nextDouble();
        sn.nextLine();
        boolean activity=true;
        System.out.println("what is the group A or B");
        char group= sn.next().charAt(0);
        club.add_Player(number_shirt, number_goals, average_mark, tip_player, Name, Id, Salary, activity, group);
        
    }
    
    /**
     * name:addCoachsPrincipal
     * action:enter the into for coachs principal
     */
    public void addCoachsPrincipal(){
    // , String Id, double Salary, boolean activity,char group
        System.out.println("enter the number teams");
        int number_of_teams=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the number years experience");
        int years_experience=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the name");
        String Name=sn.nextLine();
        System.out.println("enter the id");
        String Id=sn.nextLine();
        System.out.println("enter the salary");
        double Salary=sn.nextDouble();
        sn.nextLine();
        boolean activity=true;
        System.out.println("what is the group A or B");
        char group= sn.next().charAt(0);
        club.add_Coachs(number_of_teams, years_experience, Name, Id, Salary, activity, group);
        
    }
    
    /**
     * name:addCoachsAsistant
     * action:enter the into for coachs Assistant
     */
    public void addCoachsAsistant(){
        System.out.println("what is the player professional  1.yes 0r 2.no");
        boolean player_professional=false;
        int profesional=sn.nextInt();
        sn.nextLine();
        if(profesional==1){
            player_professional=true;
        }if(profesional==2){
            player_professional=false;
        }
        System.out.println("what is the experticie, 1.defensive 2.lab_plays 3.offensive 4.possession");
        int experticia=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the number years experience");
        int years_experience=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the name");
        String Name=sn.nextLine();
        System.out.println("enter the id");
        String Id=sn.nextLine();
        System.out.println("enter the salary");
        double Salary=sn.nextDouble();
        sn.nextLine();
        boolean activity=true;
        System.out.println("what is the group A or B");
        char group= sn.next().charAt(0);
        club.add_Assistant(player_professional, experticia, years_experience, Name, Id, Salary, activity, group);
        
    }
    
    /**
     * name:inactive
     * action:inactive for type the employee
     */
    public void inactive(){
        System.out.println("whay is the insurance employee 1.player 2.coachs principal 3.coachs assistant");
        int num=sn.nextInt();
        sn.nextLine();
        System.out.println("whay is the id the player ");
        String Id=sn.nextLine();
        System.out.println("this insurance to player 1.yes or 2.no");
        boolean insuracnce=false;
        int profesional=sn.nextInt();
        if(profesional==1){
            insuracnce=true;
        }if(profesional==2){
            insuracnce=false;
        }//club.inactive_Player(Id, insuracnce);
        boolean insuracne=false;
        switch(num){
            case 1:
                insuracne=club.inactive_Player(Id, insuracnce);
            break;
            case 2:
                insuracne=club.inactive_Coachs(Id, insuracnce);
            break;
            case 3:
                insuracne=club.inactive_Assistant(Id, insuracnce);
            break;
        }
        if(insuracne==true)
            System.out.println("correct inative");
    }
    
    /**
     * name:add_playerTo_lockerA
     * action: add the player a diferent lockers 
     */
    public void add_playerTo_lockerA(){
        System.out.println("what is the locker 1.A   or 2.B");
        int locker=sn.nextInt();
        sn.nextLine();
        boolean add1=false;
        boolean add2=false;
        System.out.println("enter the number shirt player");
        int number_shirt=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the group A or B");
        char group=sn.next().charAt(0);
        switch(locker){
            case 1:
                add1=club.add_playerTo_locker1(number_shirt, group);
            break;
            case 2:
                add2=club.add_playerTo_locker2(number_shirt, group);
            break;
        }
        if(add1==true)
            System.out.println("correct add");
        if(add2==true)
            System.out.println("correct add");
        
    }
    
    /**
     * name:add_ofice
     * action: add the coachs a office 
     */
    public void add_ofice(){
        System.out.println("enter the id the coachs");
        String Id=sn.nextLine();
        club.add_ofice(Id);
    }
    
    /**
     * name:cleanPlayerTo_locker
     * action: clean locker
     */
    public void cleanPlayerTo_locker(){
        System.out.println("enter the type locker clean");
        int type_locker=sn.nextInt();
        sn.nextLine();
        boolean clean=false;
        clean=club.cleanPlayerTo_locker(type_locker);
        if(clean==true)
            System.out.println("correct clean");
    }
    
    /**
     * name:clean_one_PlayerTo_locker
     * action:clean one player the locker
     */
    public void clean_one_PlayerTo_locker(){
        System.out.println("enter the type locker");
        int locker=sn.nextInt();
        sn.nextLine();
        System.out.println("enter the number Shirt player");
        int shirt=sn.nextInt();
        sn.nextLine();
        boolean clean=club.clean_one_PlayerTo_locker(locker, shirt);
        if(clean==true)
            System.out.println("correct clean player");
    }
    
    /**
     * name:toshow_matriz
     * action: 
     */
    public void toshow_matriz(){
        System.out.println("what is the see matriz.  1.offices  2.locker");
        int type=sn.nextInt();
        sn.nextLine();
        switch(type){
            case 1:
                System.out.println(club.toShow_Coach());
            break;
            case 2:
                System.out.println("what is the see locker 1.A 2.B");
                int locker=sn.nextInt();
                sn.nextLine();
                System.out.println(club.toShow_player(locker));
            break;
        }
    }
    
    /**
     * name:actualiceData_player
     * action:
     */
    public void actualiceData_player(){
        System.out.println("enter the Id player");
        String Id=sn.nextLine();
        System.out.println("enter the new salary ");
        double salary=sn.nextDouble();
        sn.nextLine();
        System.out.println("enter the new number the goals");
        int number_goals=sn.nextInt();
        sn.nextLine();
        boolean act= club.actualice_data(Id, salary, number_goals);
        if(act==true)
            System.out.println("correct actualization");
    }
    
    /**
     * name:actualiceData_Principal
     * action: actalice data
     */
    public void actualiceData_Principal(){
        System.out.println("enter the Id player");
        String Id=sn.nextLine();
        System.out.println("enter the new salary ");
        double salary=sn.nextDouble();
        sn.nextLine();
        System.out.println("enter the new Champions");
        String Champions=sn.nextLine();
        sn.nextLine();
        boolean act= club.actualice_data(Id, salary, Champions);
        if(act==true)
            System.out.println("correct actualization");
    }
    
    /**
     * name:actualiceData_Assist
     *  action: actalice data
     */
    public void actualiceData_Assist(){
        System.out.println("enter the Id player");
        String Id=sn.nextLine();
        System.out.println("enter the new salary ");
        double salary=sn.nextDouble();
        sn.nextLine();
        boolean act= club.actualice_data(salary, Id);
        if(act==true)
            System.out.println("correct actualization");
    }
    
    
}
