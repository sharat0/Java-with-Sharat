/**
 * @NAME- APOORV SHARAT
 * CLASS- 10 C
 * ROLL NO. 11 
 */
import java.util.*;
public class Array
{
    /**
     * function to display meny
     */
    private void menu()
    {
        System.out.println("@@@@@@@@@@@@    *************  *************  @@@@@@@@@@@@    **        **");
        System.out.println("@@@@@@@@@@@@    *************  *************  @@@@@@@@@@@@     **      **");
        System.out.println("@@        @@    **         **  **         **  @@        @@      **    **");
        System.out.println("@@        @@    **         **  **         **  @@        @@       **  **");
        System.out.println("@@########@@##  *************  *************  @@########@@##       **");
        System.out.println("@@########@@##  **  **         **  **         @@########@@##       **");
        System.out.println("@@        @@    **     **      **     **      @@        @@         **");
        System.out.println("@@        @@    **        **   **        **   @@        @@         **");
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
        System.out.println("1. Meaning of array");
        System.out.println("2. Array declaration");
        System.out.println("3. Array creation");
        System.out.println("4. Accessing individual element of array");
        System.out.println("5. Initialising an array");
        System.out.println("6. Searching and sorting algorithm");
        System.out.println("0. Back to main menu");
        System.out.println();
        System.out.println("enter your choice 0-6");
    }
    /**
     * function to display meaning of array
     */
    private void meaning()
    {
        System.out.println("                    ARRAY");
        System.out.println("- Array is one of the non primitive data types.");
        System.out.println("- A variable of type array is used to represent a group of similar data items.");
        System.out.println();
        System.out.println("An array is an ordered collection of homogenus data items");
        
    }
    /**
     * function to display array declaration
     */
    private void declaration()
    {
        System.out.println("                            ARRAY DECLARATION");
        System.out.println();
        System.out.println();
        System.out.println("FORMAT 1:");
        System.out.println(" datatype []arrayname;");
        System.out.println("eg: eg: int []ar;");
        System.out.println();
        System.out.println("FORMAT 2:");
        System.out.println("datatype arrayname[];");
    }
    /**
     * function to display array creation
     */
    private void creation()
    {
        System.out.println("                    ARRAY CREATION");
        System.out.println();
        System.out.println();
        System.out.println("Reserving space for an array in the computers memory.");
        System.out.println();
        System.out.println("FORMAT:");
        System.out.println("arrayname= new datatype[SIZE]");
        System.out.println("eg: ar=new int[5];");
        System.out.println();
        System.out.println();
        System.out.println("The total memory requirement of thge array will be the memory requirement if one data item and the total no. of data items.");
        System.out.println();
        System.out.println("Array creation and array decalaration can bve done in one statement.");
        System.out.println("FORMAT:");
        System.out.println("datatype [] arrayname= new datatype [size]");
        System.out.println("eg. int []ar= new int[5];");
        System.out.println();
        System.out.println();
        System.out.println("NEW is an operator used to allocate memory space for an array.");
        System.out.println();
        System.out.println("- SIZE represenbts the minimum no. of values that can be stored in an array.");
        System.out.println("- SIZE should be a positive number.");
        
    }
    /**
     * function to display details of accessing individual array elements
     */
    private void accessing()
    {
        System.out.println("-to fascilitate the accessing of accessing of individual element, a unique number is given to each and every cell.");
        System.out.println("- index of the first cell is 0, index of second cell is 1..., index of last cell is size-1");
        System.out.println("- we use a combination of array name and index to access an individual array element.");
        System.out.println();
        System.out.println("format: arrayname[index];");
    }
    /**
     * function to display initialization of array elements
     */
    private void initialization()
    {
        System.out.println("                    INITIALIZING AN ARRAY");
        System.out.println();
        System.out.println();
        System.out.println("Storing initial values in variable of type in the same statement in which we declare a variable.");
        System.out.println();
        System.out.println("format- datatype []arrayname={variable1, variable2.....,variable_n};");
    }
    /**
     * function to display different type of searching and sorting algorithm
     */
    private void sorting()
    {
        System.out.println("                        SEARCHING AND SORTING TECHNIQUES OF ARRAY ELEMENTS");
        System.out.println();
        System.out.println();
        System.out.println("1. BUBBLE SORT");
        System.out.println("- Compare pairs of adjacent elements and interchange them.");
        System.out.println("- at the end of first pass the largest element will be placed at the last cell of the array.");
        System.out.println("- repeat this process witjhh n-1 times.");
        System.out.println();
        System.out.println("2. Binary search");
        System.out.println("- binary search is a search technique that works for sorted arrays.");
        System.out.println("- the search element is compared with the middle element of the array and then it is used with larger or smaller element according to the search element.");
        System.out.println();
        System.out.println();
        System.out.println("3. Sellection sort");
        System.out.println("- Sellection sort is the sorting technique where the next smallest oe next largest element is found in the array and mo0ve to its correct position.");
        
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
                        meaning();
                        break;
                case 2: System.out.println('\f');
                        declaration();
                        break;
                case 3: System.out.println('\f');
                        creation();
                        break;
                case 4: System.out.println('\f');
                        accessing();
                        break;
                case 5: System.out.println('\f');
                        initialization();
                        break;
                case 6: System.out.println('\f');
                        sorting();
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