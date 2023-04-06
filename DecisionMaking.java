
/**
 * NAME- APOORV SHARAT
 * CLASS- 10 C
 * ROLL NUMBER- 11 
 * @version 1.0
 */
import java.util.*;
public class DecisionMaking
{
    /**
     * function to display menu
     */
    private static void displayMenu()
    {
        System.out.println("**      @@@@@@@@@   *********  @@@@@@@@  *********  @@@@@@@@   *********   @@        @@");
        System.out.println("** **   @@@@@@@@@   *********  @@@@@@@@  *          @@@@@@@@   *********   @@ @@     @@");
        System.out.println("**  **  @@          **            @@      ********     @@      **     **   @@  @@    @@");
        System.out.println("**   ** @@@@@@@@@   **            @@      ********     @@      **     **   @@   @@   @@");
        System.out.println("**  **  @@          **            @@             *     @@      **     **   @@    @@  @@");
        System.out.println("** **   @@@@@@@@@   *********   @@@@@@@   *********  @@@@@@@@  *********   @@     @@ @@");
        System.out.println("**      @@@@@@@@@   *********   @@@@@@@   *********  @@@@@@@@  *********   @@      @@");
        System.out.println();
        System.out.println();
        System.out.println("@@             @@    ***********    @@      @@  **********  @@        @@   ************");
        System.out.println("@@ @@         @@ @@  ***********    @@    @@    **********  @@ @@     @@   ************");
        System.out.println("@@  @@       @@  @@  **       **    @@  @@          **      @@  @@    @@   **");
        System.out.println("@@   @@     @@   @@  **       **    @@@             **      @@   @@   @@   **    ******");
        System.out.println("@@    @@   @@    @@  **@@@@@@@@@@@  @@  @@          **      @@    @@  @@   **        **");
        System.out.println("@@     @@ @@     @@  **       **    @@    @@    **********  @@     @@ @@   ************");
        System.out.println("@@      @@       @@  **       **    @@       @@ **********  @@      @@     ************");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("______________________________________________________________________________________________________________");
        System.out.println("______________________________________________________________________________________________________________");
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
        System.out.println("1. Meaning and uses of Decision Making ststement");
        System.out.println("2. Relational operators");
        System.out.println("3. Relational expression");
        System.out.println("4. Logical operators");
        System.out.println("5. Classification of operators");
        System.out.println("6. If Statement");
        System.out.println("7. Syntax of simple if statement");
        System.out.println("8. Working of simple if statement");
        System.out.println("9. Syntax of if else statement");
        System.out.println("10. Working of if else statement");
        System.out.println("11. if else if Ststement");
        System.out.println("12. Nested if else Ststement");
        System.out.println("13. Switch Statement");
        System.out.println("14. Working of switch ststement");
        System.out.println("15. Fall through property");
        System.out.println("16. Advantages of using switch in place of if else if");
        System.out.println("17. Shortcut if else operator (?:)");
        System.out.println("0. Back to main menu");
        System.out.println();
        System.out.println("Enter your choice 0-18");
    }
    /**
     * function to display meaning and uses of decision making statement
     */
    private void decision()
    {
        System.out.println("                    DECISION MAKING STATEMENTS");
        System.out.println("- Decision making statements are also called sellection statements or conditional branching statements");
        System.out.println("- Decision making statements are used to transfer the control from one part of the program to another depending on the value of conditional expression.");
        System.out.println();
        System.out.println();
        System.out.println("There are 2 types of decision making ststements in java:");
        System.out.println("    -if Statement");
        System.out.println("    -switch Ststement");
    }
    /**
     * function to display relational operators
     */
    private void relational()
    {
        System.out.println("A relational operator is used in a program to compare the values of two operands.");
        System.out.println();
        System.out.println("Examples of relational operator:");
        System.out.println();
        System.out.println();
        System.out.println("    SYMBOL                  NAME/USE");
        System.out.println();
        System.out.println("       >                   greater than");
        System.out.println("      >=                  greater than or equal to");
        System.out.println("       <                    less than");
        System.out.println("      <=                  less than or equal to");
        System.out.println("      ==                    equal to");
        System.out.println("      !=                    not equal to");
    }
    /**
     * function to display details of relational expression
     */
    private void expression()
    {
        System.out.println("                            RELATIONAL EXPRESSION");
        System.out.println();
        System.out.println();
        System.out.println("- A relational expression is a valid combination of two opperands and a relational operator.");
        System.out.println("- The value of a relational expression is either true or false.");
        System.out.println();
        System.out.println("eg:");
        System.out.println("5>7     //false");
        System.out.println("5==5    //true");
        System.out.println("6<=8    //true");
        System.out.println("5!=5    //false");
    }
    /**
     * function to display details of logical operators
     */
    private void logical()
    {
        System.out.println("                        LOGICAL OPERATORS");
        System.out.println();
        System.out.println();
        System.out.println("- Logical operators are generally used to join or combine two or more relational expressions.");
        System.out.println("- The value of a relational expression is either true or false.");
        System.out.println("- The operands of a logical operatior are logical constants.");
        System.out.println("- Logical constants are either true or false.");
        System.out.println();
        System.out.println();
        System.out.println("There are 3 logical operators in java:");
        System.out.println("i. logical and (&&)");
        System.out.println("- The result of and operator will be true if and only if the values of both opperands are true.");
        System.out.println("- If the value of any one or both operand is flase then result of and expression will be false.");
        System.out.println("eg:");
        System.out.println("(5>2)&&(10>20)");
        System.out.println("= true && false");
        System.out.println("= false");
        System.out.println();
        System.out.println("ii. Logical OR (||)");
        System.out.println("- The result of or expression will be true if atleast one of the opperands is true.");
        System.out.println("- If both the operands are false then the result of or expression will be false.");
        System.out.println("eg:");
        System.out.println("int 1=10, b=15, c=2;");
        System.out.println("boolean b= (a>b)||(b>c);");
        System.out.println("         =false || true");
        System.out.println("         =true");
        System.out.println();
        System.out.println("iii. logical NOT (!)");
        System.out.println("- This operator requires only one operand.");
        System.out.println("- If the operand is false, the result of not operator is true.");
        System.out.println("- If the operand is true then the result of not operator will be false.");
        System.out.println("eg:     5>6     //false");
        System.out.println("       !5>6     //true");
    }
    /**
     * function to display details of classification of operators
     */
    private void classification()
    {
        System.out.println("                        CLASSIFICATION OF OPERATORS");
        System.out.println();
        System.out.println();
        System.out.println("BASED ON NUMBER OF OPPERANDS, OPERATORS CAN BE CASSIFIED INTO FOLLOWING CATOGARIES:");
        System.out.println("i. Unary uperator");
        System.out.println("- The operator tha requires only one opperand.");
        System.out.println("eg. !, ++, --");
        System.out.println();
        System.out.println("ii. Binary operator");
        System.out.println("- An operator that requires two operands.");
        System.out.println("eg. +, -, /, *, %, <, >, >=, <=, !=, =, &&, ||");
        System.out.println();
        System.out.println("iii. Ternary operator");
        System.out.println("- An operator that requires three operands.");
        System.out.println("eg. ?:");
    }
    /**
     * function to display details of if statement
     */
    private void detail_if()
    {
        System.out.println("                        IF STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("- If is one of the conditional branching statements in java.");
        System.out.println("- using it we can transfer the progam control from one part of the program to another part.");
        System.out.println();
        System.out.println("There are different  forms of if statement available in java:");
        System.out.println("- Simle if statement");
        System.out.println("- if else statement");
        System.out.println("- if else if statement");
        System.out.println("- nested if else statement");
    }
    /**
     * function to display syntax of simple if statement
     */
    private void syntax_if()
    {
        System.out.println("                            SYNTAX OF SIMPLE IF");
        System.out.println();
        System.out.println();
        System.out.println("if(condition)");
        System.out.println("{");
        System.out.println("    statement 1;");
        System.out.println("    statement 2;");
        System.out.println("         ::");
        System.out.println("         ::");
        System.out.println("    statement n");
        System.out.println("}");
    }
    /**
     * function to display working of simple if statement
     */
    private void working_if()
    {
        System.out.println("                    WORKING OF SIMPLE IF");
        System.out.println();
        System.out.println();
        System.out.println("- The statements in the if block will be exicuted if and only if the value of conditional expression is true.");
        System.out.println("- If the condition is false, then this statement will not be exicuted.");
    }
    /**
     * function to display syntax of if else statement
     */
    private void syntax_if_else()
    {
        System.out.println("                SYNTAX OF IF ELSE STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("if(condition)");
        System.out.println("{");
        System.out.println("    statement 1;");
        System.out.println("    statement 2;");
        System.out.println("         ::");
        System.out.println("         ::");
        System.out.println("    ststament n;");
        System.out.println("}");
        System.out.println("else");
        System.out.println("{");
        System.out.println("    statement 1;");
        System.out.println("    statement 2;");
        System.out.println("         ::");
        System.out.println("         ::");
        System.out.println("    statement n;");
        System.out.println("}");
    }
    /**
     * function to display working of if else statement
     */ 
    private void working_if_else()
    {
        System.out.println("                        WORKING OF IF ELSE STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("- if else statement is used to exicute one of the two available blocks of statement.");
        System.out.println("- If the conditional expression is true then the statements in if block will be exicuted and else block will be ignored.");
        System.out.println("- If the condition is false then the statements in else block will be exicuted and if will be ignored.");
    }
    /**
     * function to display details of if else if statement
     */
    private void if_else_if()
    {
        System.out.println("                                IF ELSE IF STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("- if else if statement is used to sellect an option from multiple options.");
        System.out.println("- It consists of an if block and several else if block and an optional else block.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                SYNTAX  ");
        System.out.println();
        System.out.println();
        System.out.println("if(condition 1)");
        System.out.println("{");
        System.out.println("    statements;");
        System.out.println("}");
        System.out.println("else if(condition 2)");
        System.out.println("     {");
        System.out.println("        Statements;");
        System.out.println("     }");
        System.out.println("     ::");
        System.out.println("       ::");
        System.out.println("        else if(condition n)");
        System.out.println("             {");
        System.out.println("                 Statements;");
        System.out.println("             }");
        System.out.println("             else");
        System.out.println("             {");
        System.out.println("                Statements;");
        System.out.println("             }");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                    STATEMENTS");
        System.out.println();
        System.out.println("statement 1;");
        System.out.println("statement 2;");
        System.out.println("     ::");
        System.out.println("     ::");
        System.out.println("statement n");
    }
    /**
     * function to display details about nested if else statement
     */
    private void nested_if_else()
    {
        System.out.println("                        NESTED IF ELSE STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("- If statement inside another if statement is called nested if statement.");
        System.out.println("- It can be an if else statement inside an if block or an if else statement inside each and every block of an if else if statement.");
        System.out.println();
        System.out.println();
        System.out.println("eg:");
        System.out.println("if(a>b)");
        System.out.println("{");
        System.out.println("    if(a>c)");
        System.out.println("    {");
        System.out.println("        g=a;");
        System.out.println("    }");
        System.out.println("}");
    }
    /**
     * function to display details of switch statement
     */
    private void switch_statement()
    {
        System.out.println("                            SWITCH STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("- A switch statement is used in a program to sellect an option from multiple options.");
        System.out.println("- It is often used in place of an if else if statement.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                SYNTAX");
        System.out.println();
        System.out.println();
        System.out.println("switch(expression)");
        System.out.println("{");
        System.out.println("    case constant1: statements");
        System.out.println("                    break;");
        System.out.println("    case constant2: statements");
        System.out.println("                    break;");
        System.out.println("            ::");
        System.out.println("            ::");
        System.out.println("    case constant n: statements");
        System.out.println("                     break");
        System.out.println("    default:         statements");
        System.out.println("}");
    }
    /**
     * function to display working of switch statement
     */
    private void switch_working()
    {
        System.out.println("                WORKING OF SWITCH STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("- The expression after keyword switch will be evaluated and its value will be compared with the constants after each case block.");
        System.out.println("- If the value of the expression matches with one of the case constants, then statements in that block will be exicuted.");
        System.out.println("- If the value does not matches with any of the case blocks then the statements in default block will be exicuted.");
    }
    /**
     * function to display details of fall through property
     */
    private void fall_through()
    {
        System.out.println("                       FALL THROUGH PROPERTY");
        System.out.println();
        System.out.println();
        System.out.println("If there is no break statement in a case block then the statements in the subsequent case block or the default block will be exicuted");
        System.out.println(" until it encounter the first break statement or closing bracket of switch.");
    }
    /**
     * function to display advantages of using switch statement in place of an if else if statement
     */ 
    private void advantages()
    {
        System.out.println("                     ADVANTAGES OF USING SWITCH STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("- switch statement is more redable in compared to if else if statement.");
        System.out.println("- switch statement exicutes faster then if else if statement.");
    }
    /**
     * function to display details of shortcut if else operator
     */
    private void shortcut_if_else()
    {
        System.out.println("                    SHORTCUT IF ELSE OPERATOR (?:)");
        System.out.println();
        System.out.println();
        System.out.println("- Shortcut if else operator can be used to replace an if else statement.");
        System.out.println("- It is only operator with 3 operands.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                        FORMAT OF USING SHORTCUT IF ELSE OPERATOR");
        System.out.println();
        System.out.println();
        System.out.println("i. variable=(condition)? expression 1: expression 2");
        System.out.println();
        System.out.println("                        WORKING");
        System.out.println();
        System.out.println("- if the condition of expression will be true then value of expression 1 will be stored in variable.");
        System.out.println("- if the condition is false then value of expression 2 will be staored in variable.");
        System.out.println();
        System.out.println();
        System.out.println("ii. System.out.println((condition)? expression1: expression2)");
        System.out.println();
        System.out.println("                        WORKING");
        System.out.println();
        System.out.println("- If the condition is true then expression 1 will be evaluated and displayed.");
        System.out.println("- If condition is false then value of expression 2 will be evaluated and displayed.");
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
                        decision();
                        break;
                case 2: System.out.println('\f');
                        relational();
                        break;
                case 3: System.out.println('\f');
                        expression();
                        break;
                case 4: System.out.println('\f');
                        logical();
                        break;
                case 5: System.out.println('\f');
                        classification();
                        break;
                case 6: System.out.println('\f');
                        detail_if();
                        break;
                case 7: System.out.println('\f');
                        syntax_if();
                        break;
                case 8: System.out.println('\f');
                        working_if();
                        break;
                case 9: System.out.println('\f');
                        syntax_if_else();
                        break;
                case 10: System.out.println('\f');
                         working_if_else();
                         break;
                case 11: System.out.println('\f');
                         if_else_if();
                         break;
                case 12: System.out.println('\f');
                         nested_if_else();
                         break;
                case 13: System.out.println('\f');
                         switch_statement();
                         break;
                case 14: System.out.println('\f');
                         switch_working();
                         break;
                case 15: System.out.println('\f');
                         fall_through();
                         break;
                case 16: System.out.println('\f');
                         advantages();
                         break;
                case 17: System.out.println('\f');
                         shortcut_if_else();
                         break;
                case 0: System.out.println('\f');
                        Main m2=new Main();
                        m2.main_fn();
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
