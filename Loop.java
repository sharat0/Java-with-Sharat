
/**
 * Write a description of class Loop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Loop
{
    /**
     * function to display menu
     */
    private void menu()
    {
        System.out.println("LOOP            LOOP LOOP LOOP  LOOP LOOP LOOP  LOOP LOOP LOOP");
        System.out.println("LOOP            LOOP LOOP LOOP  LOOP LOOP LOOP  LOOP LOOP LOOP");
        System.out.println("LOOP            LOOP      LOOP  LOOP      LOOP  LOOP      LOOP");
        System.out.println("LOOP            LOOP      LOOP  LOOP      LOOP  LOOP      LOOP");
        System.out.println("LOOP            LOOP      LOOP  LOOP      LOOP  LOOP LOOP LOOP");
        System.out.println("LOOP            LOOP      LOOP  LOOP      LOOP  LOOP LOOP LOOP");
        System.out.println("LOOP LOOP LOOP  LOOP LOOP LOOP  LOOP LOOP LOOP  LOOP");
        System.out.println("LOOP LOOP LOOP  LOOP LOOP LOOP  LOOP LOOP LOOP  LOOP");
        System.out.println();
        System.out.println();
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________");
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
        System.out.println("1. Meaning of loops with types");
        System.out.println("2. while loop");
        System.out.println("3. do while loop");
        System.out.println("4. for loop");
        System.out.println("5. Operator (increment, decrement)");
        System.out.println("6. Prefic & postfix");
        System.out.println("7. operator precedence");
        System.out.println("8. Nested loops");
        System.out.println("0. back to main menu");
    }
    /**
     * function to display details of loop
     */
    private void loop()
    {
        System.out.println("                    LOOPS");
        System.out.println();
        System.out.println();
        System.out.println("A loop is used in a program to repeat one or more statements.");
        System.out.println();
        System.out.println();
        System.out.println("There are 3 types of loops.");
        System.out.println("i. while loop");
        System.out.println("ii. do while loop");
        System.out.println("iii. for loop");
        
    }
    /**
     * function to display all the details of while loop
     * 1. syntax
     * 2. working
     */
    private void while_loop()
    {
        System.out.println("                        WHILE LOOP");
        System.out.println();
        System.out.println();
        System.out.println("                    SYNTAX");
        System.out.println();
        System.out.println("while(condition)");
        System.out.println("{");
        System.out.println("    statement 1;");
        System.out.println("    statement 2;");
        System.out.println("         ::");
        System.out.println("         ::");
        System.out.println("    statement n;");
        System.out.println("}");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                        WORKING");
        System.out.println();
        System.out.println();
        System.out.println("- while is an entry controled loop that means in a while loop, the condition is checked before executing the statements the body of the loop.");
        System.out.println("- The statements in body of the loop will be executed as long as the conditional expression is true.");
        System.out.println("- The control will be transfered to the first statement outside the body of the loop when the condition becomes false.");
        
    }
    /**
     * function to display all details of do while loop
     * 1. syntax
     * 2. working
     */
    private void do_while()
    {
        System.out.println("                        do while LOOP");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                   SYNTAX");
        System.out.println();
        System.out.println();
        System.out.println("do");
        System.out.println("{");
        System.out.println("    statement 1;");
        System.out.println("    statement 2;");
        System.out.println("         ::");
        System.out.println("         ::");
        System.out.println("    statement n;");
        System.out.println("}while(condition);");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                    WORKING");
        System.out.println();
        System.out.println();
        System.out.println("- do while is an exit controlled loop.");
        System.out.println("- Exit controled loop means the condition is checked after exicuting statements in body of the loop.");
        System.out.println("- In a do while loop, the control enters the body of the loop without checking any condition.");
        System.out.println("- The statements in body of loop will be exicuted as long as the value of conditional expression is true.");
    }
    /**
     * function to display details of for loop
     * 1. syntax
     * 2. working
     */
    private void for_loop()
    {
        System.out.println("                                FOR LOOP");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                            SYNTAX");
        System.out.println();
        System.out.println();
        System.out.println("for(initialization; conditional expression; modification)");
        System.out.println("{");
        System.out.println("    Statement 1;");
        System.out.println("    Statement 2;");
        System.out.println("         ::");
        System.out.println("         ::");
        System.out.println("    Statement n;");
        System.out.println("}");
        System.out.println();
        System.out.println();
        System.out.println("eg. for(int i=1; i<=5; i++)");
        System.out.println("    {");
        System.out.println("        System.out.println(i);");
        System.out.println("    }");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                DETAILS");
        System.out.println();
        System.out.println("- for is an entery controled loop that means in for loop condition is checked before exicuting the statemenst in the body of the loop.");
        System.out.println("- In a for loop, the initialization part, conditional expression and the modification part are placed in the same line seperated by a semi colum");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                    WORKLING OF A FOR LOOP");
        System.out.println();
        System.out.println();
        System.out.println("STEP 1:  initialization");
        System.out.println("STEP 2:  check the conditional expression");
        System.out.println("         If condition is true goes to step 3 else goes to step 6");
        System.out.println("STEP 3:  exicutes tatement in the body of the loop");
        System.out.println("STEP 4:  modification");
        System.out.println("STEP 5:  Goes to step 2");
        System.out.println("STEP 6:  Exicutes statement in the body of the loop.");
        
    }
    /**
     * function to display types of operators (increment,decrement)
     */
    private void operators()
    {
        System.out.println("                                OPERATORS");
        System.out.println();
        System.out.println();
        System.out.println("i. Increment operator");
        System.out.println("- operator symbol is ++");
        System.out.println("- It is a unary operator that means it is a operator with only one opperand.");
        System.out.println("- This operator is used to inctrement the value of opperand by 1");
        System.out.println();
        System.out.println();
        System.out.println("ii. Decrement operator");
        System.out.println("- operator symbol is --");
        System.out.println("- It is a unary operator.");
        System.out.println("- It is used to decrement the value of the opperand by 1");
    }
    /**
     * function to display different types of notation (prefix,postfix)
     */
    private void notations()
    {
        System.out.println("                    NOTATIONS");
        System.out.println();
        System.out.println();
        System.out.println("When used in expression with multiple opperands, there is a difference in order of evaluation in the working in prefix form and the postfix form.");
        System.out.println();
        System.out.println("i. Prefix form:");
        System.out.println("- it modifies the value of the opperand in expression and then use it.");
        System.out.println();
        System.out.println("ii. Postfix form:");
        System.out.println("- it uses the value of the opperand in the expression and then modify it.");
    }
    /**
     * function to display operator precedence
     */
    private void precedence()
    {
        System.out.println("                OPERATOR PRECEDENCE/ PRIORITY OF OPERATOR");
        System.out.println();
        System.out.println();
        System.out.println("( )");
        System.out.println("++, --, !");
        System.out.println("*, /, %");
        System.out.println("+, -");
        System.out.println(">, <, >=, <=");
        System.out.println("==, !=");
        System.out.println("&&");
        System.out.println("||");
        System.out.println("?:");
        System.out.println("=, +=, -=, /=, %=, *=");
        System.out.println();
        System.out.println();
        System.out.println("NOTE:");
        System.out.println("- IN ABOVE TABLE FROM TOP TO BOTTOM, OPERATORS ARE ARRANGED IN DESENDING ORDER OF THEIR PRECIDENCE.");
        System.out.println("- OPERATORS IN THE SAME ROW HAVE EQUAL PRECIDENCE.");
    }
    /**
     * Function to display details of nested loop
     */
    private void nested()
    {
        System.out.println("                    NESTED LOOPS");
        System.out.println();
        System.out.println();
        System.out.println("A loop inside another loop is called nested loop.");
        System.out.println("for eg:");
        System.out.println("1. a for loop inside a while loop.");
        System.out.println("2. a while loop inside a do while loop.");
        System.out.println("3. a while loop inside a while loop.");
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
            menu();
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println('\f');
                        loop();
                        break;
                case 2: System.out.println('\f');
                        while_loop();
                        break;
                case 3: System.out.println('\f');
                        do_while();
                        break;
                case 4: System.out.println('\f');
                        for_loop();
                        break;
                case 5: System.out.println('\f');
                        operators();
                        break;
                case 6: System.out.println('\f');
                        notations();
                        break;
                case 7: System.out.println('\f');
                        precedence();
                        break;
                case 8: System.out.println('\f');
                        nested();
                        break;
                case 0: System.out.println('\f');
                        Main m3=new Main();
                        m3.main_fn();
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