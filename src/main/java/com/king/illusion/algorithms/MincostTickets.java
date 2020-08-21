package com.king.illusion.algorithms;

/**
 * 983. 最低票价
 * 在一个火车旅行很受欢迎的国度，你提前一年计划了一些火车旅行。
 * 在接下来的一年里，你要旅行的日子将以一个名为 days 的数组给出。每一项是一个从 1 到 365 的整数。
 *
 * 1 <= days.length <= 365
 * 1 <= days[i] <= 365
 * days 按顺序严格递增
 * costs.length == 3
 * 1 <= costs[i] <= 1000
 *
 */

public class MincostTickets {

    public static int mincostTickets(int[] days, int[] costs) {
        int dayLen = days.length, maxDay = days[dayLen-1], minDay = days[0];
        int DP[] = new int[maxDay + 30 + 1];
        for (int d = maxDay, i = dayLen-1;d >= minDay;d--) {
            //当天出行
            if(d == days[i]){
                DP[d] = Math.min(costs[0]+DP[1+d],costs[1]+DP[7+d]);
                DP[d] = Math.min(DP[d],costs[2]+DP[30+d]);
                i--;
            }else{
                DP[d] = DP[d+1];
            }
        }
        return DP[minDay];
    }

    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,366}, costs = {2,7,15};
        int a = mincostTickets(days,costs);
        System.out.println(a);
    }

}
