package boot.config;

import boot.bean.Pet;
import boot.converter.GuiguMessageConverter;
import javafx.scene.effect.PerspectiveTransform;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.accept.ParameterContentNegotiationStrategy;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @fileName: WebConfig
 * @description:
 * @author: Kelton
 * @create: 2022-06-14 21:32
 **/
@Configuration
public class WebConfig {

    /**
     * 定制化SpringMVC的功能
     *
     * @return
     */
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, Pet>() {

                    @Override
                    public Pet convert(String source) {
                        // 啊猫,3
                        if (!StringUtils.isEmpty(source)) {
                            Pet pet = new Pet();
                            String[] split = source.split(",");
                            pet.setName(split[0]);
                            pet.setAge(Integer.parseInt(split[1]));
                            return pet;
                        }
                        return null;
                    }
                });
            }

            @Override
            public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
                converters.add(new GuiguMessageConverter());
            }

            @Override
            public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
                //Map<String, MediaType> mediaTypes
//                Map<String, MediaType> mediaTypes = new HashMap<>();
//                mediaTypes.put("json", MediaType.APPLICATION_JSON);
//                mediaTypes.put("xml",MediaType.APPLICATION_XML);
//                //自定义媒体类型
//                mediaTypes.put("gg",MediaType.parseMediaType("application/x-guigu"));
                //指定支持解析哪些参数对应的哪些媒体类型
                configurer.mediaType("gg", MediaType.parseMediaType("application/x-guigu"));
//                ParameterContentNegotiationStrategy parameterStrategy = new ParameterContentNegotiationStrategy(mediaTypes);
////                parameterStrategy.setParameterName("ff");
//
//                //还需添加请求头处理策略，否则accept:application/json、application/xml则会失效
//                HeaderContentNegotiationStrategy headeStrategy = new HeaderContentNegotiationStrategy();
//
//                configurer.strategies(Arrays.asList(parameterStrategy, headeStrategy));
            }
        };
    }
}
