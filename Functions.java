/**
 * @NAME- APOORV SHARAT
 * CLASS- 10 C
 * ROLL NO. 11 
 */
import java.util.*;
public class Functions
{
    /**
     * function to display menu
     */
    private void displayMenu()
    {
        System.out.println("@@@@@@@@@@@  **       **  @@         @@  ***********  @@@@@@@@@@@@  ************  @@@@@@@@@@@  **         **  @@@@@@@@@@@@");  
        System.out.println("@@@@@@@@@@@  **       **  @@ @@      @@  ***********  @@@@@@@@@@@@  ************  @@@@@@@@@@@  ** **      **  @@@@@@@@@@@@");
        System.out.println("@@           **       **  @@  @@     @@  **                @@            **       @@       @@  **  **     **  @@");
        System.out.println("@@@@@@@@@@@  **       **  @@   @@    @@  **                @@            **       @@       @@  **   **    **  @@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@  **       **  @@    @@   @@  **                @@            **       @@       @@  **    **   **  @@@@@@@@@@@@");
        System.out.println("@@           **       **  @@     @@  @@  **                @@            **       @@       @@  **     **  **             @");
        System.out.println("@@           ***********  @@      @@ @@  ***********       @@       ************  @@@@@@@@@@@  **      ** **  @@@@@@@@@@@@");         
        System.out.println("@@           ***********  @@       @@    ***********       @@       ************  @@@@@@@@@@@  **       **    @@@@@@@@@@@@");
        System.out.println();
        System.out.println();
        System.out.println("====================================================================================================================================================================================");
        System.out.println("====================================================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("MENU                       menu       MENU menu menu menu    MENU             MENU    MENU           MENU");
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
        System.out.println();
        System.out.println("______________________________________________________________________________________________________________");
        System.out.println("______________________________________________________________________________________________________________");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("1. Defination and advantages of dividing a program into different functions");
        System.out.println("2. Format");
        System.out.println("3. Components of a function");
        System.out.println("4. Uses of keyword return");
        System.out.println("5. Invoking function");
        System.out.println("0. Back to main menu");
    }
    /**
     * function to display details of function
     */
    private void function()
    {
        System.out.println("                MEANING OF FUNCTION");
        System.out.println();
        System.out.println();
        System.out.println("- A function is a named block of instruction.");
        System.out.println("- Statements in a function can be exicuted several times by using name of the function.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("             ADVANTAGES OF DIVIDING A PROGRAM INTO DIFFERENT FUNCTIONS");
        System.out.println();
        System.out.println();
        System.out.println("- It reduces number of lines in a program.");
        System.out.println("- Reduces the complexity of solving a problem.");
    }
    /**
     * function to display format of defining function
     */
    private void format()
    {
        System.out.println("                    FORMAT");
        System.out.println();
        System.out.println();
        System.out.println("[access specifier][modifier] return-type functon-name(parameter list)");
        System.out.println("{");
        System.out.println("    statement 1;");
        System.out.println("    statement 2;");
        System.out.println("         ::");
        System.out.println("         ::");
        System.out.println("    statement n;");
        System.out.println("    [return[expression];]");
        System.out.println("}");
    }
    /**
     * function to display components of a function
     */
    private void components()
    {
        System.out.println("                COMPONENTS OF A FUNCTION");
        System.out.println();
        System.out.println();
        System.out.println("i. return type:");
        System.out.println("- The return type is the data type of the value functin returns.");
        System.out.println("- If the function dont return any value, the return type of function is void.");
        System.out.println();
        System.out.println("ii. Method name:");
        System.out.println("- It is the actual name of the function.");
        System.out.println("- The method name and the parameter list together constitute the method signature.");
        System.out.println();
        System.out.println("iii. parameter list");
        System.out.println("- Parameter list is a coma seperated list of variables in the function eader.");
        System.out.println("- Parameter lists are optional  i.e. a function may not contain any parameter list.");
        System.out.println("format:");
        System.out.println("(datatype variable1, datatype variable2.......,datatype variable n)");
        System.out.println();
        System.out.println("iv. Method body:");
        System.out.println("- it contains a collection of statements that define what a function does.");
        System.out.println();
        System.out.println("v. Function header/prototype:");
        System.out.println("- It is the first line of defining a function.");
        System.out.println("- It contains return type, function name & parameter list.");
        
    }
    /**
     * function to display details of the keyword return
     */
    private void keyword()
    {
        System.out.println("                KEYWORD RETURN");
        System.out.println();
        System.out.println();
        System.out.println("- It is used to transfer value from one function to other.");
        System.out.println("- It is used to terminate a function also.");
        System.out.println();
        System.out.println("NOTE:");
        System.out.println("A function can return only one value even though we can write several return statements in a function.");
    }
    /**
     * function to display details and steps to invoke a function
     * steps to return function(all types)
     * details of returning value from function
     */
    private void invoke()
    {
        System.out.println("                INVOKING FUNCTION");
        System.out.println();
        System.out.println();
        System.out.println("Executing the statements written inside function using fubction name is called invoking.");
        System.out.println();
        System.out.println();
        System.out.println("                STEPS TO INVOKE FUNCTIONS WITHOUT PARAMETERS AND RETURN VALUE");
        System.out.println();
        System.out.println("- Write function name that you are invoking.");
        System.out.println("- Put opening and closing brackets and a semi column.");
        System.out.println();
        System.out.println();
        System.out.println("            STEPS TO INVOKE FUNCTION WITH PARAMETERS BUT WITHOUT RETURN VALUE");
        System.out.println();
        System.out.println("- Write the function name.");
        System.out.println("- Put opening bracket.");
        System.out.println("- Write actual parameters seperated by coma.");
        System.out.println("- Put closing bracket and semi column.");
        System.out.println();
        System.out.println();
        System.out.println("                RETURNING VALUE FROM A FUNCTION");
        System.out.println();
        System.out.println("NOTE:");
        System.out.println("- The return type of function should not be void.");
        System.out.println("- Avoid using word display in the function name.");
        System.out.println("- Use keyword return to transfer value from one function to another.");
    }
    /**
     * main function
     */
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            displayMenu();
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println('\f');
                        function();
                        break;
                case 2: System.out.println('\f');
                        format();
                        break;
                case 3: System.out.println('\f');
                        components();
                        break;
                case 4: System.out.println('\f');
                        keyword();
                        break;
                case 5: System.out.println('\f');
                        invoke();
                        break;
                case 0: System.out.println('\f');
                        Main m4=new Main();
                        m4.main_fn();
                        break;
                default:System.out.println('\f');
                        System.out.println("invalid choice");
            }
            if(ch!=0)
            {
                System.out.println();
                System.out.println("Press any key to continue....");
                sc.skip("\n");
                String tmp=sc.nextLine();
            }
        }while(ch!=0);
    }
}