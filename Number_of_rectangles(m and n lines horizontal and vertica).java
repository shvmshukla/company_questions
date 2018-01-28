//que
Imagine n horizontal lines and m vertical lines.
Some of these lines intersect, creating rectangles.
How many rectangles are there?

For example, if we have 2 horizontal lines
and 3 vertical, there are 3 rectangles.

int rectangles(int n, int m) {
    if(m<2 || n<2)
        return 0;
 return ((m-1)*(m)*(n-1)*(n))/4;
    
    //calculating nC2
/*    int Pn=1,Pm=1;
    for(int i=1;i<=n;i++)
    {
        Pn*=i;
    }
    System.out.println(Pn+"  ");
    for(int i=1;i<=m;i++)
    {
        Pm*=i;
    }
    System.out.println(Pm+"  ");
    int PnMinus2= Pn/((n)*(n-1));
    int PmMinus2= Pm/((m)*(m-1));

    System.out.println(Pn+"  "+Pm+"  "+PnMinus2+"  "+PmMinus2);
  return (Pn / 2 * PnMinus2)*(Pm / 2 * PmMinus2);

*/
}
