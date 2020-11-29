package Aufgabe35;

import java.util.LinkedList;
import java.util.Scanner;

public class CommandFactory {
    static Stackable<Student> stack = new Stack<Student>();


    static public LinkedList<ICommand> returnCommandList(){


        LinkedList<ICommand> list = new LinkedList<ICommand>();
        list.add(createExitCommand());
        list.add(pushStudent());
        list.add(popStudent());
        list.add(peekStudent());
        list.add(isStackEmpty());
        list.add(clearStack());
        list.add(printStack());
        list.add(stackSize());

        return list;
    }

    static public ICommand pushStudent(){
        return new ICommand() {

            @Override
            public String execute() {

                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter prename: ");
                String surname =  scan.nextLine();
                System.out.println("Please enter surname: ");
                String prename =  scan.nextLine();
                System.out.println("Type in Course of the Student: ");
                String Strcourse = scan.nextLine();
                int course = Integer.parseInt(Strcourse);
                System.out.println("Type in Matrikulation Number of the Student: ");
                String StrmatrikulationNumber = scan.nextLine();
                int martikulationNumber = Integer.parseInt(StrmatrikulationNumber);

                Student newstudent = new Student(surname,prename,course,martikulationNumber);
                stack.push(newstudent);

                return "New Student was added to the Stack";
            }

            @Override
            public String description() {
                return "Push student to stack.";
            }
        };
    }
    static private ICommand popStudent(){
        return new ICommand() {
            @Override
            public String execute() {
                stack.pop();
                return "Student on the Top of Stack was deleted";
            }

            @Override
            public String description() {
                return "Pop student from stack.";
            }
        };
    }
    static private ICommand peekStudent(){
        return new ICommand() {
            @Override
            public String execute() {
                return "Student:" + stack.peek();
            }

            @Override
            public String description() {
                return "Peek student.";
            }
        };
    }
    static private ICommand isStackEmpty(){
        return new ICommand() {
            @Override
            public String execute() {
                stack.isEmplty();
                return "";
            }

            @Override
            public String description() {
                return "Check if students are on the stack.";
            }
        };
    }

    static private ICommand clearStack(){
        return new ICommand() {
            @Override
            public String execute() {
                stack.clear();
                return "Stack was cleared";
            }

            @Override
            public String description() {
                return "Clear stack.";
            }
        };
    }
    static private ICommand printStack(){
        return new ICommand() {
            @Override
            public String execute() {
                stack.print();


                return null;
            }

            @Override
            public String description() {
                return "Print all students from stack.";
            }
        };
    }
    static private ICommand stackSize() {
        return new ICommand() {
            @Override

            public String execute() {
                String size = Integer.toString(stack.size());
                return size;
            }

            @Override
            public String description() {
                return "Get size of stack.";
            }
        };
    }
    private static ICommand createExitCommand() {
        return new ICommand() {
            @Override
            public String execute() {
                System.out.println("Program closed!");
                System.exit(0);
                return null;
            }

            @Override
            public String description() {
                return "Exit";
            }
        };
    }

}