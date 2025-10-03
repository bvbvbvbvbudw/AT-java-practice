package aqa_course.task5;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.io.Serializable;
import java.util.List;

public class FruitBasket implements Serializable {
    @JacksonXmlElementWrapper(localName = "fruits")
    @JacksonXmlProperty(localName = "fruit")
    private List<String> fruits;
    private boolean tasty;
    private String type;

    public List<String> getFruits() { return fruits; }
    public void setFruits(List<String> fruits) { this.fruits = fruits; }
    public boolean isTasty() { return tasty; }
    public void setTasty(boolean tasty) { this.tasty = tasty; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String toString() {
        return "FruitBasket{" + "fruits=" + fruits + ", isTasty=" + tasty + ", type='" + type + '\'' + '}';
    }
}