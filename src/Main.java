public class Main {
    public static void main(String[] args) {
        //первое задание
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        //второе задание
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println(fullNameUpperCase);

        //третье задание

        String name1 = fullName.replace ('a', 'o');
        System.out.println("ФИО сотрудника" + name1);
    }
}