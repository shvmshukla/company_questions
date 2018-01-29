//Find the last digit of n!(factorial), which is different from zero.

int lastDigitDiffZero(long n) {
long g = 1;
    for(;n>0;n--){
        g = g * n;
        while(g % 10 < 1){
            g = g / 10;
        }
        g = g % 10000000;
    }
    return  (int)(g % 10);
}
