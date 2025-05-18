public class MathOperations {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;


        //Прибавление
        int sum = x + y;
        System.out.println(sum);

        //Вычитание
        int diff = x - y;
        //System.out.println(diff);

        //Умножение
        int multiply = x * y;
          System.out.println(multiply);
        //Деление
        y = 3;
        double divide = (double) x / y;
        System.out.println(divide);


        //Возвидение в степень
        int ext = x * x;
        //System.out.println(ext);

        //Инкремент
        //x = x + 1;
        x++;
//        System.out.println(x);

        //Сокращенная форма записи
//        x +=10;
//        x +=10;
//        x /= 2;

        //Декркмент
        x = x - 1;
        x--;
        System.out.println(x);


        //Остаток деления
        int number = 4;
        // 4 - 2 - 2 = 0
        // 5 - 2 - 2 = 1
        // 7 - 3 - 3 = 1
        int modulo = 7 % 3;
        //System.out.println(modulo);

        //Скобки
        int z = (2 + 2) * 2;
        System.out.println(z);

        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на екран
        double height = 2.03;
        int weight = 100;
        double index = weight / (height * height);
        System.out.println(index);
    }
}
