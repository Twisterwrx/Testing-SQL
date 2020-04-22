package swager;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

public class Config {
    @Configuration
    @EnableSwagger2
    public class SpringFoxConfig {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
        }
    }
}
