package Division;

public class Division {
    public int divide(int dividend, int divisor) {
        /*Знак, частное и маска для выставления битов на частном.*/
        int quotient = 0x00, mask = 0x01;
        /*Для возвращения делителя в исходное состояние.*/
        int temp = divisor;
        /*Знак отрицательный если только одна переменная отрицательная.*/
        int sign = ((dividend < 0)^(divisor < 0)) ? sign = -1 : 1;



        /*Вернуть 0 если делимое меньше делителя.*/
        if (dividend < divisor) return quotient;

        while(dividend > 0 || divisor != 0)
        {
            /*Сдвигать влево пока условие истинно.*/
            if ((dividend >= (divisor << 0x01)) && ((divisor << 0x01) > 0))
            {
                divisor	<<= 0x01;
                mask	<<= 0x01;
            }
            /*Граница обнаружена.*/
            else
            {
                /*В переменной "частное" выставить бит.*/
                quotient = quotient | mask;
                /*Вычесть текущее значение делителя от делимого.*/
                dividend = dividend-divisor;
                /*Возвращаем делитель и маску в исходное положение.*/
                divisor	= temp;
                mask	= 0x01;
            }
        }
        return quotient*sign;
    }
}
