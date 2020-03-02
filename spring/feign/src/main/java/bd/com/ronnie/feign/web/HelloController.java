package bd.com.ronnie.feign.web;

import bd.com.ronnie.feign.api.QuoteRemoteService;
import bd.com.ronnie.feign.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public final QuoteRemoteService quoteRemoteService;

    @Autowired
    public HelloController(QuoteRemoteService quoteRemoteService) {
        this.quoteRemoteService = quoteRemoteService;
    }

    @GetMapping("random-quote")
    public Quote getRandomQuote() {
        return quoteRemoteService.getRandomQuote();
    }
}
