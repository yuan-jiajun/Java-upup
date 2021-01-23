package projects.dpi.serialized;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name = "yuanjiajun";
    private String identify = "768747811";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
}