Feign Client
---

1. Feign is a declarative REST-client. It encapsulates remote calling inside interface methods.
1. _spring-cloud-started-openfeign_ needed in dependency section and _spring-cloud-dependencies_ needed in dependencyManagement section.
1. _@EnableFeignClients_ is added in main class (FeignApplication.java). With this annotation we enable component scanning for interfaces which are Feign clients.
1. _@FeignClient_ annotation is added in QuoteRemoteService. The _value_ argument passed in the _@FeignClient_ annotation is a mandatory, arbitrary client name, while with the _url_ argument, we specify the API base URL.
1. This Service method is used in _HelloController_.
1. Run the project using _mvn spring-boot:run_ command.