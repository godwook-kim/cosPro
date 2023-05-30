package com.cosPro2_3.test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class TestUtil {
    public static void main(String[] args) {
        String EMP_NO = findKey_STRING("EMP_NO");
        System.out.println("EMP_NO = " + EMP_NO);
        int SEQ_NO = findKey_NUMBER("SEQ_NO");
        System.out.println("SEQ_NO = " + SEQ_NO);
        System.out.println(findkey("EMP_NO"));
        System.out.println(findkey("EMP_NM"));
        System.out.println(findkey("SEQ_NO"));
    }
    public static Object findkey(String str){
        Object obj = new Object();
        switch(str){
            case "EMP_NO" : case "EMP_NM" :
                obj = findKey_STRING(str);
                break;
            case "SEQ_NO" :
                obj = findKey_NUMBER(str);
                break;
        }
        return obj;
    }
    public static String findKey_STRING(String str){
        String TestClass = "com.cosPro2_1.test.HeaderUtil";
        String methodName = "get"+str;
        String retStr     = "";
        try{
            Class testClass = Class.forName(TestClass);
            Object newObj   = testClass.newInstance();
            Method m  = testClass.getMethod(methodName);
            retStr = (String) m.invoke(newObj);
            //System.out.println("retstr = " + retstr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {            e.printStackTrace();
        } catch (IllegalAccessException e) {            e.printStackTrace();
        } catch (NoSuchMethodException e) {            e.printStackTrace();
        } catch (InvocationTargetException e) {            e.printStackTrace();
        }
        return retStr;
    }
    public static int findKey_NUMBER(String str){
        String TestClass = "com.cosPro2_1.test.HeaderUtil";
        String methodName = "get"+str;
        int retInt = 0 ;
        try{
            Class testClass = Class.forName(TestClass);
            Object newObj   = testClass.newInstance();
            Method m  = testClass.getMethod(methodName);
            retInt = (int) m.invoke(newObj);
            //System.out.println("retstr = " + retstr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return retInt;
    }
}
