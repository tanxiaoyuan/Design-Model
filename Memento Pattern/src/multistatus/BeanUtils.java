package multistatus;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
    public static HashMap<String, Object> backup(Object bean){
        HashMap<String, Object> result = new HashMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for(PropertyDescriptor descriptor: descriptors){
                String fieldName = descriptor.getName();
                Method getter = descriptor.getReadMethod();
                Object value = getter.invoke(bean, new Object[]{});
                if(!fieldName.equalsIgnoreCase("class")){
                        result.put(fieldName, value);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void restoreProp(Object bean, HashMap<String, Object> propMap){
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for(PropertyDescriptor descriptor: descriptors){
                String fieldName = descriptor.getName();
                if(propMap.containsKey(fieldName)){
                    Method setter = descriptor.getWriteMethod();
                    setter.invoke(bean, propMap.get(fieldName));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
