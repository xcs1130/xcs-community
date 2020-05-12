package com.xcs.community;

import java.io.IOException;

/**
 * @author xcs
 * @create 2020-05-09 8:48
 */

public class WkTests {

    public static void main(String[] args) {
        String cmd = "G:/developer_tools/wkhtmltopdf/bin/wkhtmltoimage --quality 75  https://www.nowcoder.com d:/work/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
