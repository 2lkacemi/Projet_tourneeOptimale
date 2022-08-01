package com.tournee.otimisation;

import java.util.ArrayList;
import java.util.Hashtable;

public class Client {

    //name, distances (name->distance) and list of precursors
    public Integer name;
    public Hashtable<Integer,Integer> distances = new Hashtable<Integer, Integer>();
    public ArrayList<Integer> precursors = new ArrayList<Integer>();
}
