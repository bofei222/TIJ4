package net.mindview.util;

import java.util.HashMap;
import java.util.Map;

public class TypeCounter extends HashMap<Class<?>,Integer> {
    private Class<?> baseType;
    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }
    public void count(Object obj) {
        Class<?> type = obj.getClass();
        if (!baseType.isAssignableFrom(type)) // 判断是不是这个类型  
            throw new RuntimeException(obj + " incorrect type: "
                + type + ", should be type or sbutype of "
                +baseType);
        countClass(type);
    }
    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);
        // 得到父类,引用  
        Class<?> superClass = type.getSuperclass();
        if (superClass != null &&
                baseType.isAssignableFrom(superClass))
            countClass(superClass); // 递归，父类型也会加1
    }
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for(Map.Entry<Class<?>,Integer> pair : entrySet()) {
          result.append(pair.getKey().getSimpleName());
          result.append("=");
          result.append(pair.getValue());
          result.append(", ");
        }
        result.delete(result.length()-2, result.length());
        result.append("}");
        return result.toString();
        
    }
}