public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем пользователя с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        // Задача 2
        System.out.println("Задача 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задача 3
        System.out.println("Задача 3");
        int totalPlaces = 102;
        int totalSeats = 60;
        int standingPlaces = totalPlaces - totalSeats;

        int seatsUsed = 45;
        int standUsed = 30;
        if (seatsUsed < totalSeats) {
            System.out.println("Есть ещё " + (totalSeats - seatsUsed) + " сидячих мест");
        }
        if (standUsed < standingPlaces) {
            System.out.println("Есть ещё " + (standingPlaces - standUsed) + " стоячих мест");
        }
        if ((seatsUsed + standUsed) > totalPlaces) {
            System.out.println("Вагон уже полностью забит");
        }

        // Задача 4
        System.out.println("Задача 4");
        int yearsOld = 18;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем пользователя с совершеннолетием");
        }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        // Задача 5
        System.out.println("Задача 5");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задача 6
        System.out.println("Задача 6");
        int totalPlace = 102;
        int totalSeat = 60;
        int standingPlace = totalPlace - totalSeat;

        int seatUsed = 45;
        int standsUsed = 30;
        if (seatUsed < totalSeat) {
            System.out.println("Есть ещё " + (totalSeats - seatUsed) + " сидячих мест");
        }
        if (standUsed < standingPlace) {
            System.out.println("Есть ещё " + (standingPlaces - standsUsed) + " стоячих мест");
        }else if ((seatUsed + standUsed) > totalPlace) {
            System.out.println("Вагон уже полностью забит");
        }

        // Задача 7
        System.out.println("Задача 7");
        int agePerson = 11;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в детский сад");
        } else if (agePerson > 6 && agePerson <= 18) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в школу");
        } else if (agePerson > 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в университет");
        } else if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить на работу");
        }

        // Задача 8
        System.out.println("Задача 8");
        if (agePerson < 5) {
            System.out.println("Если возраст ребёнка " + agePerson + " лет, то он не может кататься на аттракционе");
        } else if (agePerson >= 5 && agePerson <14) {
            System.out.println("Если возраст ребёнка " + agePerson + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (agePerson >= 14) {
            System.out.println("Если возраст ребёнка " + agePerson + " лет, то он может кататься без сопровождения взрослого");
        }

        // Задача 9
        System.out.println("Задача 9");
        int one = 55;
        int two = 11;
        int free = 85;
        if (one > two && one > free) {
            System.out.println("Число " + one + " большее");
        } else if (two > one && two > free) {
            System.out.println("Число " + two + " большее");
        } else if (free > one && free > two) {
            System.out.println("Число " + free + " большее");
        } else if (one == two && one > free) {
            System.out.println("Числа " + one + " и " + two + " равны");
        } else if (one == free && one > two) {
            System.out.println("Числа " + one + " и " + free + " равны");
        } else if (two == free && two < one) {
            System.out.println("Числа " + two + " и " + free + " равны");
        } else if (two == free && two == one) {
            System.out.println("Все числа равны");
        }

    }
}