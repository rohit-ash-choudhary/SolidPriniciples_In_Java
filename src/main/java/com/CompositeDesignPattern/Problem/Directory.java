package com.CompositeDesignPattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String DirectoryName;
    List<Object> objectList;

    public Directory(String name)
    {
        this.DirectoryName=name;
        objectList=new ArrayList<>();
    }

    public void add(Object object)
    {
        objectList.add(object);
    }

    public void ls(){
        System.out.println("Directory name : "+ DirectoryName );
        for(Object obj :objectList)
        {
            if(obj instanceof File){
                 ((File) obj).ls();
            } else if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }

}
