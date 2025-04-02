public class Main {
    public static void main(String[] args) {
 //     Car myCar = new Car("Toyota", "TXL", 2025 );
 //       Car mySecondCar = new Car("BMW", "Q3", 2025 );
 //       mySecondCar.accelerate();
 //       myCar.accelerate();
 //       myCar.brake();

        // Book Obj
        Book readBook = new Book("Backend", "Java", 1000);
        readBook.readPage();

        // Student Obj
        Student student1 = new Student("James", 26, 11);
        student1.study();

        // Bank Account Obj
        BankAccount account = new BankAccount(1234567890, 50000, "James");
        account.deposit();
        account.withdraw();

        // Employee obj
        Employee worker = new Employee("James", "backend", 4000000);
        worker.Work();
    }
}