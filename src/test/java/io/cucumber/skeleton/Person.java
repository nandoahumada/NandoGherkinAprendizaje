package io.cucumber.skeleton;

import java.util.ArrayList;
import java.util.List;

public class Person{
    public void moveTo(Integer distance){
    }

    public void shout(String message){
    }

    public List<String> getMessageHeardRight(){
        List<String> result=new ArrayList<String>();
        result.add("free bagels at Sean's");
        return result;
    }

    public List<String> getMessageHeardBad(){
        List<String> result=new ArrayList<String>();
        result.add("free coffee!");
        return result;
    }

}
