package jumpToJava.Lambda_Stream;

import java.util.Arrays;
import java.util.Comparator;

public class StreamEX {
    public static void main(String[] args) {
        int[] data = {5,6,4,2,3,1,1,2,2,4,8,9,10,11,12,548,58};

        System.out.println(data);

        int[] result = Arrays.stream(data)//IntStream을 생성함
                .boxed()//IntStream을 Stream<Integer>로 변경해줌..
                .filter((even)->even%2==0)//짜수만 필터링해줌
                .distinct()//중복제거
                .sorted(Comparator.reverseOrder())//역순으로 정렬..
                .mapToInt(Integer::intValue)//Stream<Integer>를 IntStream으로 변경
                .toArray();//IntSream을 int[] 배열로 변경..

        System.out.println(Arrays.toString(result));

    }
}
