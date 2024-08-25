import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
class Todo
{
    public ArrayList<String> addTask(ArrayList<String> ar1,Scanner sc)
    {
        ArrayList<String> temp = new ArrayList<>();
        System.out.println(" ");
        System.out.println("Add number of new tasks");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println(" ");

        for (int i=1;i<=y;i++)
        {
        System.out.print("Enter New Task No." + " "+i+ ":"+" ");
        temp.add(sc.nextLine());
        }

        ar1.addAll(temp);

        System.out.println(" ");

        System.out.print("Tasks ");
        for(String s : temp)
        System.out.print(s+ " , ");
        System.out.print(" added successfully");
        System.out.println(" ");
        return ar1;

    }

    public ArrayList<String> delTask(ArrayList<String> ar1,Scanner sc,ArrayList<String> ar2)
    {
        int a=0;
        System.out.println("Delete the task which has been completed");
        for(String s : ar1)
        System.out.println("click "+ ++a + "."+" "+"for "+s);

        int d=sc.nextInt();
        sc.nextLine();
        String s = ar1.get(--d);//storing removed value to variable s
        ar2.add(s);//storing removes or completed task in array list
        ar1.remove(d);
        System.out.println("Task "+s+" removed succesfully");
        return ar2;

    }

    public void vicoTask(ArrayList<String> ar2)
    {
        
        int e = 0;
        System.out.println(" ");

        System.out.print("Completed Tasks ");
        System.out.println(" ");
        for(String s : ar2)
        System.out.println(++e+ "."+s+ " ");
        System.out.println(" ");
    }

    public void vireTask(ArrayList<String> ar1)
    {
        System.out.println(" ");
        System.out.println("List of Remaining Tasks to be done");
        System.out.println(" ");

        int e = 0;
        for(String s : ar1)
        System.out.println(++e+ "."+s+ " ");
        System.out.println(" ");
    }

        
    
    

    

    public static void main(String[] args)
    {
        Todo ob =new Todo();
        System.out.println(" ");
        System.out.println("================================");
        System.out.println(" ||  TO DO LIST APPLICATION  ||");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> ar1 = new ArrayList<>();// to maintain list
        ArrayList<String> ar2 = new ArrayList<>();//to maitain the list of completed task and deleted task
        
        while(true)
        {
            System.out.println(" ");
        System.out.println("1. ADD TASK ");
        System.out.println("2. DELETE COMPLETED TASK ");
        System.out.println("3. VIEW COMPLETED TASK ");
        System.out.println("4. VIEW REMAINING TASK ");
        System.out.println("5. EXIT ");
        System.out.println("");
        int n =sc.nextInt();
        sc.nextLine();
        
        
            switch (n)
            {
                case 1:
                    ob.addTask(ar1,sc);
                    break;

                case 2:
                    ob.delTask(ar1,sc,ar2);
                    break;
                    

                //view complete
                case 3:
                    ob.vicoTask(ar2);
                    break;
                    

                //view remaining
                case 4:
                    ob.vireTask(ar1);
                    break;
                    

                case 5:
                    System.exit(0);
                    break;
                    
                default:
                System.out.println("Invalid choice. Please try again.");  // Added validation
                break;
                    
                    
            }//switch
        }//while
    }//main
}//class
