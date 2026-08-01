//package org.example.minispringaitool;
//
//import org.example.minispringaitool.invoker.MyMethodInvoker;
//import org.example.minispringaitool.provider.MyToolProvider;
//import org.example.minispringaitool.registry.MyToolRegistry;
//import org.example.minispringaitool.service.WeatherRequest;
//import org.example.minispringaitool.service.WeatherService;
//
//import java.lang.reflect.Method;
//
//public class MyMethodInvokerTest {
//    static void main() throws Exception {
//        WeatherService service = new WeatherService();
//
//        Method method =
//                WeatherService.class.getMethod(
//                        "weather",
//                        WeatherRequest.class);
//
//        MyMethodInvoker invoker =
//                new MyMethodInvoker(
//                        service,
//                        method,
//                        WeatherRequest.class
//                );
//
//
////        WeatherService service =
////                new WeatherService();
////
////
////        MyToolProvider provider =
////                new MyToolProvider();
////
////
////        MyMethodInvoker invoker =
////                provider.create(service);
//
//
//        MyToolRegistry registry =
//                new MyToolRegistry();
//
//        registry.register("weather", invoker);
//
//        String json = """
//                {
//                    "city":"北京"
//                }
//                """;
//
//        Object result =
//                registry.get("weather")
//                        .invoke(json);
//
//        System.out.println(result);
//    }
//
//
//}
