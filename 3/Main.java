import java.io.*;

public class Main {
  private static String[] datePhone = new String[5];

  public static void main(String[] args) throws IOException {
    String act;

    loadDatePhone();
    PrintBook();

    System.out.println("выбор действия: (add)добавить данные, (del)удалить данные," +
        " (show)показать данные, (exit)выход");

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    act = bf.readLine();
    while (!act.equals("exit")) {
      if (act.equals("add")) {
        System.out.println("Ввод фамилии, имени, отчества.");
        System.out.println("Введите фамилию:");
        String firstName = bf.readLine();
        System.out.println("Введите имя:");
        String secondName = bf.readLine();
        System.out.println("Введите отчество:");
        String thirdName = bf.readLine();
        System.out.println("Введите дату рождения (dd.mm.yyyy):");
        String birthDate = bf.readLine();
        System.out.println("Введите телефон:");
        String phone = bf.readLine();
        System.out.println("Введите пол (м/ж):");
        String pol = bf.readLine();
        addDatePhone(firstName, secondName, thirdName, birthDate, phone, pol);
      } else {
        if (act.equals("del")) {
          for (int i = 0; i < datePhone.length; i++) {
            datePhone[i] = "";
          }
        } else {
          if (act.equals("show")) {
            PrintBook();
          }
        }
      }

      System.out
          .println("выбор действия: (add)добавить данные, (del)удалить данные, (show)показать данные, (exit)выход");
      act = bf.readLine();
    }
  }

  public static void loadDatePhone() throws IOException {
    File file = new File("book.txt");
    if (file.exists()) {
      BufferedReader reader = new BufferedReader(new FileReader(new File("book.txt")));
      String act;
      while ((act = reader.readLine()) != null) {
        String dat = " ";
        datePhone[0] = dat;
        datePhone[1] = dat;
        datePhone[2] = dat;
        datePhone[3] = dat;
        datePhone[4] = dat;
        datePhone[5] = dat;
      }
      reader.close();
    }
  }

  public static void PrintBook() {
    System.out.println("Cправочник всех введённых данных: ");
    for (int i = 0; i < datePhone.length; i++) {
      System.out.println(datePhone[i]);
      ;
    }
  }

  private static void addDatePhone(String firstName, String secondName, String thirdName, String birthDate,
      String phone, String pol) {
    datePhone[0] = firstName;
    datePhone[1] = secondName;
    datePhone[2] = thirdName;
    datePhone[3] = birthDate;
    datePhone[4] = phone;
    datePhone[5] = pol;
  }
}
