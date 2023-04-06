 
/**
 * NAME- APOORV SHARAT
 * CLASS- 10 C
 * ROLL NO. 11 
 * @version (1.0)
 */
import java.util.*;
public class Main
{
    /**
     * Function to display menu
     */
    private void displayMenu()
    {
        System.out.println("menu                     menu   menu menu menu   menu menu menu   menu           menu");
        System.out.println("menu menu           menu menu   menu menu menu   menu menu menu   menu menu      menu");
        System.out.println("menu  menu         menu  menu   menu      menu        menu        menu  menu     menu");
        System.out.println("menu   menu       menu   menu   menu      menu        menu        menu   menu    menu");
        System.out.println("menu    menu     menu    menu   menu menu menu        menu        menu    menu   menu");
        System.out.println("menu     menu   menu     menu   menu menu menu        menu        menu     menu  menu");
        System.out.println("menu      menu menu      menu   menu      menu   menu menu menu   menu      menu menu");
        System.out.println("menu       menu          menu   menu      menu   menu menu menu   menu           menu");
        System.out.println();
        System.out.println();
        System.out.println("MENU                           Menu   MENU menu menu menu    MENU             MENU    MENU           MENU");
        System.out.println("MENU  menu                menu MENU   MENU menu menu menu    MENU menu        MENU    MENU           MENU");
        System.out.println("MENU   menu              menu  MENU   MENU                   MENU  menu       MENU    MENU           MENU");
        System.out.println("MENU    menu            menu   MENU   MENU                   MENU   menu      MENU    MENU           MENU");
        System.out.println("MENU     menu          menu    MENU   MENU menu menu menu    MENU    menu     MENU    MENU           MENU");
        System.out.println("MENU      menu        menu     MENU   MENU menu menu menu    MENU     menu    MENU    MENU           MENU");
        System.out.println("MENU       menu      menu      MENU   MENU                   MENU      menu   MENU    MENU           MENU");
        System.out.println("MENU        menu    menu       MENU   MENU                   MENU       menu  MENU    MENU           MENU");
        System.out.println("MENU         menu  menu        MENU   MENU menu menu menu    MENU        menu MENU    MENU menu menu MENU");
        System.out.println("MENU          menu             MENU   MENU menu menu menu    MENU         menu        MENU menu menu MENU");
        System.out.println();
        System.out.println();
        System.out.println("________________________________________________________________________________________________________________");
        System.out.println("________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println();
        System.out.println("1. Fundamentals");
        System.out.println("2. Decision Making");
        System.out.println("3. Loops");
        System.out.println("4. Functions");
        System.out.println("5. Object oriented programming");
        System.out.println("6. Array");
        System.out.println("7. EXIT");
        System.out.println();
        System.out.println("Enter your choice (1-7)");
    }
    /**
     * main function
     */
public void main_fn(){
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            displayMenu();
            ch=sc.nextInt();
            switch (ch)
            {
                case 1: Fundamentals f1=new Fundamentals();
                        System.out.println('\f');
                        f1.main();
                        break;
                case 2: DecisionMaking dm=new DecisionMaking();
                        System.out.println('\f');
                        dm.main();
                        break;
                case 3: Loop l1=new Loop();
                        System.out.println('\f');
                        l1.main();
                        break;
                case 4: Functions fun1=new Functions();
                        System.out.println('\f');
                        fun1.main();
                        break;
                case 5: Object o1=new Object();
                        System.out.println('\f');
                        o1.main();
                case 6: System.out.println();
                        Array a1=new Array();
                        a1.main();
                        break;
                case 7: System.out.println('\f');
                        System.out.println("Terminating...");
                        System.exit(0);
                        break;
                default: System.out.println('\f');
                         System.out.println("Invalid Choice");
            }
        }while(ch!=7);
    }
}
