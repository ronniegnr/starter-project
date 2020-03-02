package bd.com.ronnie.feign.api;

import bd.com.ronnie.feign.model.Quote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "quoteService", url = "https://gturnquist-quoters.cfapps.io/api/")
public interface QuoteRemoteService {

    @GetMapping("random")
    Quote getRandomQuote();

}
