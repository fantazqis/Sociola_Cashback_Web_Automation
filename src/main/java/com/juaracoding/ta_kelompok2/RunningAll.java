package com.juaracoding.ta_kelompok2;

import io.cucumber.core.cli.Main;

public class RunningAll {
    public static void main(String[] args) {
        System.out.println("ARGS[0] ---> "+args[0]);
        System.out.println("ARGS[1] ---> "+args[1]);
//        int loop = Integer.parseInt(args[0]);
////        int loop = 2;
//        for (int i = 0; i < loop; i++) {
//        }
//        String strUrl = args[0];
//        String strPathDoc = args[1];
//        String strPathOCR = args[2];
//        String strBrowser = args[3];
//        String strDelay = args[4];
//        String strTimeOut = args[5];
//        String strPathOpenCV = args[6];
//        String strUserN = args[7];
//        String strPwd = args[8];
//
//        new BaseConfig(Integer.parseInt(strTimeOut),Integer.parseInt(strDelay),
//                strUrl,strBrowser,strPathDoc,strPathOpenCV,strPathOCR,strUserN,strPwd);
//        ConfigSupport.getArgsRunner(args);

        try {
//            System.out.println("Path User Dir -> "+System.getProperty("user.dir"));
            Main.main(new String[]
                    {
                            "-g","com.juaracoding.takelompok1.impl",
                            "classpath:features",
                            "-p","pretty",
                            "-p","html:data-report/PTA/htmlreport/LoginRunnerOutline.html",
                            "-p","json:data-report/PTA/jsonreport/LoginRunnerOutline.json",
                            "-p","junit:data-report/PTA/junitreport/LoginRunnerOutline.xml",
                            "-m"
                    });
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Main Class Execption : "+e);
        }

    }
}