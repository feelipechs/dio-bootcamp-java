// package dio.web.api.doc;

// import java.util.Arrays;
// import java.util.HashSet;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.Contact;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {
//     private Contact contato() {
//         return new Contact(
//                 "Seu nome",
//                 "http://www.seusite.com.br",
//                 "voce@seusite.com.br");
//     }

//     private ApiInfoBuilder informacoesApi() {

//         ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

//         apiInfoBuilder.title("Title - Rest API");
//         apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
//         apiInfoBuilder.version("1.0");
//         apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
//         apiInfoBuilder.license("Licença - Sua Empresa");
//         apiInfoBuilder.licenseUrl("http://www.seusite.com.br");
//         apiInfoBuilder.contact(this.contato());

//         return apiInfoBuilder;

//     }

//     @Bean
//     public Docket detalheApi() {
//         Docket docket = new Docket(DocumentationType.SWAGGER_2);

//         docket
//                 .select()
//                 .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
//                 .paths(PathSelectors.any())
//                 .build()
//                 .apiInfo(this.informacoesApi().build())
//                 .consumes(new HashSet<String>(Arrays.asList("application/json")))
//                 .produces(new HashSet<String>(Arrays.asList("application/json")));

//         return docket;
//     }
// }
package dio.web.api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Title - Rest API")
                        .description("API exemplo de uso de Springboot REST API")
                        .version("v1.0")
                        .contact(new Contact().name("Seu nome").url("http://www.seusite.com.br")
                                .email("voce@seusite.com.br"))
                        .license(new License().name("Licença - Sua Empresa").url("http://www.seusite.com.br")))
                .externalDocs(new ExternalDocumentation()
                        .description("Termo de uso: Open Source")
                        .url("http://www.seusite.com.br"));
    }
}
