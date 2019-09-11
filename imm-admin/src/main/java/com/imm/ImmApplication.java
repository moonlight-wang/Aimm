package com.imm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author imm
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.imm.*.mapper")
public class ImmApplication
{
    public static void main(String[] args)
    {
//         System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ImmApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  IMM启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "                  ___           ___     \n" +
                "    ___          /__/\\         /__/\\    \n" +
                "   /  /\\        |  |::\\       |  |::\\   \n" +
                "  /  /:/        |  |:|:\\      |  |:|:\\  \n" +
                " /__/::\\      __|__|:|\\:\\   __|__|:|\\:\\ \n" +
                " \\__\\/\\:\\__  /__/::::| \\:\\ /__/::::| \\:\\\n" +
                "    \\  \\:\\/\\ \\  \\:\\~~\\__\\/ \\  \\:\\~~\\__\\/\n" +
                "     \\__\\::/  \\  \\:\\        \\  \\:\\      \n" +
                "     /__/:/    \\  \\:\\        \\  \\:\\     \n" +
                "     \\__\\/      \\  \\:\\        \\  \\:\\    \n" +
                "                 \\__\\/         \\__\\/    ");
    }
}