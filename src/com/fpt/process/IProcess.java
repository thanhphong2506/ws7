package com.fpt.process;

import com.fpt.base.Animal;

public interface IProcess {
    boolean add(Animal x);
    Animal update(String id);
    Animal delete (String id);
    Animal find (String id);

}
