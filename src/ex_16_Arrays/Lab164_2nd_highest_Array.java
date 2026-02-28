package ex_16_Arrays;

public class Lab164_2nd_highest_Array {
    public static void main(String[] args) {
        int[] numbers = {12,45,67,23,89,45,89};
        int highest = 0;
        int secondhighest = 0;

        //this is for each loop
        for (int num: numbers) {
            //here num will take one by one number from numbers array
            //for first time it is run 12>0 - sh=h (i.e. sh =0) - h=n (i.e h=12)
            //for second time it is run 45>12 - sh=h (i.e. sh=12) - h=n (i.e h=45)
            //for third time it is run 67>45 - sh=h (i.e. sh=45) - h=n (i.e. h=67)
            //for fourth time it is 23>67 - exit
            //for fifth time it is 89>67 - sh=h(i.e sh=67) - h=n(i.e. h=89)
            //for sixth timw it is 45>89 - exit
            //for seventh time it is 89>89 - exit
            if(num > highest)
            {
                secondhighest = highest;
                highest = num;
            }
            //{12,45,67,23,89,45,89,74};
            //if the array is like this
            //in above if loop eight time it is 74>89 - exit , but this is the secondhighest num
            //and it is missed
            //so edge case else if loop
            //i.e. 74>67 && 74!=89 - then - sh=74
            else if (num>secondhighest && num!=highest)
            {
                secondhighest = num;
            }
        }
        System.out.println(secondhighest);
        System.out.println(highest);
    }
}
