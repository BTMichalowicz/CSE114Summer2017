package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class SBUTicketOffice {

    public static Student2 findStudent(String name) {
        for (Student2 s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }

        System.out.println("Name not found");
        return null;
    }

    public static Ticket findTicket(String name) {

        for (Ticket t : tickets) {
            if (t.getPerformer().equals(name)) {
                return t;
            }
        }

        System.out.println("Ticket name not found");
        return null;
    }

    public static boolean makeSale(Student2 student, Ticket ticket) {
        if (!student.isEligible()) {
            System.out.println("Not elegible");
            return false;
        } else {
            if (student.getWolfieBalance() - 5.50 < 0) {
                System.out.print("Would you like to use your meal points (yes/no)? "
                        + "WARNING: This will cost twice as much");

                Scanner sc = new Scanner(System.in);
                String answer = sc.next();

                while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                    System.out.println("Bad input, please try again.");
                    answer = sc.next();
                }

                if (answer.equalsIgnoreCase("yes")) {
                    if (student.getMealBalance() - 11.00 < 0) {
                        System.out.println("Not enough funds");
                        return false;
                    } else {
                        int count = 0;
                        for (Ticket ticket1 : student.getTickets()) {
                            if (ticket.getPerformer().equals(ticket1.getPerformer())) {
                                count++;
                            }
                        }

                        if (count >= 3) {
                            System.out.println("You have too many of this type of ticket.");
                            return false;
                        } else {
                            student.setMealBalance(student.getMealBalance() - 11.00);
                            ticket.setTicketsLeft(ticket.getTicketsLeft() - 1);
                            ticket.setTicketsSold(ticket.getTicketsSold() + 1);
                            Ticket.setTotalSold(Ticket.getTotalSold() + 1);

                            Ticket[] temp = student.getTickets();

                            for (int i = 0; i < temp.length; i++) {

                                if (temp[i] == null) {
                                    temp[i] = ticket;
                                }

                            }

                            student.setTickets(temp);

                            System.out.println("Success!");
                            return true;
                        }

                    }
                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Can't help you, sorry");
                    return false;
                }

            } else {

                int count = 0;
                for (Ticket ticket1 : student.getTickets()) {
                    if (ticket.getPerformer().equals(ticket1.getPerformer())) {
                        count++;
                    }
                }

                if (count >= 3) {
                    System.out.println("You have too many of this type of ticket.");
                    return false;
                } else {
                    student.setMealBalance(student.getMealBalance() - 5.50);
                    ticket.setTicketsLeft(ticket.getTicketsLeft() - 1);
                    ticket.setTicketsSold(ticket.getTicketsSold() + 1);
                    Ticket.setTotalSold(Ticket.getTotalSold() + 1);

                    Ticket[] temp = student.getTickets();

                    for (int i = 0; i < temp.length; i++) {

                        if (temp[i] == null) {
                            temp[i] = ticket;
                        }

                    }

                    student.setTickets(temp);

                    System.out.println("Success!");
                    return true;
                    
                }
                
            }
            return true;
        }
        
    }
    
    
    public static int totalTicketsSold(){
        return Ticket.getTotalSold();
    }
    
    public static long totalRevenue(){
        long res = 0;
        
        for(Ticket t: tickets){
            res+=t.getSales();
        }
        
        return res;
        
    }
        //Driver class for Student and Ticket

    static Student2[] students = new Student2[100];

    static Ticket[] tickets = new Ticket[6];

    public static void main(String[] args) {

        try {
            java.util.Scanner sc = new java.util.Scanner(new File("students.txt"));
            String line;
            
            while(sc.hasNext()){
                line = sc.nextLine();
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

}

class Student2 {

    private String name;

    private int age;
    private double wolfieBalance;
    private double mealBalance;
    private int judicialWriteUps;
    private Ticket[] tickets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWolfieBalance() {
        return wolfieBalance;
    }

    public void setWolfieBalance(double wolfieBalance) {
        this.wolfieBalance = wolfieBalance;
    }

    public double getMealBalance() {
        return mealBalance;
    }

    public void setMealBalance(double mealBalance) {
        this.mealBalance = mealBalance;
    }

    public int getJudicialWriteUps() {
        return judicialWriteUps;
    }

    public void setJudicialWriteUps(int judicialWriteUps) {
        this.judicialWriteUps = judicialWriteUps;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public boolean isEligible() {
        return this.judicialWriteUps >= 3;
    }

    public Student2() {
    }

    public Student2(String name, int age, double wolfieBalance, double mealBalance, int judicialWriteUps, Ticket[] tickets) {
        setName(name);

        setAge(age);
        setWolfieBalance(wolfieBalance);
        setMealBalance(mealBalance);
        setJudicialWriteUps(judicialWriteUps);

        this.tickets = new Ticket[6];

    }

}

class Ticket {

    private String performer;
    private double ticketPrice;
    private int ticketsLeft;
    private int ticketsSold;

    private static int totalSold;

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketsLeft() {
        return ticketsLeft;
    }

    public void setTicketsLeft(int ticketsLeft) {
        this.ticketsLeft = ticketsLeft;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public static int getTotalSold() {
        return totalSold;
    }

    public static void setTotalSold(int totalSold) {
        Ticket.totalSold = totalSold;
    }

    public Ticket() {
    }

    public Ticket(String performer, double ticketPrice, int ticketsLeft) {

        setPerformer(performer);
        setTicketPrice(ticketPrice);
        setTicketsLeft(ticketsLeft);
        this.ticketsSold = 0;

    }

    public double getSales() {
        return this.ticketPrice * this.ticketsSold;
    }

    public void sell() {
        this.ticketsSold++;
        this.ticketsLeft--;
        totalSold++;
    }
}
