import java.time.LocalDate;

public class Tehtava2 {

  public static void main(String[] args) {

    String birthday = "BIRTHDATE";
    String birthdayUser = System.getenv(birthday);

    try {

      LocalDate birthDate = LocalDate.parse(birthdayUser);
      LocalDate today = LocalDate.now();

      int compareValue = today.compareTo(birthDate);

      if (compareValue == 0) {
        System.out.println("Hyvää syntymäpäivää!");
      }

      else {
        System.out.println("Tänään ei ole syntymäpäiväsi.");
      }
      long daysOld = today.toEpochDay() - birthDate.toEpochDay();
      System.out.println("Olet " + daysOld + " päivää vanha.");

      if (daysOld % 1000 == 0) {
        System.out.println("Onpas kivan pyöreä luku!");
      }

    } catch (Exception e) {
      System.out.println("Virhe datamuunnoksessa: " + e.getMessage());
    }
  }
}