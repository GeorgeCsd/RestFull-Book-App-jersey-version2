package org.example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rs")
public class BasePath extends Application {

    private  final Set<Class<?>> classes;

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }

    public BasePath(){
        Set<Class<?>> c=new HashSet<>();
        try{
            c.add(BookRestService.class);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        classes= Collections.unmodifiableSet(c);
    }

}
