package week07d03;

import java.util.List;

public class NumberList {
    public boolean isIncreasing(List<Integer> numbers){
        if(numbers.size()<2){
            throw new IllegalArgumentException("At least two numbers needed!");
        }
        for(int i=1;i<numbers.size();i++){
            if(numbers.get(i)<numbers.get(i-1)){
                return false;
            }
        }
    return true;
    }
}
