package lesson4;

public class Practise {
    public static void main(String[] args) {
        //Практическое задание
        //Проверить роботоспособность машины: двигатель(Engine) трансмиссия(Transmission) - работают,
        // и хотя бы 3 колеса из 4 не проколоты
        //Если машина роботаспособна - вывести на екран - машина готова експлуатация
        //Если машина НЕроботаспособна - вывести на екран - машина сломана
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;
        int countFineWheels = 0;
        countFineWheels += isFineWheel1 ? 1 : 0;
        countFineWheels += isFineWheel2 ? 1 : 0;
        countFineWheels += isFineWheel3 ? 1 : 0;
        countFineWheels += isFineWheel4 ? 1 : 0;

        if (isWorkEngine && isWorkTransmission && (countFineWheels >=3)) {
            System.out.println("Машина готоват к экспулатация");
        } else {
            System.out.println("Customize Toolbar");
        }


    }
}
