/**
 * @Author: huqs
 * @Date: 2021/5/25 11:27
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class},
        scanBasePackageClasses={Application.class, AutoconfigPackage.class})
public class Applcation {
}
