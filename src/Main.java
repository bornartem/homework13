import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author Caesar = new Author("Gaius", "Caesar");
        Book theWarInGaul = new Book ("Commentarii de Bello Gallic", Caesar, 44);
        System.out.println(Caesar);
        System.out.println(theWarInGaul);
        System.out.println("Год издания - " + theWarInGaul.getPublishingYear());

        Author lordOfTheRings1 = new Author("John", "Tolkien");
        Author lordOfTheRings3 = new Author("John", "Tolkien");
        Book lordOfTheRings = new Book ("LordOfTheRings", lordOfTheRings1, 1954);
        Book lordOfTheRings2 = new Book ("LordOfTheRings", lordOfTheRings1, 1954);
        System.out.println(lordOfTheRings1);
        System.out.println(lordOfTheRings);
        System.out.println(lordOfTheRings.equals(Caesar)); // сравниваем методы класса book, equals
        System.out.println(lordOfTheRings.equals(lordOfTheRings2)); // сравниваем методы класса book, equals
        System.out.println(lordOfTheRings1.equals(Caesar)); // сравниваем методы класса author, equals
        System.out.println(lordOfTheRings1.equals(lordOfTheRings3)); // сравниваем методы класса author, equals
        System.out.println("Год издания - " + lordOfTheRings.getPublishingYear());
        lordOfTheRings.setPublishingYear(1950);
        System.out.println("Год издания - " + lordOfTheRings.getPublishingYear());

    }
}