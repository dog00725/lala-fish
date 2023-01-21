package com.lianlian.loan.loansecuritydata.common.utils;

import com.lianlian.loan.loansecuritydata.service.sftp.SftpConfig;
import com.lianlian.loan.loansecuritydata.service.sftp.SftpConfigFactory;

import java.io.File;
import java.io.IOException;


/**
 * @Author: huqs
 * @Date: 2022/3/10 17:35
 */
public class SftpUtilTest {//extends TestSupport {

//    @Test
    public void testconnect() throws IOException {
        SftpConfig sftpConfig = SftpConfigFactory.getSftpConfig("creditReport");
        SftpUtil sftpUtil = new SftpUtil(sftpConfig.getHost(),sftpConfig.getUserName(),sftpConfig.getPassword());
        sftpUtil.connect();
        sftpUtil.upload(new File("C:\\Users\\huqs\\Desktop\\test.png"),"test5.png","/home/opt/llzx/2022/03/18");
        sftpUtil.close();
    }

//    @Test
    public void testCreate() throws IOException {
        File file = new File("C:\\Users\\huqs\\Desktop\\aaa\\");
//        System.out.println(file.exists());

//        file.getPath();
        file.mkdir();
        File file2 = new File("C:\\Users\\huqs\\Desktop\\aaa\\test.png");
//        file2.mkdir();
//        System.out.println(file.exists());
        MyFileUtils.createFile(file2);
    }

}
