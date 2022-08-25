public class Main {
    public static void main(String[] args) {
        // Задание 1 \\
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание 2 \\
        String fIO = fullName;
        String[] parts = fIO.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + part1.charAt(0)+ "." + part2.charAt(0)+ "." + part3.charAt(0) + ".");


         // Задание 3 \\
        //// Вариант 1 ( Если не изменять изначальный fullname ) \\\\
        String newFullName = "Иванов Семён Семёнович";
        newFullName = newFullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + newFullName);
        //// Вариант 2 ( Если изменить исходные данные) \\\\
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}