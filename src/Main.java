public class Main {
    public static void main(String[] args) {
        // Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        // Задача 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        // Задача 3
        String fullNameRus = "Иванов Семён Семёнович";
        System.out.println(fullNameRus.replace('ё', 'е'));
    }
}