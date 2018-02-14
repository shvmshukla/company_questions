/*Find all sets of length k formed from the numbers 1, 2, 3, ... n that sum up to n.
@codefights challenge
Example
For n = 5 and k = 2, the output should be
nckSum(n, k) = [[1, 4], [2, 3]].
All possible sets with length 2:
[[4, 5], [2, 3], [2, 4], [2, 5], [3, 4], [1, 2], [3, 5], [1, 3], [1, 4], [1, 5]].
Sets that sum up to 5:
[[1, 4], [2, 3]].

*/

List l = new ArrayList();
List nckSum(int n, int k) {
    f(new ArrayList(), k, n, 0);
    return l;
}
void f(List m, int k, int t, int d){
    if(k == 0 & t < 1)
        l.add(new ArrayList(m));
    else
        for(;d++ < t;){
            m.add(d);
            f(m, k-1, t-d, d);
            m.remove(m.size()-1);
        }
}
