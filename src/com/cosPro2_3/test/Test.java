/**
 *
 */
package com.cosPro2_3.test;

import java.util.HashMap;
import java.util.Map;


public  class Test {


    public static void main(String[] args) {
        Object ob = new Object();
        Map<String,Object> contextValue = new HashMap<String,Object>();
        initProcess();
        contextValue = EEDContextUtil.getCTX_TRX_INFO();

        System.out.println("2. contextValue = " + contextValue);

        contextValue.put("EMP_NO" , "1111111");
        contextValue.put("BR_NO" , "0111");

        System.out.println("3. contextValue = " + contextValue);
        System.out.println("4. EEDContextUtil.getCTX_TRX_INFO() = " + EEDContextUtil.getCTX_TRX_INFO());
        System.out.println("====SHALLOW COPY=====");
        System.out.println("5 contextValue == EEDContextUtil.getCTX_TRX_INFO() ? " + contextValue.equals(EEDContextUtil.getCTX_TRX_INFO()));


    }

    private static void initProcess() {
        Map<String,Object> contextValue = new HashMap<String,Object>();
        contextValue.put("EMP_NO" , "0000000");
        contextValue.put("BR_NO", "0000");
        EEDContextUtil.setMapCTX_TRX_INFO(contextValue);
        System.out.println("1. contextValue = " + contextValue);


    }


}

class EEDContextUtil{
    private static Map<String, Object> mapCTX_TRX_INFO;

    public static Map<String,Object> getCTX_TRX_INFO(){
        return mapCTX_TRX_INFO;

    }

    public static void setMapCTX_TRX_INFO(Map<String,Object> contextValue) {
        mapCTX_TRX_INFO = contextValue;
    }
}

class CopyUtil{
    private Map<String,Object> mapCopy ;

    public CopyUtil(){
    }

    public CopyUtil(CopyUtil copyUtil){
        this.mapCopy = copyUtil.mapCopy;
    }

    public static CopyUtil copy(CopyUtil copyUtil){
        CopyUtil copyUtil1 = new CopyUtil();
        copyUtil1.mapCopy = copyUtil.mapCopy;
        return copyUtil1;
    }

}