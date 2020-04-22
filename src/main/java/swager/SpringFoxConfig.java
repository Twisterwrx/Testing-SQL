package swager;

@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)

public class SpringFoxConfig {
    //...
    @Bean
    public EmailAnnotationPlugin emailPlugin() {
        return new EmailAnnotationPlugin();
    }
}
