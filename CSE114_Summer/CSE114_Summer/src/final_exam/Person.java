package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
import java.util.*;

public class Person {

    private String name;
    private Calendar dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = new GregorianCalendar(Integer.parseInt(dob.substring(6, 10)), Integer.parseInt(dob.substring(0, 2)), Integer.parseInt(dob.substring(3, 5)));

    }

    public Person() {
    }

    public Person(String name, String dob) {

        this.name = name;

        this.dob = new GregorianCalendar(Integer.parseInt(dob.substring(6, 10)), Integer.parseInt(dob.substring(0, 2)), Integer.parseInt(dob.substring(3, 5)));

    }

    public int getAge() {
        Calendar today = new GregorianCalendar();

        if ((today.get(Calendar.MONTH) == dob.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) == dob.get(Calendar.DAY_OF_MONTH) || today.get(Calendar.MONTH) > dob.get(Calendar.MONTH))) {
            return today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        } else {
            return today.get(Calendar.YEAR) - dob.get(Calendar.YEAR) - 1;
        }
    }

    public static int avgAge(Person[] p) {

        int sum = 0, count = 0;

        for (Person pr : p) {
            if (pr != null) {
                sum += pr.getAge();
                count++;
            }
        }

        if (count != 0) {
            return sum / count;
        }
        return 0;
    }

    @Override
    public String toString() {

        return "\nName: " + this.name + " \nDOB: " + this.dob.get(Calendar.MONTH) + "/" + this.dob.get(Calendar.DAY_OF_MONTH) + "/" + this.dob.get(Calendar.YEAR) + "\nAge: " + this.getAge() + "\n";
    }

}

class Employee extends Person {

    private long salary;

    public Employee() {
    }

    public Employee(String name, String date, String pay) {

        super(name, date);

        String[] s = pay.split(" ");

        if (s.length == 1) {
            this.salary = Long.parseLong(s[0]);
        } else {
            this.salary = 0;
            for (String st : s) {
                this.salary += this.salary * 1000 + Long.parseLong(st);
            }
        }
    }

    @Override
    public String toString() {

        return "Employee: " + super.toString() + "Salary: $" + longNumbertoString(this.getSalary()) + "\n";
    }

    public String longNumbertoString(long salary) {
        String str = "";

        if (salary > 1000) {
            str = longNumbertoString(salary / 1000) + ", ";

            long rem = salary % 100;

            if (rem > 99) {
                return str + rem;
            } else if (rem > 9) {
                return str + "0" + rem;
            } else {
                return str + "00" + rem;
            }
        }
        return "" + salary;
    }

    /**
     * @return the salary
     */
    public long getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(long salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Person a = new Employee("Ben", "04/24/1998", "100000");

        System.out.println(a.toString());
    }

}
