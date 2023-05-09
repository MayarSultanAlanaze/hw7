// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        {

        }/* public class Account {
            private String Accountname;
            private String Accountid;
            private int balance;

            public Account() {



            }public Account(String Id, String Name) {
                Accountname = Name;
                Accountid = Id;

            }public Account(String Id, String Name, int balance) {
                Accountname= Name;
                Accountid =Id;
                balance = balance;
            }
            public Account( int balance) {
                Accountname= " ";
                Accountid =" ";
                balance = 0;

            }



            public String getAccountname() {
                return Accountname;
            }

            public String getAccountid() {
                return Accountid;
            }

            public int getbalance() {
                return balance;

            }public void deposit(int amount){
                if (amount<=balance){
                    System.out.println("please enter a different amount");

                }else {
                    balance =balance+ amount;
                    System.out.println("has been deposited"+amount);
                }

            }public void Withdram(double amount){
                if (amount<balance) {
                    if (this.balance >= amount) {
                        this.balance -= amount;
                        System.out.println("has been Withdram " + amount);

                    } else
                        System.out.println("Transaction cancelled due to insufficient funds");
                }
            }*/


        }/* public class Employee {

        private String Name;
        private String id;
        private int Salary;
        private int AnnualSalary;


        public Employee(String Id, String Name, int Salary) {
            Name = Name;
            id = Id;
            Salary = Salary;

        }
        private String getName () {
            return Name;
        }

        private String getId () {
            return id;
        }

        private int getSalary () {
            return Salary;
        }

        private int getAnnualSalary () {
            return AnnualSalary;
        }
        public void raiseSalary ( int percent){

        }
        public String toString () {
            return "Employeeid=" + id + "Employeename" + Name + "EmployeeSalary" + Salary + "EmployeeAnnualSalary" + AnnualSalary;

        }
    }*/
    }/* public class Main {

    public static void main(String[] args) {
        Account e1 = new Account("21", "MAYAR");
        Account e2 = new Account("25", "MELAF", 4560);
        System.out.println(" id is: " + e2.getAccountid() + "Name is" + e1.getAccountname() + "balance is" + e1.getbalance());
        e1.deposit(1500);
        e2.deposit(250);
        e1.transferTo(e2, 500);
        System.out.println(e1.getbalance());
        System.out.println(e2.getbalance());

        Employee a = new Employee("21","mayar",2500);
        System.out.println("Id is"+a.toString());
        System.out.println("salary is"+a.toString());


    }

}*/
