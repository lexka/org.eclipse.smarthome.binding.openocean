package org.eclipse.smarthome.binding.openocean.api.profiles;

import java.util.ArrayList;

public class FunctionGroups extends Functions {

    private ArrayList<Functions> functions = null;

    private String direction = null;

    private String title = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Functions> getFunctions() {
        return functions;
    }

    public void setFunctions(ArrayList<Functions> functions) {
        this.functions = functions;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "ClassPojo [functions = " + functions + ", direction = " + direction + "]";
    }
}