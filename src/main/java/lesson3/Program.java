package lesson3;

import lesson3.sample01.Fixed;
import lesson3.sample01.Hourly;

public class Program {

    public static void main(String[] args) {

        Fixed[] fixeds = new Fixed[]{
                new Fixed("Василий", "Иванович", 25, "white", false, 3),
                new Fixed("Сергей", "Павлович", 36, "white", false,3),
                new Fixed("Юрий", "Егорович", 37, "black", false,3),
        };

        Hourly[] hourlies = new Hourly[]{
                new Hourly("Ерофей", "Павлович", 21, "white", true,3),
                new Hourly("Андрей", "Епифаньевич", 46, "white", true,3),
                new Hourly("Гематоген", "Бутербродович", 97, "black", true,3),
        };

        for (Hourly hourly: hourlies) {
            System.out.println(hourly);
        }
        for (Fixed fixed: fixeds) {
            System.out.println(fixed);
        }

    }
}