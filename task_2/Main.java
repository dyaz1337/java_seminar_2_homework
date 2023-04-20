//Дана строка (получение через обычный текстовый файл!!!)
//
//"фамилия":"Иванов","оценка":"5","предмет":"Математика"
//"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//
//Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет].
//
//Пример вывода в консоль:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
package task_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static String buildStr(String line) {
        if (!line.equals("")) {
            StringBuilder res = new StringBuilder();
            line = line.replaceAll("\"", "");
            String[] lineArr = line.split("\\,");
            res.append("Студент ");
            res.append(lineArr[0].split("\\:")[1]);
            res.append(" получил ");
            res.append(lineArr[1].split("\\:")[1]);
            res.append(" по предмету ");
            res.append(lineArr[2].split("\\:")[1]);
            res.append(".");
            return res.toString();
        } else return "";
    }

    static void readFile(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(buildStr(line));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        readFile("data.txt");
    }
}
